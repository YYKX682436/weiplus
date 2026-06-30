package nv3;

/* loaded from: classes5.dex */
public final class r implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.a f340695d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f340696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nv3.t f340697f;

    public r(nv3.t tVar) {
        this.f340697f = tVar;
        if (!androidx.recyclerview.widget.RecyclerView.a.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(androidx.recyclerview.widget.RecyclerView.a.class.getClassLoader(), new java.lang.Class[]{androidx.recyclerview.widget.RecyclerView.a.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener");
        }
        this.f340695d = (androidx.recyclerview.widget.RecyclerView.a) newProxyInstance;
        this.f340696e = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (this.f340696e) {
            this.f340696e = false;
            nv3.t tVar = this.f340697f;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = tVar.f340705c;
            if (wxRecyclerView != null) {
                wxRecyclerView.post(new nv3.q(tVar));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f340695d.p3(p07);
    }
}
