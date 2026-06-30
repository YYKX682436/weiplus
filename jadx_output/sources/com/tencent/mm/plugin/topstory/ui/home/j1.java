package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes11.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI f175020d;

    public j1(com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f175020d = topStorySettingVisibilityDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = this.f175020d;
        java.util.Iterator it = ((java.util.ArrayList) topStorySettingVisibilityDetailUI.f174907m).iterator();
        while (it.hasNext()) {
            ((java.util.ArrayList) topStorySettingVisibilityDetailUI.f174905h).remove((java.lang.String) it.next());
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = topStorySettingVisibilityDetailUI.f174901d;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.S(topStorySettingVisibilityDetailUI.f174905h);
            topStorySettingVisibilityDetailUI.f174901d.s();
        }
        ((java.util.ArrayList) topStorySettingVisibilityDetailUI.f174907m).clear();
        topStorySettingVisibilityDetailUI.X6();
        topStorySettingVisibilityDetailUI.Y6();
    }
}
