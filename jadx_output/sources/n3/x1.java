package n3;

/* loaded from: classes5.dex */
public final class x1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f334437e;

    public x1(android.view.View view, yz5.l lVar) {
        this.f334436d = view;
        this.f334437e = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f334436d.removeOnAttachStateChangeListener(this);
        this.f334437e.invoke(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
