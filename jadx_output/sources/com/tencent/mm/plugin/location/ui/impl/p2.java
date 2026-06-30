package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class p2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar f144872a;

    public p2(com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar trackPointAnimAvatar) {
        this.f144872a = trackPointAnimAvatar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar trackPointAnimAvatar = this.f144872a;
        trackPointAnimAvatar.bringToFront();
        trackPointAnimAvatar.f144723e.startAnimation(trackPointAnimAvatar.f144726h);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
