package m31;

/* loaded from: classes2.dex */
public final class x implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f323230e;

    public x(android.view.View view, yz5.a aVar) {
        this.f323229d = view;
        this.f323230e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f323229d;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f323230e.invoke();
        return false;
    }
}
