package com.tencent.mm.ui.chatting.view;

/* loaded from: classes13.dex */
public final class c0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.FoldableCellLayout f202882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f202883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f202884f;

    public c0(com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout, yz5.a aVar, android.animation.AnimatorSet animatorSet) {
        this.f202882d = foldableCellLayout;
        this.f202883e = aVar;
        this.f202884f = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout = this.f202882d;
        com.tencent.mars.xlog.Log.i(foldableCellLayout.f202824d, "onAnimationCancel");
        foldableCellLayout.f202828h = false;
        foldableCellLayout.f202829i = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout = this.f202882d;
        com.tencent.mars.xlog.Log.i(foldableCellLayout.f202824d, "onAnimationEnd");
        foldableCellLayout.f202835r.clear();
        foldableCellLayout.f202836s.clear();
        foldableCellLayout.f202828h = false;
        foldableCellLayout.f202829i = true;
        yz5.a aVar = this.f202883e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout = this.f202882d;
        com.tencent.mars.xlog.Log.i(foldableCellLayout.f202824d, "onAnimationStart");
        java.util.Iterator it = ((java.util.ArrayList) foldableCellLayout.f202836s).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            android.graphics.PorterDuff.Mode tintMode = android.graphics.PorterDuff.Mode.DST;
            foldableCellLayout.getClass();
            kotlin.jvm.internal.o.g(view, "<this>");
            kotlin.jvm.internal.o.g(tintMode, "tintMode");
            android.graphics.drawable.Drawable background = view.getBackground();
            if (background != null) {
                background.setTintMode(tintMode);
            }
        }
        foldableCellLayout.f202828h = true;
        foldableCellLayout.f202829i = false;
        foldableCellLayout.postDelayed(new com.tencent.mm.ui.chatting.view.b0(foldableCellLayout, this.f202883e), this.f202884f.getDuration() + 100);
    }
}
