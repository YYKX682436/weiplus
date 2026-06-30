package mq0;

/* loaded from: classes7.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a1 f330627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq0.x f330628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mq0.a1 a1Var, fq0.x xVar, java.lang.String str) {
        super(0);
        this.f330627d = a1Var;
        this.f330628e = xVar;
        this.f330629f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        mq0.a1 a1Var = this.f330627d;
        java.util.HashMap hashMap = a1Var.f330535a;
        fq0.x xVar = this.f330628e;
        java.util.List list = (java.util.List) hashMap.get(xVar.f265478b);
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w(a1Var.f330536b, "reportFirstFrame but start time not found " + xVar);
        } else {
            long longValue = ((java.lang.Number) kz5.n0.X(list)).longValue();
            java.util.HashMap hashMap2 = a1Var.f330535a;
            java.lang.String str = xVar.f265478b;
            hashMap2.remove(str);
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String str2 = xVar.f265478b;
            java.lang.String str3 = xVar.f265480d;
            java.lang.String str4 = xVar.f265477a;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene iMagicBrushMonitor$PerformanceScene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.FirstFrameFromStart;
            long j17 = elapsedRealtime - longValue;
            java.util.List c17 = kz5.b0.c(java.lang.String.valueOf(xVar.f265487k.getValue()));
            cl0.g gVar = new cl0.g();
            gVar.o("appStatus", com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground() ? 1 : 2);
            hq0.e0 e0Var = xVar.f265479c;
            gVar.h(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e0Var != null ? e0Var.f282982c : null);
            gVar.r("hasCover", ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(this.f330629f, str));
            iVar.qa(str2, str3, str4, iMagicBrushMonitor$PerformanceScene, j17, c17, gVar);
            java.util.Objects.toString(iMagicBrushMonitor$PerformanceScene);
        }
        return jz5.f0.f302826a;
    }
}
