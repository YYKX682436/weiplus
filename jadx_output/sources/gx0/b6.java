package gx0;

/* loaded from: classes5.dex */
public final class b6 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f276229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276230e;

    public b6(android.view.View view, gx0.w8 w8Var) {
        this.f276229d = view;
        this.f276230e = w8Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f276229d.removeOnAttachStateChangeListener(this);
        this.f276230e.K7("onAttach");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
