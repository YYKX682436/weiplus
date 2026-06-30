package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class w7 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView f116774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f116775b;

    public w7(com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView, android.content.Context context) {
        this.f116774a = finderLiveNewFansClubAnnouncementView;
        this.f116775b = context;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView = this.f116774a;
        if (!z17) {
            kotlinx.coroutines.l.d(v65.m.a(finderLiveNewFansClubAnnouncementView), null, null, new com.tencent.mm.plugin.finder.live.view.v7(this.f116775b, finderLiveNewFansClubAnnouncementView, null), 3, null);
            return;
        }
        yz5.a showEditPanel = finderLiveNewFansClubAnnouncementView.getShowEditPanel();
        if (showEditPanel != null) {
            showEditPanel.invoke();
        }
    }
}
