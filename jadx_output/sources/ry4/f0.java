package ry4;

/* loaded from: classes.dex */
public final class f0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f401622d;

    public f0(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f401622d = weImageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f401622d;
        weImageView.setVisibility(8);
        weImageView.setTranslationX(0.0f);
    }
}
