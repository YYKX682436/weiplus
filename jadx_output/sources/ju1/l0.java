package ju1;

/* loaded from: classes9.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.n0 f301758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju1.o0 f301759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju1.a f301760c;

    public l0(ju1.n0 n0Var, ju1.o0 o0Var, ju1.a aVar) {
        this.f301758a = n0Var;
        this.f301759b = o0Var;
        this.f301760c = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String ret_msg;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListViewModel", "do delete card, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        ju1.n0 n0Var = this.f301758a;
        n0Var.f301753h.postValue(java.lang.Boolean.FALSE);
        int i17 = fVar.f70615a;
        androidx.lifecycle.j0 j0Var = n0Var.f301752g;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.uo5 uo5Var = (r45.uo5) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListViewModel", "do delete card, retCode: %s", java.lang.Integer.valueOf(uo5Var.f387534d));
            if (uo5Var.f387534d == 0) {
                j0Var.postValue(this.f301759b);
                androidx.lifecycle.j0 j0Var2 = n0Var.f301751f;
                java.util.ArrayList arrayList = n0Var.f301772p;
                ju1.a aVar = this.f301760c;
                java.lang.Boolean valueOf = arrayList != null ? java.lang.Boolean.valueOf(arrayList.remove(aVar)) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove card, is removed: ");
                sb6.append(valueOf);
                sb6.append(", data type: ");
                sb6.append(aVar.f301688a);
                sb6.append(", errMsg: ");
                r45.tt ttVar = aVar.f301690c;
                sb6.append(ttVar != null ? ttVar.f386765d : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListViewModel", sb6.toString());
                j0Var2.postValue(arrayList);
                return jz5.f0.f302826a;
            }
            ret_msg = ((r45.uo5) fVar.f70618d).f387535e;
            kotlin.jvm.internal.o.f(ret_msg, "ret_msg");
        } else {
            ret_msg = "";
        }
        ju1.o0 o0Var = ju1.o0.f301780m;
        o0Var.f301782d = ret_msg;
        j0Var.postValue(o0Var);
        return jz5.f0.f302826a;
    }
}
