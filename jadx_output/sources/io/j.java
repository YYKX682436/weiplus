package io;

/* loaded from: classes5.dex */
public final class j implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.w0 f293411a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.i f293412b;

    /* renamed from: c, reason: collision with root package name */
    public mf5.c f293413c;

    public j() {
        yo0.f fVar = new yo0.f();
        fVar.f464077a = true;
        fVar.f464078b = true;
        this.f293412b = fVar.a();
    }

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f293411a == null) {
            this.f293411a = new em.w0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dp6, (android.view.ViewGroup) null));
            c(null, this.f293413c);
        }
        em.w0 w0Var = this.f293411a;
        kotlin.jvm.internal.o.d(w0Var);
        android.view.View view = w0Var.f254883a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        mf5.c cVar = (mf5.c) pVar;
        mf5.c cVar2 = this.f293413c;
        this.f293413c = cVar;
        c(cVar2, cVar);
    }

    public final void c(mf5.c cVar, mf5.c cVar2) {
        em.w0 w0Var;
        if (cVar2 == null || (w0Var = this.f293411a) == null) {
            return;
        }
        io.i iVar = new io.i(cVar2, w0Var);
        android.view.View view = w0Var.f254883a;
        view.setOnClickListener(iVar);
        if (w0Var.f254884b == null) {
            w0Var.f254884b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okp);
        }
        w0Var.f254884b.setText(cVar2.f326179d);
        java.lang.String str = cVar2.f326180e;
        jz5.f0 f0Var = null;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                w0Var.a().setVisibility(0);
                vo0.e eVar = vo0.e.f438467a;
                vo0.a aVar = vo0.e.f438468b;
                android.widget.ImageView a17 = w0Var.a();
                kotlin.jvm.internal.o.f(a17, "getIvLogo(...)");
                aVar.c(str, a17, this.f293412b);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            w0Var.a().setVisibility(8);
        }
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293413c;
    }
}
