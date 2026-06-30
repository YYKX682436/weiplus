package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class v5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        super(1);
        this.f133227d = finderCommentFooter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) obj;
        if (animatorSet != null) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133227d;
            android.animation.Animator animator = finderCommentFooter.M1;
            if (animator != null) {
                animator.cancel();
            }
            finderCommentFooter.M1 = animatorSet;
            animatorSet.start();
        }
        return jz5.f0.f302826a;
    }
}
