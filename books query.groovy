books (filters: {ISBN: {eq: "0743273567"} }){
    data {
      attributes {
        published
        title
        pages
        publisher
        reviews (pagination: {limit: 2}) {
          data {
            attributes {
              author
              date
              content
            }
          }
        }
      }
    }
  }



  books(filters:  { ISBN: {eq: "0743273567"} }) {
    data {
      attributes {
        title
        author
        published
        publisher
        pages
        genres {
          data {
            attributes {
              name
            }
          }
        }
        reviews(pagination: {limit: 1}) {
          data {
            attributes {
              author
            }
          }
        }
      }
    }
  }

  # Write your query or mutation here
{
  books (filters: {ISBN: {eq: "0743273567"}}) {
    data {
      attributes {
        title
        author
        published
        publisher
        pages
        genres {
          data {
            attributes {
              name
            }
          }
        }
        reviews (pagination: {limit:1}) {
          data {
            attributes {
              author, 
              date,
              content
            }
          }
        }
      }
    }
  }
}