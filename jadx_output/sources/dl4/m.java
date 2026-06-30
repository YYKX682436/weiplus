package dl4;

/* loaded from: classes11.dex */
public class m implements p11.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f235433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f235434b;

    public m(int i17, int i18) {
        this.f235433a = 0;
        this.f235434b = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.imageload.TingImageDownloader", "TingImageDownloader#%s connectTimeout:%s, readTimeout:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f235434b = i17;
        this.f235433a = i18;
    }

    @Override // p11.c
    public q11.b b(java.lang.String str) {
        try {
            return dl4.l.a(str, this.f235434b, this.f235433a);
        } catch (java.net.ConnectException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.imageload.TingImageDownloader", e17, "getImageData exception", new java.lang.Object[0]);
            return new q11.b(null, null);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.imageload.TingImageDownloader", e18, "getImageData exception", new java.lang.Object[0]);
            return new q11.b(null, null);
        }
    }
}
