package y73;

@j95.b
/* loaded from: classes11.dex */
public class a0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f459699d = true;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.hp.model.TinkerBootsActivateListener f459700e = new com.tencent.mm.plugin.hp.model.TinkerBootsActivateListener();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        this.f459700e.alive();
        b83.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        try {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG;
            long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - longValue >= 3600000) {
                int i17 = java.util.Calendar.getInstance().get(11);
                com.tencent.mars.xlog.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update hour %d ", java.lang.Integer.valueOf(i17));
                if (i17 == 0) {
                    int nextInt = new java.util.Random().nextInt(60);
                    currentTimeMillis = (currentTimeMillis - (com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12) * 3600000)) + (nextInt * 60000);
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.mars.xlog.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update after %d minute currentTime %s lastUpdate %s", java.lang.Integer.valueOf(nextInt), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longValue));
                } else {
                    fy5.a.d().a(true);
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.mars.xlog.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update true when onAccountPostReset. current:%d lastUpdate:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(longValue));
                }
            } else {
                fy5.a.d().a(this.f459699d);
                com.tencent.mars.xlog.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update false when onAccountPostReset.");
            }
            this.f459700e.getClass();
            com.tencent.mm.plugin.hp.model.TinkerBootsActivateListener.f142402d = currentTimeMillis;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.SubCoreHotpatch", e17, "", new java.lang.Object[0]);
        }
        if (com.tencent.mm.sdk.platformtools.x2.r()) {
            return;
        }
        com.tencent.mm.app.n2 n2Var = com.tencent.mm.app.m2.f53515a;
        synchronized (n2Var) {
            if (!n2Var.f53525a) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[!] Uninitialized or install failed, reportStats will be ignored.");
                return;
            }
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_ensurance_info", 4);
            if (!n2Var.c() && n2Var.d()) {
                jx3.f.INSTANCE.idkeyStat(338L, 231L, 1L, false);
                sharedPreferences.edit().putInt(lp0.a.f320249c + "_clean_patch_reported", 1).apply();
            }
            if (!n2Var.b() && !n2Var.a()) {
                jx3.f.INSTANCE.idkeyStat(338L, 232L, 1L, false);
                sharedPreferences.edit().putInt(lp0.a.f320249c + "_block_apply_patch_reported", 1).apply();
            }
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        this.f459700e.dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        q25.b.b(new y73.p0(), "//tinker");
    }
}
