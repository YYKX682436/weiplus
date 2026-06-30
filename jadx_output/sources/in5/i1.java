package in5;

/* loaded from: classes10.dex */
public final class i1 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f293068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293069b;

    public i1(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f293068a = recyclerView;
        this.f293069b = wxRecyclerAdapter;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        h();
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        h();
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        h();
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        h();
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        h();
    }

    public final void h() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293069b;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f293068a;
        recyclerView.post(new in5.h1(wxRecyclerAdapter, recyclerView));
    }
}
