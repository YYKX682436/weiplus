package pk1;

/* loaded from: classes12.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.f0 f355444d = new pk1.f0();

    public f0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String downloadId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "cancel by video play downloadId:".concat(downloadId));
        pk1.g0 g0Var = pk1.g0.f355447d;
        pk1.d0[] d0VarArr = pk1.d0.f355438d;
        g0Var.a(downloadId, 2);
        return jz5.f0.f302826a;
    }
}
