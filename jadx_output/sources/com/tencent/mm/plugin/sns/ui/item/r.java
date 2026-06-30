package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class r extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f169416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.s f169417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f169419d;

    public r(com.tencent.mm.plugin.sns.ui.item.t tVar, r45.kv2 kv2Var, com.tencent.mm.plugin.sns.ui.item.s sVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f169416a = kv2Var;
        this.f169417b = sVar;
        this.f169418c = snsInfo;
        this.f169419d = timeLineObject;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
        long hashCode = this.f169418c.getSnsId().hashCode() + view.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
        return hashCode;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
        if (z17) {
            zy2.eb ebVar = (zy2.eb) i95.n0.c(zy2.eb.class);
            r45.kv2 kv2Var = this.f169416a;
            ((vr2.f) ebVar).Bi(pm0.v.Z(kv2Var.getString(0)), kv2Var.getString(8), 37, null, this.f169417b.E0.getContext(), false, null);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169418c;
            java.lang.String userName = snsInfo.getUserName();
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.tencent.mm.plugin.finder.report.m0.f125120d.c(3, 1, userName, null, kv2Var.getString(0), kv2Var.getInteger(29), userName, null, this.f169419d.CreateTime, ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).Di(snsInfo.getLocalid()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
    }
}
