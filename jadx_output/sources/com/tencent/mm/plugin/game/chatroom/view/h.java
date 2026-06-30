package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public final class h extends com.tencent.mm.plugin.game.chatroom.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.l f139134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f139135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f139136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f139138h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f139139i;

    public h(com.tencent.mm.plugin.game.chatroom.view.l lVar, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f139134d = lVar;
        this.f139135e = k3Var;
        this.f139136f = i17;
        this.f139137g = view;
        this.f139138h = i18;
        this.f139139i = viewPropertyAnimator;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.a, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        int i17 = this.f139136f;
        android.view.View view = this.f139137g;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f139138h != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f139139i.setListener(null);
        com.tencent.mm.plugin.game.chatroom.view.l lVar = this.f139134d;
        androidx.recyclerview.widget.k3 k3Var = this.f139135e;
        lVar.x(k3Var);
        lVar.f139212p.remove(k3Var);
        lVar.E();
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.a, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f139134d.A(this.f139135e);
    }
}
