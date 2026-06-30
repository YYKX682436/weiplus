package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes12.dex */
public class m2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.MMFilterDialog f211926a;

    public m2(com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog) {
        this.f211926a = mMFilterDialog;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f211926a.f211692e.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
