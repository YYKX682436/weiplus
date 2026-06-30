package my2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f332772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f332773e;

    public x(android.view.View view, float f17) {
        this.f332772d = view;
        this.f332773e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f332772d;
        float f17 = this.f332773e;
        view.setScaleX(f17);
        view.setScaleY(f17);
        view.setPivotX(0.0f);
    }
}
