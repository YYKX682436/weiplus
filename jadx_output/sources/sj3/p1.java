package sj3;

/* loaded from: classes5.dex */
public final class p1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f408679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f408681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f408682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408683h;

    public p1(sj3.u1 u1Var, android.graphics.Bitmap bitmap, int i17, int i18, java.lang.String str) {
        this.f408679d = u1Var;
        this.f408680e = bitmap;
        this.f408681f = i17;
        this.f408682g = i18;
        this.f408683h = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        sj3.u1 u1Var = this.f408679d;
        android.widget.ImageView imageView = u1Var.f408758f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.TextView textView = u1Var.f408754b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        u1Var.f408773u = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.graphics.Bitmap bitmap = this.f408680e;
        sj3.u1 u1Var = this.f408679d;
        u1Var.d(bitmap, this.f408681f, this.f408682g);
        android.widget.TextView textView = u1Var.f408754b;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView != null) {
            textView.setTextSize(1, 10.0f);
        }
        java.lang.String str = this.f408683h;
        if (textView != null) {
            textView.setText(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).P0());
        }
        u1Var.g(str);
        u1Var.f408768p = str;
        u1Var.f408773u = true;
    }
}
