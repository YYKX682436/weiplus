package pf3;

/* loaded from: classes2.dex */
public final class l implements pf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f353833a;

    public l(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f353833a = view;
    }

    @Override // pf3.k
    public boolean a(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int[] iArr = new int[2];
        android.view.View view = this.f353833a;
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int rawX = ((int) event.getRawX()) - i17;
        int rawY = ((int) event.getRawY()) - i18;
        return view.getVisibility() == 0 && view.isEnabled() && rawX >= 0 && rawX < view.getWidth() && rawY >= 0 && rawY < view.getHeight();
    }
}
