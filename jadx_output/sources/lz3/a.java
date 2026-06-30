package lz3;

/* loaded from: classes13.dex */
public final class a extends lz3.b {

    /* renamed from: c, reason: collision with root package name */
    public final int f322364c;

    public a(int i17) {
        this.f322364c = i17;
    }

    @Override // lz3.e
    public void a(lz3.c animationInfo) {
        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
    }

    @Override // lz3.e
    public void b(float f17) {
        android.view.View view = this.f322365a;
        kotlin.jvm.internal.o.d(view);
        if (view.getAlpha() <= f17) {
            f(this.f322365a, f17);
        }
    }

    @Override // lz3.e
    public void c(float f17) {
        android.view.View view = this.f322365a;
        kotlin.jvm.internal.o.d(view);
        float f18 = 1.0f - f17;
        if (view.getAlpha() >= f18) {
            f(this.f322365a, f18);
        }
    }

    @Override // lz3.e
    public boolean d() {
        return this.f322364c == 2;
    }

    @Override // lz3.b, lz3.e
    public void e(lz3.c animationInfo) {
        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
        super.e(animationInfo);
    }

    public final void f(android.view.View view, float f17) {
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ocr/animation/AlphaImageAnimator", "updateViewAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ocr/animation/AlphaImageAnimator", "updateViewAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
