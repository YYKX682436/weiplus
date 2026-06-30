package hf2;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281035d;

    public d(java.util.LinkedList linkedList) {
        this.f281035d = linkedList;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.util.LinkedList linkedList = this.f281035d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                android.view.ViewGroup viewGroup = ((com.tencent.mm.plugin.finder.live.plugin.l) it.next()).f365323d;
                java.lang.Object animatedValue = animator.getAnimatedValue();
                kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                viewGroup.setAlpha(((java.lang.Float) animatedValue).floatValue());
            }
        }
    }
}
