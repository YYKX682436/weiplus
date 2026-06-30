package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class e4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.g4 f200889a;

    public e4(com.tencent.mm.ui.chatting.gallery.g4 g4Var) {
        this.f200889a = g4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.gallery.g4 g4Var = this.f200889a;
        g4Var.j(true);
        fq.b bVar = g4Var.f200946a.f265419p;
        bVar.f265397h.setVisibility(8);
        bVar.f265393d.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
