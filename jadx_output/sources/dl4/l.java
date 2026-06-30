package dl4;

/* loaded from: classes11.dex */
public abstract class l {
    public static q11.b a(java.lang.String str, int i17, int i18) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        com.tencent.mars.xlog.Log.i("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", "openConnection %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 <= 0) {
            i17 = 15000;
        }
        httpURLConnection.setConnectTimeout(i17);
        if (i18 <= 0) {
            i18 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
        }
        httpURLConnection.setReadTimeout(i18);
        java.io.InputStream inputStream = null;
        if (httpURLConnection.getResponseCode() >= 300) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e17.getMessage());
            }
            httpURLConnection.disconnect();
            com.tencent.mars.xlog.Log.w("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", "dz[httpURLConnectionGet 300]");
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
            java.lang.String contentType = httpURLConnection.getContentType();
            byte[] d17 = com.tencent.mm.modelimage.loader.impr.f.d(inputStream, 0L, false);
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e18.getMessage());
            }
            httpURLConnection.disconnect();
            q11.b bVar = new q11.b(d17, contentType);
            try {
                inputStream.close();
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e19, "httpURLConnectionGet exception", new java.lang.Object[0]);
            }
            return bVar;
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e27, "httpURLConnectionGet exception", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }
}
