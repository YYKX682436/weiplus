package sk5;

/* loaded from: classes14.dex */
public final class d extends sk5.j {

    /* renamed from: c, reason: collision with root package name */
    public static final sk5.d f409009c = new sk5.d();

    public d() {
        super(0L, 1, null);
    }

    @Override // sk5.j
    public android.animation.Animator a(android.view.View view, int i17, int i18, sk5.k animParam) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(animParam, "animParam");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", (-i17) * 0.3f, 0.0f);
        ofFloat.setDuration(f409009c.f409016a);
        ofFloat.setInterpolator(ta5.h.f416879a.c());
        return ofFloat;
    }
}
