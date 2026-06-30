package dw2;

/* loaded from: classes2.dex */
public final class h implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f244122d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f244123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw2.o f244124f;

    public h(androidx.recyclerview.widget.RecyclerView recyclerView, dw2.o oVar) {
        this.f244123e = recyclerView;
        this.f244124f = oVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (this.f244122d) {
            this.f244122d = false;
            dw2.o oVar = this.f244124f;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f244123e;
            recyclerView.post(new dw2.g(oVar, recyclerView));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
