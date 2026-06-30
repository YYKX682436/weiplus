package vq4;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f439330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f439332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlin.jvm.internal.g0 g0Var, rh.c1 c1Var, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f439330d = g0Var;
        this.f439331e = c1Var;
        this.f439332f = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        long j17 = this.f439330d.f310121d;
        qh.b bVar = this.f439331e.f395330l;
        float b17 = vq4.x.b(j17, bVar != null ? bVar.f363321n : 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thread r: REMAINS(");
        kotlin.jvm.internal.f0 f0Var = this.f439332f;
        sb6.append(f0Var.f310116d);
        sb6.append(") = ");
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", sb6.toString());
        subJson.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "REMAINS");
        subJson.put("count", f0Var.f310116d);
        subJson.put("cpuLoad", java.lang.Float.valueOf(b17));
        return jz5.f0.f302826a;
    }
}
