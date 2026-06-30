package ju1;

/* loaded from: classes9.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.o1 f301761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ju1.o1 o1Var) {
        super(1);
        this.f301761d = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String ret_msg;
        r45.li3 li3Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MemberHistoryCardListViewModel", "force refresh member history card, errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
            int i17 = fVar.f70615a;
            ju1.o1 o1Var = this.f301761d;
            if (i17 == 0 && fVar.f70616b == 0 && (li3Var = (r45.li3) fVar.f70618d) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MemberHistoryCardListViewModel", "retcode: " + li3Var.f379498d + ", retmsg: " + li3Var.f379499e);
                if (li3Var.f379498d == 0) {
                    o1Var.f301785n = 0;
                    boolean z17 = li3Var.f379500f;
                    androidx.lifecycle.j0 j0Var = o1Var.f301752g;
                    if (z17) {
                        j0Var.postValue(ju1.o0.f301779i);
                    } else {
                        j0Var.postValue(ju1.o0.f301778h);
                    }
                    o1Var.f301786o = li3Var;
                    o1Var.f301749d.postValue(li3Var.f379503i);
                    androidx.lifecycle.j0 j0Var2 = o1Var.f301751f;
                    java.util.LinkedList items = li3Var.f379504m;
                    kotlin.jvm.internal.o.f(items, "items");
                    j0Var2.postValue(o1Var.S6(items, true));
                } else {
                    ret_msg = li3Var.f379499e;
                    kotlin.jvm.internal.o.f(ret_msg, "ret_msg");
                }
            } else {
                ret_msg = "";
            }
            ju1.o0 o0Var = ju1.o0.f301780m;
            o0Var.f301782d = ret_msg;
            o1Var.f301752g.postValue(o0Var);
        }
        return jz5.f0.f302826a;
    }
}
