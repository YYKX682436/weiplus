package g10;

/* loaded from: classes5.dex */
public final class u implements k10.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10.v f267551a;

    public u(g10.v vVar) {
        this.f267551a = vVar;
    }

    public void a(java.lang.String error) {
        kotlin.jvm.internal.o.g(error, "error");
        com.tencent.mars.xlog.Log.w("MicroMsg.MagicEcsNirvanaFeatureService", "hy: on fail with error: ".concat(error));
        ((ku5.t0) ku5.t0.f312615d).B(new g10.t(error));
    }

    public void b(com.tencent.mm.vfs.r6 wspkgFile, java.lang.String bizName, int i17, java.lang.String ecsExt) {
        kotlin.jvm.internal.o.g(wspkgFile, "wspkgFile");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(ecsExt, "ecsExt");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: on success with file length: " + com.tencent.mm.vfs.w6.k(wspkgFile.o()) + ", bizName: " + bizName);
        m45.b.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand1");
        this.f267551a.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new g10.k(bizName, wspkgFile));
    }
}
