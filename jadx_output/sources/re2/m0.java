package re2;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394452d;

    public m0(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI) {
        this.f394452d = finderLiveCoLiveInvitationConfirmUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accept button clicked, invitationId=");
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI = this.f394452d;
        sb6.append(finderLiveCoLiveInvitationConfirmUI.f111531d);
        sb6.append(", accepting=");
        sb6.append(finderLiveCoLiveInvitationConfirmUI.f111543s);
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", sb6.toString());
        if (finderLiveCoLiveInvitationConfirmUI.f111543s) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI.T6(finderLiveCoLiveInvitationConfirmUI);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
