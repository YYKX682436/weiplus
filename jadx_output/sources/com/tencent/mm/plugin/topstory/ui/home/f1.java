package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes10.dex */
public class f1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI f174969d;

    public f1(com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI topStorySettingUI) {
        this.f174969d = topStorySettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f174969d.finish();
        return true;
    }
}
