package i24;

/* loaded from: classes4.dex */
public final class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingSwitchTimelineStrangerShow f288085a;

    public c(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingSwitchTimelineStrangerShow settingSwitchTimelineStrangerShow) {
        this.f288085a = settingSwitchTimelineStrangerShow;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingSwitchTimelineStrangerShow settingSwitchTimelineStrangerShow = this.f288085a;
        settingSwitchTimelineStrangerShow.f161947n = z17;
        settingSwitchTimelineStrangerShow.t7(settingSwitchTimelineStrangerShow.getActivity().getIntent());
        if (p94.w0.c() != null) {
            ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).C1(settingSwitchTimelineStrangerShow.f161945i, !settingSwitchTimelineStrangerShow.f161947n);
        }
        if (p94.w0.c() != null) {
            r45.cb6 P0 = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).P0(settingSwitchTimelineStrangerShow.f161945i, !settingSwitchTimelineStrangerShow.f161947n);
            ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).z1(settingSwitchTimelineStrangerShow.f161945i, P0);
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, P0));
        }
    }
}
