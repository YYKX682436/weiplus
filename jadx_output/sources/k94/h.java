package k94;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305948a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f305949b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f305950c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f305951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f305952e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f305953f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f305954g;

    public h(java.lang.String viewId, android.view.View view, android.view.ViewGroup viewGroup, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        this.f305948a = viewId;
        this.f305949b = view;
        this.f305950c = viewGroup;
        this.f305951d = obj;
        this.f305952e = new java.lang.ref.WeakReference(view);
        this.f305953f = new java.lang.ref.WeakReference(viewGroup);
    }
}
