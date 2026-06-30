package h8;

/* loaded from: classes7.dex */
public class a implements h8.c {

    /* renamed from: a, reason: collision with root package name */
    public int f279509a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: b, reason: collision with root package name */
    public int f279510b = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    @Override // h8.c
    public java.lang.String a() {
        return "http";
    }

    @Override // h8.c
    public boolean accept(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        java.lang.String str = (java.lang.String) obj;
        return str.startsWith("http://") || str.startsWith("https://");
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        h8.b bVar = new h8.b();
        try {
            java.net.URLConnection openConnection = new java.net.URL((java.lang.String) obj).openConnection();
            openConnection.setReadTimeout(this.f279510b);
            openConnection.setConnectTimeout(this.f279509a);
            bVar.f279511a = new java.io.BufferedInputStream(openConnection.getInputStream());
        } catch (java.net.SocketTimeoutException e17) {
            bVar.f279512b = "http请求超时";
            g8.g.a("NativeImageHttpFetcher", "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]", obj, java.lang.Integer.valueOf(this.f279509a), java.lang.Integer.valueOf(this.f279510b), e17.toString());
        } catch (java.lang.Exception e18) {
            bVar.f279512b = "http请求出现错误";
            g8.g.a("NativeImageHttpFetcher", "fetch error. path = [%s], error = [%s]", obj, e18.toString());
        }
        return bVar;
    }
}
