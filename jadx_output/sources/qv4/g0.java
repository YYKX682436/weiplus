package qv4;

/* loaded from: classes3.dex */
public final class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f366976e;

    public g0(android.view.View view, yz5.a aVar) {
        this.f366975d = view;
        this.f366976e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f366975d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f366976e.invoke();
    }
}
