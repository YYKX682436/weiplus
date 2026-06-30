package gf2;

/* loaded from: classes10.dex */
public final class m extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271291a;

    public m(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView) {
        this.f271291a = anchorMilestoneShareView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        gf2.z currentPostExtraInfo;
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271291a;
            currentPostExtraInfo = anchorMilestoneShareView.getCurrentPostExtraInfo();
            if (currentPostExtraInfo == null || (str = currentPostExtraInfo.f271326a) == null) {
                str = "";
            }
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.u1 u1Var = ml2.u1.f328055j2;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = anchorMilestoneShareView.f111572d;
            if (liveRoomController == null) {
                kotlin.jvm.internal.o.o("controller");
                throw null;
            }
            java.lang.String str2 = ((mm2.c1) liveRoomController.business(mm2.c1.class)).f328852o;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController2 = anchorMilestoneShareView.f111572d;
            if (liveRoomController2 == null) {
                kotlin.jvm.internal.o.o("controller");
                throw null;
            }
            long j19 = ((mm2.e1) liveRoomController2.business(mm2.e1.class)).f328988r.getLong(0);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("milestone", str);
            r0Var.nk(u1Var, str2, j19, hashMap);
        }
    }
}
