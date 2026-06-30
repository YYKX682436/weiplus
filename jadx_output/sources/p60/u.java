package p60;

@j95.b
/* loaded from: classes7.dex */
public final class u extends i95.w implements p60.x {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f352199g = com.tencent.mm.sdk.platformtools.o4.M("PluginGameLive");

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f352200d = jz5.h.b(p60.t.f352198d);

    /* renamed from: e, reason: collision with root package name */
    public boolean f352201e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f352202f;

    public final p60.j Ai() {
        p60.i iVar = p60.j.f352160e;
        int i17 = f352199g.getInt("gameLiveCurrentState_", 0);
        iVar.getClass();
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? p60.j.f352161f : p60.j.f352165m : p60.j.f352164i : p60.j.f352163h : p60.j.f352162g;
    }

    public java.lang.Boolean Bi(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f352199g;
        boolean z17 = false;
        if (kotlin.jvm.internal.o.b(o4Var.getString("onLiveAppId", null), appId) && o4Var.getInt("onLiveVersionType", 0) == i17 && Di()) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }

    public final boolean Di() {
        Ui(com.tencent.mm.sdk.platformtools.x2.n() ? ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk() : f352199g.getBoolean("isLiving", false));
        return this.f352201e;
    }

    public final void Ni() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginGameLive", Zi("resetState"));
        Vi("");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f352199g;
        o4Var.putInt("onLiveVersionType", 0);
        o4Var.putBoolean("isPushing", false);
        o4Var.putBoolean("disableMicInfo", false);
        o4Var.putBoolean("disableLiveInfo", false);
        Ri(p60.j.f352161f);
        p60.r rVar = p60.s.f352192e;
        o4Var.putInt("gameLivePrepareScene", 0);
        Di();
    }

    public final void Ri(p60.j jVar) {
        if (jVar != null) {
            f352199g.putInt("gameLiveCurrentState_", jVar.f352167d);
        }
    }

    public final void Ui(boolean z17) {
        this.f352201e = z17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginGameLive", Zi("zbql:update isLiving: " + z17));
            f352199g.putBoolean("isLiving", z17);
        }
    }

    public final void Vi(java.lang.String str) {
        f352199g.putString("onLiveAppId", str);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            Ui(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk());
        }
    }

    public final java.lang.String Zi(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" [appId:");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f352199g;
        sb6.append(o4Var.getString("onLiveAppId", null));
        sb6.append(" versionType:");
        sb6.append(o4Var.getInt("onLiveVersionType", 0));
        sb6.append(']');
        return sb6.toString();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginGameLive", "onAccountInitialized");
            Ni();
            this.f352202f = f352199g.getBoolean("onLivingStatusForCrashCheck", false);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginGameLive", "onAccountRelease");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final java.lang.String wi() {
        return f352199g.getString("appbrandPackageName", "");
    }
}
