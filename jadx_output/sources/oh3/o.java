package oh3;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f345445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh3.q f345446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345447f;

    public o(boolean z17, oh3.q qVar, java.lang.String str) {
        this.f345445d = z17;
        this.f345446e = qVar;
        this.f345447f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        ((h00.m) ((c00.t3) i95.n0.c(c00.t3.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) h00.h.f277821b).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("PluginMMEcFeatureService", "skip this doInit isUseNewEcsInitCgi");
            return;
        }
        boolean z17 = this.f345445d;
        oh3.q qVar = this.f345446e;
        java.lang.String str = this.f345447f;
        if (z17 && java.lang.System.currentTimeMillis() - qVar.f345455h <= oh3.q.f345449n) {
            com.tencent.mars.xlog.Log.i("PluginMMEcFeatureService", "skip this doInit(" + str + ')');
            return;
        }
        com.tencent.mars.xlog.Log.i("PluginMMEcFeatureService", "[doInit] source=" + str);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl((jz5.f0) kotlinx.coroutines.l.f(null, new oh3.n(qVar, str, null), 1, null));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("PluginMMEcFeatureService", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
    }
}
