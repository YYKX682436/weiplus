package ry4;

/* loaded from: classes.dex */
public final class g0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f401632d;

    public g0(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f401632d = weImageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f401632d;
        weImageView.setVisibility(8);
        weImageView.setTranslationX(0.0f);
    }
}
