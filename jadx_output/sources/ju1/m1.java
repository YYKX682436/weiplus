package ju1;

/* loaded from: classes9.dex */
public final class m1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.o1 f301764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju1.o0 f301765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju1.a f301766c;

    public m1(ju1.o1 o1Var, ju1.o0 o0Var, ju1.a aVar) {
        this.f301764a = o1Var;
        this.f301765b = o0Var;
        this.f301766c = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String ret_msg;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MemberHistoryCardListViewModel", "do delete card, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        ju1.o1 o1Var = this.f301764a;
        o1Var.f301753h.postValue(java.lang.Boolean.FALSE);
        int i17 = fVar.f70615a;
        androidx.lifecycle.j0 j0Var = o1Var.f301752g;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.fd0 fd0Var = (r45.fd0) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.MemberHistoryCardListViewModel", "do delete card, retCode: %s", java.lang.Integer.valueOf(fd0Var.f374220d));
            if (fd0Var.f374220d == 0) {
                j0Var.postValue(this.f301765b);
                androidx.lifecycle.j0 j0Var2 = o1Var.f301751f;
                java.util.ArrayList arrayList = o1Var.f301787p;
                ju1.a aVar = this.f301766c;
                java.lang.Boolean valueOf = arrayList != null ? java.lang.Boolean.valueOf(arrayList.remove(aVar)) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove card, is removed: ");
                sb6.append(valueOf);
                sb6.append(", data type: ");
                sb6.append(aVar.f301688a);
                sb6.append(", errMsg: ");
                r45.tt ttVar = aVar.f301690c;
                sb6.append(ttVar != null ? ttVar.f386765d : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MemberHistoryCardListViewModel", sb6.toString());
                j0Var2.postValue(arrayList);
                return jz5.f0.f302826a;
            }
            ret_msg = ((r45.fd0) fVar.f70618d).f374221e;
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
