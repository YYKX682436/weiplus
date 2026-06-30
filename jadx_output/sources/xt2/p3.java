package xt2;

/* loaded from: classes2.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f456948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f456949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f456950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f456951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(xt2.r3 r3Var, android.graphics.Bitmap bitmap, android.view.View view, boolean z17) {
        super(0);
        this.f456948d = r3Var;
        this.f456949e = bitmap;
        this.f456950f = view;
        this.f456951g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xt2.r3 r3Var = this.f456948d;
        r3Var.f456985h.setImageBitmap(this.f456949e);
        r3Var.f456978a.setVisibility(0);
        android.view.View cartIv = r3Var.f456986i;
        kotlin.jvm.internal.o.f(cartIv, "cartIv");
        int[] t17 = pm0.v.t(cartIv);
        java.lang.Integer S = kz5.z.S(t17, 0);
        if (S != null) {
            float intValue = S.intValue();
            java.lang.Integer S2 = kz5.z.S(t17, 1);
            if (S2 != null) {
                float intValue2 = S2.intValue();
                int[] t18 = pm0.v.t(this.f456950f);
                java.lang.Integer S3 = kz5.z.S(t18, 0);
                if (S3 != null) {
                    float intValue3 = S3.intValue();
                    java.lang.Integer S4 = kz5.z.S(t18, 1);
                    if (S4 != null) {
                        float intValue4 = S4.intValue();
                        float width = (intValue + (cartIv.getWidth() / 2)) - (r6.getWidth() / 2);
                        float height = (intValue2 + (cartIv.getHeight() / 2)) - (r6.getHeight() / 2);
                        android.widget.ImageView imageView = r3Var.f456985h;
                        imageView.setTranslationX(intValue3);
                        imageView.setTranslationY(intValue4);
                        android.graphics.Path path = new android.graphics.Path();
                        path.moveTo(0.0f, 0.0f);
                        path.cubicTo(0.15f, 0.0f, 0.58f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(path);
                        android.graphics.Path path2 = new android.graphics.Path();
                        path2.moveTo(0.0f, 0.0f);
                        path2.cubicTo(0.2f, 0.0f, 0.2f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(path2);
                        android.graphics.Path path3 = new android.graphics.Path();
                        path3.moveTo(0.0f, 0.0f);
                        path3.cubicTo(0.42f, 0.0f, 0.58f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator3 = new android.view.animation.PathInterpolator(path3);
                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationX", intValue3, width);
                        ofFloat.setInterpolator(pathInterpolator);
                        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, "translationY", intValue4, height);
                        ofFloat2.setInterpolator(pathInterpolator2);
                        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleX", 0.8f, 0.0f);
                        ofFloat3.setInterpolator(pathInterpolator3);
                        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleY", 0.8f, 0.0f);
                        ofFloat4.setInterpolator(pathInterpolator3);
                        android.graphics.Path path4 = new android.graphics.Path();
                        path4.moveTo(0.0f, 0.0f);
                        path4.cubicTo(0.0f, 0.0f, 0.58f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator4 = new android.view.animation.PathInterpolator(path4);
                        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.8f);
                        ofFloat5.setInterpolator(pathInterpolator4);
                        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.8f);
                        ofFloat6.setInterpolator(pathInterpolator4);
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playTogether(ofFloat5, ofFloat6);
                        animatorSet.setDuration(200L);
                        animatorSet.addListener(new xt2.j3(r3Var));
                        animatorSet.addListener(new xt2.i3(r3Var));
                        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
                        animatorSet3.playSequentially(animatorSet, animatorSet2);
                        animatorSet3.setDuration(400L);
                        animatorSet3.addListener(new xt2.h3(r3Var));
                        animatorSet3.start();
                        if (this.f456951g) {
                            if (r3Var.f456984g.length() > 0) {
                                com.tencent.mm.view.MMPAGView mMPAGView = r3Var.f456989l;
                                java.lang.Object parent = mMPAGView != null ? mMPAGView.getParent() : null;
                                android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                                if (mMPAGView == null || view == null) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag skip, pag or pagParent is null");
                                } else {
                                    java.lang.String str = r3Var.f456984g;
                                    kotlinx.coroutines.r2 r2Var = r3Var.f456983f;
                                    if (r2Var != null) {
                                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                                    }
                                    java.lang.Runnable runnable = r3Var.f456981d;
                                    if (runnable != null) {
                                        r3Var.f456980c.removeCallbacks(runnable);
                                    }
                                    r3Var.f456983f = kotlinx.coroutines.l.d(r3Var.f456982e, null, null, new xt2.n3(str, r3Var, view, mMPAGView, null), 3, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
