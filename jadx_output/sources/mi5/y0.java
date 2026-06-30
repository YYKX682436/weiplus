package mi5;

/* loaded from: classes9.dex */
public final class y0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326943a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326944b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f326945c;

    /* renamed from: d, reason: collision with root package name */
    public vd5.b f326946d;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326943a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326943a = a17;
        this.f326945c = context;
        c(null, this.f326946d);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        vd5.b bVar = (vd5.b) pVar;
        vd5.b bVar2 = this.f326946d;
        this.f326946d = bVar;
        c(bVar2, bVar);
    }

    public final void c(vd5.b bVar, vd5.b bVar2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        b15.b bVar3;
        java.lang.String sourceIcon;
        em.v0 v0Var = this.f326943a;
        l15.c j17 = bVar2 != null ? bVar2.j() : null;
        if (bVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.a0 a0Var = new z01.a0();
        v05.b k17 = j17.k();
        java.lang.String str5 = "";
        if (k17 == null || (str = k17.getString(k17.f368365d + 2)) == null) {
            str = "";
        }
        a0Var.f468937d = str;
        v05.b k18 = j17.k();
        if (k18 == null || (str2 = k18.getString(k18.f368365d + 3)) == null) {
            str2 = "";
        }
        a0Var.f468938e = str2;
        v05.b k19 = j17.k();
        if (k19 == null || (str3 = k19.getString(k19.f432315e + 14)) == null) {
            str3 = "";
        }
        a0Var.f468939f = str3;
        a0Var.f468942i = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.d4q);
        v05.b k27 = j17.k();
        if (k27 == null || (str4 = k27.getString(k27.f432315e + 12)) == null) {
            str4 = "";
        }
        a0Var.f468940g = str4;
        v05.b k28 = j17.k();
        if (k28 != null && (bVar3 = (b15.b) k28.getCustom(k28.f432315e + 78)) != null && (sourceIcon = bVar3.getSourceIcon()) != null) {
            str5 = sourceIcon;
        }
        a0Var.f468941h = str5;
        a0Var.f468943m = new mi5.x0(this, a0Var);
        com.tencent.mars.xlog.Log.i("ForwardPocketMoneyView", "has init pocketMoneyViewModel: " + a0Var);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326944b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(a0Var);
            return;
        }
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326944b = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingPocketMoneyMvvmView(context, null, 0, 6, null);
        v0Var.b().addView(this.f326944b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326944b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(a0Var);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326946d;
    }
}
