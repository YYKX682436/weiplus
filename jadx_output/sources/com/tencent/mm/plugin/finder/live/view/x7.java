package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView f116801d;

    public x7(com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView) {
        this.f116801d = finderLiveNewFansClubAnnouncementView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a showEditPanel = this.f116801d.getShowEditPanel();
        if (showEditPanel != null) {
            showEditPanel.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
