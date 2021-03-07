/* JUST IMPORT THE SAME STUFF FROM POST-requests.java*/
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:5500/test.html"))
            .build();
        HttpResponse<String> response = client.send(request,
        HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

// Should output the following
/*
<!DOCTYPE html>
<html>
   <head>
      <title>Webpage</title>
   </head>
   <body>
      <h1>Hey there! This is a webpage, this was made to test GET requests in Java!</h1>
      <p>Yup that's right...</p>
   </body>
</html>
*/
