package fc2;

/* loaded from: classes2.dex */
public final class k implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f260949d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f260950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc2.o f260951f;

    public k(androidx.recyclerview.widget.RecyclerView recyclerView, fc2.o oVar) {
        this.f260950e = recyclerView;
        this.f260951f = oVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (this.f260949d) {
            this.f260949d = false;
            fc2.o oVar = this.f260951f;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f260950e;
            recyclerView.post(new fc2.j(oVar, recyclerView));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
