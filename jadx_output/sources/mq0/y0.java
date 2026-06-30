package mq0;

/* loaded from: classes7.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a1 f330632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq0.x f330633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(mq0.a1 a1Var, fq0.x xVar) {
        super(0);
        this.f330632d = a1Var;
        this.f330633e = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.util.List k17 = kz5.c0.k(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        java.util.HashMap hashMap = this.f330632d.f330535a;
        fq0.x xVar = this.f330633e;
        hashMap.put(xVar.f265478b, k17);
        je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
        java.lang.String str = xVar.f265478b;
        java.lang.String str2 = xVar.f265480d;
        java.lang.String str3 = xVar.f265477a;
        com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene iMagicBrushMonitor$PerformanceScene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.Start;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appStatus", com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground() ? 1 : 2);
        hq0.e0 e0Var = xVar.f265479c;
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e0Var != null ? e0Var.f282982c : null);
        iVar.qa(str, str2, str3, iMagicBrushMonitor$PerformanceScene, 0L, null, jSONObject);
        java.util.Objects.toString(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.FirstFrameFromStart);
        return jz5.f0.f302826a;
    }
}
