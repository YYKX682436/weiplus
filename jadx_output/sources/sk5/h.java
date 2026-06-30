package sk5;

/* loaded from: classes14.dex */
public final class h extends sk5.j {

    /* renamed from: c, reason: collision with root package name */
    public static final sk5.h f409013c = new sk5.h();

    public h() {
        super(0L, 1, null);
    }

    @Override // sk5.j
    public android.animation.Animator a(android.view.View view, int i17, int i18, sk5.k animParam) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(animParam, "animParam");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
        ofFloat.setDuration(f409013c.f409016a);
        return ofFloat;
    }
}
