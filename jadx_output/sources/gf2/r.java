package gf2;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271298d;

    public r(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView) {
        this.f271298d = anchorMilestoneShareView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271298d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = anchorMilestoneShareView.f111572d;
        if (liveRoomController == null) {
            kotlin.jvm.internal.o.o("controller");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.util.y.d(liveRoomController, null, null, new gf2.q(anchorMilestoneShareView, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
