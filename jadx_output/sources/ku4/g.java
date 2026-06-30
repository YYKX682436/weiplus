package ku4;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ku4.g f312512d = new ku4.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Long valueOf = java.lang.Long.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_open_biz_trigger_download_pkg_interval_v2, 3600000L));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", "download pkg interval " + valueOf.longValue());
        return valueOf;
    }
}
