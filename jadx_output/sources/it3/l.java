package it3;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294568d;

    public l(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        this.f294568d = finderRedPacketCoverEditUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/activity/FinderRedPacketCoverEditUI$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294568d;
        int i17 = com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI.f155611t;
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "[onSave] range:[" + finderRedPacketCoverEditUI.f155621p + ", " + finderRedPacketCoverEditUI.f155622q + ']');
        ((ku5.t0) ku5.t0.f312615d).q(new it3.s(finderRedPacketCoverEditUI));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/activity/FinderRedPacketCoverEditUI$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
