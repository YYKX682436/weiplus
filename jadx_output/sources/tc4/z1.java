package tc4;

/* loaded from: classes4.dex */
public abstract class z1 extends tc4.m2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        ym5.a1.h(this, new tc4.y1(this));
    }

    @Override // tc4.i2, tc4.s0
    public boolean f(in5.s0 holder, zc4.b item, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        xc4.p n17 = item.n();
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.plugin.sns.storage.s2 i18 = n17.i1();
        r45.qb6 j17 = n17.j1();
        java.lang.String userName = n17.getUserName();
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addWsFoldExposeStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (i18 != null && j17 != null) {
            com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct snsTimelineWeiShangeFoldExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            snsTimelineWeiShangeFoldExposeStruct.f60739d = snsTimelineWeiShangeFoldExposeStruct.b("SessionId", v52.c.g().d(), true);
            snsTimelineWeiShangeFoldExposeStruct.f60740e = snsTimelineWeiShangeFoldExposeStruct.b("FoldedBlockId", ca4.z0.s0(i18.field_groupId), true);
            snsTimelineWeiShangeFoldExposeStruct.f60743h = 2;
            snsTimelineWeiShangeFoldExposeStruct.f60744i = 2;
            snsTimelineWeiShangeFoldExposeStruct.f60741f = snsTimelineWeiShangeFoldExposeStruct.b("UserName", userName, true);
            snsTimelineWeiShangeFoldExposeStruct.f60747l = pc4.d.f353410a.F() ? 2L : 1L;
            if (j17.f383810d != null) {
                snsTimelineWeiShangeFoldExposeStruct.f60742g = r2.size();
            }
            ((java.util.concurrent.ConcurrentHashMap) s0Var.Y).put(java.lang.Long.valueOf(i18.field_groupId), snsTimelineWeiShangeFoldExposeStruct);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addWsFoldExposeStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        boolean f17 = super.f(holder, item, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose");
        return f17;
    }
}
