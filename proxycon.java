public String fetchUrl(String url) throws IOException {
    URL u = new URL(url);
    HttpURLConnection conn = (HttpURLConnection) u.openConnection();
    try (InputStream in = conn.getInputStream()) {
        return new String(in.readAllBytes(), StandardCharsets.UTF_8);
    }
}
