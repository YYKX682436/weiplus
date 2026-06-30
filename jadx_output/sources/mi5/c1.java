package mi5;

/* loaded from: classes9.dex */
public final class c1 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326807a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326808b;

    /* renamed from: c, reason: collision with root package name */
    public oe5.b f326809c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326807a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326807a = a17;
        c(null, this.f326809c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        oe5.b bVar = (oe5.b) pVar;
        oe5.b bVar2 = this.f326809c;
        this.f326809c = bVar;
        c(bVar2, bVar);
    }

    public final void c(oe5.b bVar, oe5.b bVar2) {
        l15.c j17;
        v05.b k17;
        em.v0 v0Var = this.f326807a;
        if (bVar2 == null || v0Var == null || (j17 = bVar2.j()) == null || (k17 = j17.k()) == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = bVar2.f43702d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(bVar2.getString(i17 + 1), bVar2.getLong(i17 + 0));
        e15.h hVar = (e15.h) k17.getCustom(k17.f432315e + 45);
        bw5.o50 v17 = il4.d.v(hVar != null ? hVar.k() : null);
        kotlin.jvm.internal.o.d(context);
        java.lang.String string = k17.getString(k17.f368365d + 2);
        if (string == null) {
            string = "";
        }
        java.lang.String z07 = n17.z0();
        if (z07 == null) {
            z07 = "";
        }
        r45.lm6 b17 = il4.d.b(context, string, v17, z07);
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = new com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView(context);
        tingCategoryMvvmView.c();
        tingCategoryMvvmView.setBackgroundResource(com.tencent.mm.R.drawable.d4q);
        tingCategoryMvvmView.g(b17, null);
        z01.e0 e0Var2 = new z01.e0();
        java.lang.String str = b17.f379637d;
        if (str == null) {
            str = "";
        }
        e0Var2.f469000e = str;
        java.lang.String str2 = b17.f379638e;
        e0Var2.f469001f = str2 != null ? str2 : "";
        e0Var2.f468999d = tingCategoryMvvmView;
        e0Var2.f469002g = com.tencent.mm.R.drawable.d4q;
        e0Var2.f469003h = new mi5.b1(bVar2, n17, v17, k17);
        if (this.f326808b == null) {
            i95.m c17 = i95.n0.c(q31.r.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            this.f326808b = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).n(context);
            v0Var.b().addView(this.f326808b, -1, -1);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326808b;
        if (mvvmView == null) {
            return;
        }
        mvvmView.setViewModel(e0Var2);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326809c;
    }
}
