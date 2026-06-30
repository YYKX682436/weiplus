package tc4;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tc4.a0 a0Var) {
        super(3);
        this.f417533d = a0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        android.view.View playView = (android.view.View) obj3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(playView, "playView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAutoPlay: liveId=");
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(finderObject.getId()));
        java.lang.String sb7 = sb6.toString();
        tc4.a0 a0Var = this.f417533d;
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", sb7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.J1 = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        long j17 = a0Var.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.K1 = j17 + intValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        i95.m c17 = i95.n0.c(zy2.pa.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long id6 = finderObject.getId();
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        long j18 = liveInfo2 != null ? liveInfo2.getLong(0) : 0L;
        java.lang.String username = finderObject.getUsername();
        java.lang.String nickname = finderObject.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        java.lang.String str = nickname;
        p52.e[] eVarArr = p52.e.f352008d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("auto_time", intValue);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        zy2.pa.Gc(paVar, id6, j18, username, str, 15L, "temp_6", 3, jSONObject2, null, 256, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        return f0Var;
    }
}
