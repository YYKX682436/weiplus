package rc5;

/* loaded from: classes5.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394164d;

    public i(rc5.m mVar) {
        this.f394164d = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        rc5.m mVar = this.f394164d;
        int height = mVar.getHeight();
        mVar.getLayoutParams().height = intValue;
        mVar.setLayoutParams(mVar.getLayoutParams());
        java.lang.Object listView = ((com.tencent.mm.ui.chatting.ChattingUIFragment) mVar.f394170f.W6().f198152f.f460719n).B.getListView();
        androidx.recyclerview.widget.RecyclerView recyclerView = listView instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) listView : null;
        if (recyclerView == null) {
            return;
        }
        mVar.getViewTreeObserver().addOnPreDrawListener(new rc5.h(recyclerView, intValue, height, mVar));
    }
}
