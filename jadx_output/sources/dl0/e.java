package dl0;

@j95.b
/* loaded from: classes13.dex */
public class e extends i95.w implements xs.c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Runnable f235166d = new dl0.g();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        boolean z17 = false;
        if ((com.tencent.mm.sdk.platformtools.z.f193115k || kl0.a.a()) && com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_plugin_kara_open", "1", false, true), 0) != 0) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KaraFeatureService", "expt 0");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KaraFeatureService", "PluginKara execute");
        d95.b0 b0Var = nl0.e.f338164a;
        java.lang.String str = gm0.j1.u().h() + "KaraCore.db";
        com.tencent.mars.xlog.Log.i("MicroMsg.KaraFeatureService", "pluginKara cacheDbPath = %s", str);
        d95.b0 b17 = nl0.e.b();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1528336687, new dl0.e$$a());
        hashMap.put(91360208, new dl0.e$$b());
        hashMap.put(275963628, new dl0.e$$c());
        if (b17.S(str, hashMap, true, true)) {
            nl0.c.b();
            ((ku5.t0) ku5.t0.f312615d).q(ml0.e.f327188b.f327185a);
            ((ku5.t0) ku5.t0.f312615d).q(ml0.c.f327186b.f327185a);
            ((ku5.t0) ku5.t0.f312615d).q(ml0.d.f327187b.f327185a);
            ((s85.a) xl0.a.f455101e).b(xl0.a.f455100d);
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = f235166d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(runnable, 15000L, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.KaraFeatureService", "dataDB.initDb fail, cacheDbPath = %s", str);
        }
        gl0.c.f272794a = new dl0.f(this);
    }
}
