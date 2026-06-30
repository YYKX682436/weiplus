package mi5;

/* loaded from: classes9.dex */
public final class m0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326879a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326880b;

    /* renamed from: c, reason: collision with root package name */
    public dc5.a f326881c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326879a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326879a = a17;
        c(null, this.f326881c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        dc5.a aVar = (dc5.a) pVar;
        dc5.a aVar2 = this.f326881c;
        this.f326881c = aVar;
        c(aVar2, aVar);
    }

    public final void c(dc5.a aVar, dc5.a aVar2) {
        java.lang.String str;
        v05.b k17;
        em.v0 v0Var = this.f326879a;
        l15.c k18 = aVar2 != null ? aVar2.k() : null;
        if (aVar2 == null || v0Var == null || k18 == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.y yVar = new z01.y();
        s15.w wVar = new s15.w();
        l15.c k19 = aVar2.k();
        if (k19 == null || (k17 = k19.k()) == null || (str = k17.getString(k17.f432315e + 44)) == null) {
            str = "";
        }
        wVar.fromXml(str);
        yVar.f469187g = wVar;
        yVar.f469188h = aVar2.getScene() == 1;
        int i17 = aVar2.f43702d;
        yVar.f469184d = aVar2.getLong(i17 + 0);
        java.lang.String string = aVar2.getString(i17 + 1);
        kotlin.jvm.internal.o.g(string, "<set-?>");
        yVar.f469185e = string;
        yVar.f469186f = com.tencent.mm.R.drawable.d4q;
        yVar.f469189i = new mi5.l0(aVar2, context, k18);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326880b;
        if (mvvmView != null) {
            mvvmView.setViewModel(yVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326880b = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNoteMvvmView(context, null, 0, 6, null);
        v0Var.b().addView(this.f326880b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326880b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(yVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326881c;
    }
}
