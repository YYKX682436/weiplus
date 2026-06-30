package f21;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static f21.c f258844f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f258845d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f258846e = 3;

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigListUpdater", "isUpdateing : " + this.f258845d);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigListUpdater", "isSDCardAvailable : " + gm0.j1.u().l());
        if (this.f258845d || !gm0.j1.u().l()) {
            return;
        }
        this.f258845d = false;
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        this.f258845d = true;
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        ip.e a17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
        f21.i0[] D0 = f21.r0.Bi().D0(7);
        if (D0.length != 0) {
            a17.getClass();
            if (!com.tencent.mm.vfs.w6.j(ip.e.c(1))) {
                f21.r0.Bi().n0(7);
                com.tencent.mars.xlog.Log.w("MicroMsg.ConfigListUpdater", "config file not exist, delete packageInfo, packageInfo size=" + D0.length);
            }
        }
        gm0.j1.n().f273288b.g(new f21.g0(7));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 159) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConfigListUpdater", "getPackageList sceneEnd, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 0 && i18 == 0) {
                gm0.j1.u().c().w(81938, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            } else {
                int i19 = this.f258846e - 1;
                this.f258846e = i19;
                if (i19 < 0) {
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    c17.w(81938, java.lang.Long.valueOf(((java.lang.System.currentTimeMillis() - 86400000) + 3600000) / 1000));
                    this.f258846e = 3;
                }
            }
            this.f258845d = false;
            gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        }
    }
}
