package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes10.dex */
public class m1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI f175040d;

    public m1(com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f175040d = topStorySettingVisibilityDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f175040d.finish();
    }
}
