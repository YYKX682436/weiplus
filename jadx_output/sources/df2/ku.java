package df2;

/* loaded from: classes3.dex */
public final class ku implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.mu f230600a;

    public ku(df2.mu muVar) {
        this.f230600a = muVar;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        df2.mu muVar = this.f230600a;
        if (!kotlin.jvm.internal.o.b(str, muVar.f230807n)) {
            com.tencent.mars.xlog.Log.i(muVar.f230806m, "appId not match, appId:" + str + ", lastAppId:" + muVar.f230807n);
            return;
        }
        com.tencent.mars.xlog.Log.i(muVar.f230806m, "onDataCallback value:" + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        try {
            boolean optBoolean = new cl0.g(str2).optBoolean("ignoreNextShopShelfOrderHintBeforeReopen");
            com.tencent.mm.plugin.finder.live.view.ub ubVar = muVar.f291099e;
            boolean z17 = (ubVar == null || (ga0Var = (com.tencent.mm.plugin.finder.live.plugin.ga0) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ga0.class)) == null || ga0Var.w0() != 0) ? false : true;
            if (optBoolean && z17) {
                ((mm2.f6) muVar.business(mm2.f6.class)).Y6(true);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(muVar.f230806m, th6, "weAppDataCallback value invalid", new java.lang.Object[0]);
        }
    }
}
