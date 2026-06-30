package gf2;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, java.lang.String str) {
        super(2);
        this.f271324d = anchorMilestoneShareView;
        this.f271325e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList toUserList = (java.util.ArrayList) obj2;
        kotlin.jvm.internal.o.g(toUserList, "toUserList");
        java.lang.String g07 = kz5.n0.g0(toUserList, "#", null, null, 0, null, null, 62, null);
        int i17 = com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.f111571t;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("milestone", this.f271325e);
        if (intValue == 0) {
            hashMap.put("share_type", "1");
            hashMap.put("share_username", g07);
        } else if (intValue == 1) {
            hashMap.put("share_type", "2");
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.t1 t1Var = ml2.t1.f327985s2;
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271324d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = anchorMilestoneShareView.f111572d;
        if (liveRoomController == null) {
            kotlin.jvm.internal.o.o("controller");
            throw null;
        }
        java.lang.String str = ((mm2.c1) liveRoomController.business(mm2.c1.class)).f328852o;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController2 = anchorMilestoneShareView.f111572d;
        if (liveRoomController2 != null) {
            r0Var.mk(t1Var, str, ((mm2.e1) liveRoomController2.business(mm2.e1.class)).f328988r.getLong(0), hashMap);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("controller");
        throw null;
    }
}
