package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class f4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.g4 f200918a;

    public f4(com.tencent.mm.ui.chatting.gallery.g4 g4Var) {
        this.f200918a = g4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.gallery.g4 g4Var = this.f200918a;
        g4Var.j(true);
        fq.c cVar = g4Var.f200946a.f265420q;
        cVar.f265399b.setVisibility(8);
        cVar.f265401d.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
