package tc4;

/* loaded from: classes4.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.c3 f417492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(tc4.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417492d = c3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        tc4.v2 v2Var = new tc4.v2(this.f417492d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        return v2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        java.lang.Object invokeSuspend = ((tc4.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xc4.p n17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        r45.q1 q1Var;
        r45.m1 m1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        tc4.c3 c3Var = this.f417492d;
        zc4.b data = c3Var.getData();
        if (data == null || (n17 = data.n()) == null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
            return bool;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = n17.h1();
        r45.a90 a90Var2 = h17.ContentObj;
        if (a90Var2 == null) {
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
            return bool2;
        }
        if (a90Var2.f369852w == null) {
            a90Var2.f369852w = new r45.xs4();
        }
        r45.xs4 xs4Var = h17.ContentObj.f369852w;
        int i17 = tc4.c3.D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        c3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        if (xs4Var != null && (a90Var = h17.ContentObj) != null && (linkedList = a90Var.f369840h) != null && !linkedList.isEmpty()) {
            r45.jj4 jj4Var = (r45.jj4) h17.ContentObj.f369840h.get(0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(14))) {
                xs4Var.set(14, jj4Var.f377864o);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(4))) {
                xs4Var.set(4, jj4Var.f377857f);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(15))) {
                xs4Var.set(15, jj4Var.Q);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(16))) {
                xs4Var.set(16, jj4Var.P);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(6)) && (q1Var = h17.actionInfo) != null && (m1Var = q1Var.f383556m) != null) {
                xs4Var.set(6, m1Var.f380056f);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        java.util.LinkedList linkedList2 = h17.ContentObj.f369840h;
        tc4.c3.R(c3Var, h17, linkedList2 != null ? (r45.jj4) kz5.n0.Z(linkedList2) : null, h17.ContentObj.f369852w.getInteger(18) > 0 ? rk4.l5.c(h17.ContentObj.f369852w.getString(19)) : null);
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadCustomItemInfo$2");
        return bool3;
    }
}
