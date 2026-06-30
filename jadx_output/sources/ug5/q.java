package ug5;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.i f427641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f427643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427644h;

    public q(android.view.View view, ug5.i iVar, android.view.View view2, android.widget.FrameLayout frameLayout, ug5.v vVar) {
        this.f427640d = view;
        this.f427641e = iVar;
        this.f427642f = view2;
        this.f427643g = frameLayout;
        this.f427644h = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f427640d.removeOnAttachStateChangeListener(this);
        android.view.View view2 = this.f427642f;
        android.content.Context context = view2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f427641e.a(context, view2, this.f427643g, this.f427644h);
    }
}
