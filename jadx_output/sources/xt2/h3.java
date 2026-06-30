package xt2;

/* loaded from: classes2.dex */
public final class h3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f456777d;

    public h3(xt2.r3 r3Var) {
        this.f456777d = r3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        xt2.r3 r3Var = this.f456777d;
        android.widget.ImageView imageView = r3Var.f456985h;
        imageView.setTranslationX(0.0f);
        imageView.setTranslationY(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setAlpha(1.0f);
        imageView.setImageBitmap(null);
        r3Var.f456978a.setVisibility(8);
        com.tencent.mm.view.MMPAGView mMPAGView = r3Var.f456987j;
        if (mMPAGView != null) {
            android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView.k(assets, r3Var.f456988k);
            mMPAGView.d();
            mMPAGView.setRepeatCount(1);
            mMPAGView.setProgress(0.0d);
            mMPAGView.g();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
