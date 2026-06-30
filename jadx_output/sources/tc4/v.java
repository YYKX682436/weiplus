package tc4;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f417486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f417487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f417488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f417489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(tc4.a0 a0Var, r45.nw1 nw1Var, int i17, r45.g92 g92Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(0);
        this.f417485d = a0Var;
        this.f417486e = nw1Var;
        this.f417487f = i17;
        this.f417488g = g92Var;
        this.f417489h = finderObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrameRendStart: liveId=");
        r45.nw1 nw1Var = this.f417486e;
        sb6.append(nw1Var.getLong(0));
        sb6.append(", position=");
        sb6.append(this.f417487f);
        sb6.append(", feedId=");
        r45.g92 g92Var = this.f417488g;
        sb6.append(g92Var.getString(2));
        java.lang.String sb7 = sb6.toString();
        tc4.a0 a0Var = this.f417485d;
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", sb7);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.J1 = elapsedRealtime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        i95.m c17 = i95.n0.c(zy2.pa.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long id6 = this.f417489h.getId();
        long j17 = nw1Var.getLong(0);
        java.lang.String string = g92Var.getString(1);
        java.lang.String string2 = g92Var.getString(3);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String str = string2;
        p52.e[] eVarArr = p52.e.f352008d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("share_scene", g92Var.getInteger(44));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        zy2.pa.Gc(paVar, id6, j17, string, str, 14L, "temp_6", 3, jSONObject2, null, 256, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        return f0Var;
    }
}
