package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class u3 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper f201474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.g4 f201475b;

    public u3(com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper operationLayerWrapper, com.tencent.mm.ui.chatting.gallery.g4 g4Var) {
        this.f201474a = operationLayerWrapper;
        this.f201475b = g4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.gallery.t3 t3Var = new com.tencent.mm.ui.chatting.gallery.t3(this.f201475b);
        com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper operationLayerWrapper = this.f201474a;
        operationLayerWrapper.post(t3Var);
        operationLayerWrapper.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
