package km3;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f309241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f309242e;

    public f(android.view.View view, android.view.View view2) {
        this.f309241d = view;
        this.f309242e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f309241d;
        view.getHitRect(rect);
        rect.left -= i65.a.b(view.getContext(), 20);
        rect.top -= i65.a.b(view.getContext(), 20);
        rect.right += i65.a.b(view.getContext(), 20);
        rect.bottom += i65.a.b(view.getContext(), 20);
        this.f309242e.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
