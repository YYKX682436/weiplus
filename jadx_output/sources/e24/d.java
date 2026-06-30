package e24;

/* loaded from: classes.dex */
public final class d implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchGallerySearch f247011a;

    public d(com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchGallerySearch settingSwitchGallerySearch) {
        this.f247011a = settingSwitchGallerySearch;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchGallerySearch settingSwitchGallerySearch = this.f247011a;
        settingSwitchGallerySearch.f161906h = z17;
        settingSwitchGallerySearch.t7(settingSwitchGallerySearch.getActivity().getIntent());
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).bj(z17);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Di(3);
    }
}
