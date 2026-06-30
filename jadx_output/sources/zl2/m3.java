package zl2;

/* loaded from: classes2.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f473890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f473892f;

    public m3(android.view.View view, int i17, int i18) {
        this.f473890d = view;
        this.f473891e = i17;
        this.f473892f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f473890d;
        view.getHitRect(rect);
        rect.inset(-this.f473891e, -this.f473892f);
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
