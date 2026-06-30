package rc;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final org.chromium.net.CronetEngine f393907a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f393908b;

    public c(rc.a aVar) {
        boolean z17;
        java.lang.String i17 = com.tencent.mm.vfs.w6.i("wcf://WxaChromiumCronetCache/", true);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(i17);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            z17 = true;
        } else {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            z17 = !m18.a() ? false : m18.f213266a.r(m18.f213267b);
        }
        org.chromium.net.CronetEngine.Builder builder = new org.chromium.net.CronetEngine.Builder(com.tencent.mm.sdk.platformtools.x2.f193071a);
        builder.enableBrotli(true).enableHttp2(true).enableQuic(true).enableHttpCache(0, 524288000L).addQuicHint("launchwxacode.wxqcloud.qq.com.cn", com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX, com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX);
        if (z17) {
            builder.setStoragePath(i17);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.CronetGlobalEngine", "make cache dir failed. disable cronet storage path");
        }
        org.chromium.net.CronetEngine build = builder.build();
        this.f393907a = build;
        ((qo.c) ((qo.m) i95.n0.c(qo.m.class))).getClass();
        java.util.concurrent.Executor a18 = qo.q.f365321a.a("MicroMsg.CronetGlobalEngine", null);
        this.f393908b = a18;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            build.addRequestFinishedListener(new rc.a(this, a18));
        }
    }
}
