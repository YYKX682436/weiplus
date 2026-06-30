package sk5;

/* loaded from: classes14.dex */
public final class f extends sk5.j {

    /* renamed from: c, reason: collision with root package name */
    public static final sk5.f f409011c = new sk5.f();

    public f() {
        super(0L, 1, null);
    }

    @Override // sk5.j
    public android.animation.Animator a(android.view.View view, int i17, int i18, sk5.k animParam) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(animParam, "animParam");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", i17 * 0.75f, 0.0f);
        ofFloat.setDuration(f409011c.f409016a);
        ofFloat.setInterpolator(ta5.h.f416879a.c());
        return ofFloat;
    }
}
