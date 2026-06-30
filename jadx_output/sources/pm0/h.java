package pm0;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm0.g f356772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356773e;

    public h(pm0.g gVar, android.view.View view) {
        this.f356772d = gVar;
        this.f356773e = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f356772d.onLayoutChange(null, 0, 0, 0, 0, 0, 0, 0, 0);
        this.f356773e.removeOnLayoutChangeListener(this.f356772d);
    }
}
