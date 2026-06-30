package gf2;

/* loaded from: classes10.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271294d;

    public o(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView) {
        this.f271294d = anchorMilestoneShareView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gf2.z currentPostExtraInfo;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271294d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = anchorMilestoneShareView.f111572d;
        if (liveRoomController == null) {
            kotlin.jvm.internal.o.o("controller");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.util.y.d(liveRoomController, null, null, new gf2.n(anchorMilestoneShareView, null), 3, null);
        currentPostExtraInfo = anchorMilestoneShareView.getCurrentPostExtraInfo();
        if (currentPostExtraInfo == null || (str = currentPostExtraInfo.f271326a) == null) {
            str = "";
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.t1 t1Var = ml2.t1.f327982r2;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController2 = anchorMilestoneShareView.f111572d;
        if (liveRoomController2 == null) {
            kotlin.jvm.internal.o.o("controller");
            throw null;
        }
        java.lang.String str2 = ((mm2.c1) liveRoomController2.business(mm2.c1.class)).f328852o;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController3 = anchorMilestoneShareView.f111572d;
        if (liveRoomController3 == null) {
            kotlin.jvm.internal.o.o("controller");
            throw null;
        }
        long j17 = ((mm2.e1) liveRoomController3.business(mm2.e1.class)).f328988r.getLong(0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("milestone", str);
        r0Var.mk(t1Var, str2, j17, hashMap);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
