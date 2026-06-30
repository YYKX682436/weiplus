package io;

/* loaded from: classes5.dex */
public final class p implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.x0 f293420a;

    /* renamed from: b, reason: collision with root package name */
    public final io.l f293421b = new io.l();

    /* renamed from: c, reason: collision with root package name */
    public mf5.d f293422c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        com.tencent.mm.view.recyclerview.WxRecyclerView a17;
        com.tencent.mm.view.recyclerview.WxRecyclerView a18;
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f293420a == null) {
            android.content.Context context2 = null;
            em.x0 x0Var = new em.x0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dp7, (android.view.ViewGroup) null));
            this.f293420a = x0Var;
            com.tencent.mm.view.recyclerview.WxRecyclerView a19 = x0Var.a();
            io.l lVar = this.f293421b;
            if (a19 != null) {
                a19.setClipToOutline(true);
                a19.setOutlineProvider(new io.o(context));
                em.x0 x0Var2 = this.f293420a;
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager((x0Var2 == null || (a18 = x0Var2.a()) == null) ? null : a18.getContext());
                linearLayoutManager.Q(1);
                a19.setLayoutManager(linearLayoutManager);
                em.x0 x0Var3 = this.f293420a;
                if (x0Var3 != null && (a17 = x0Var3.a()) != null) {
                    context2 = a17.getContext();
                }
                a19.N(new io.n(context2));
                a19.setAdapter(lVar);
            }
            mf5.d dVar = this.f293422c;
            if (dVar != null) {
                lVar.f293414d = dVar.f326182d;
                lVar.notifyDataSetChanged();
            }
        }
        em.x0 x0Var4 = this.f293420a;
        kotlin.jvm.internal.o.d(x0Var4);
        android.view.View view = x0Var4.f254905a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        mf5.d dVar = (mf5.d) pVar;
        this.f293422c = dVar;
        if (dVar == null) {
            return;
        }
        java.util.List list = dVar.f326182d;
        io.l lVar = this.f293421b;
        lVar.f293414d = list;
        lVar.notifyDataSetChanged();
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293422c;
    }
}
