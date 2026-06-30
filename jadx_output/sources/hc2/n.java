package hc2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f280333f;

    public n(android.view.View view, int i17, int i18) {
        this.f280331d = view;
        this.f280332e = i17;
        this.f280333f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f280331d;
        view.getHitRect(rect);
        rect.inset(-this.f280332e, -this.f280333f);
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
