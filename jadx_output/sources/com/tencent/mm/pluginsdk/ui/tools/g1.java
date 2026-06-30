package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class g1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView f191640a;

    public g1(com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView fileSelectorFolderView) {
        this.f191640a = fileSelectorFolderView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView fileSelectorFolderView = this.f191640a;
        fileSelectorFolderView.f191364g = true;
        fileSelectorFolderView.f191365h = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
