package ju1;

/* loaded from: classes9.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.n0 f301754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ju1.n0 n0Var) {
        super(1);
        this.f301754d = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String ret_msg;
        r45.qd3 qd3Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListViewModel", "Force refresh card, errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
            int i17 = fVar.f70615a;
            ju1.n0 n0Var = this.f301754d;
            if (i17 == 0 && fVar.f70616b == 0 && (qd3Var = (r45.qd3) fVar.f70618d) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListViewModel", "Force refresh card, retcode: " + qd3Var.f383850d + ", retmsg: " + qd3Var.f383851e);
                if (qd3Var.f383850d == 0) {
                    n0Var.f301770n = 0;
                    boolean z17 = qd3Var.f383852f;
                    androidx.lifecycle.j0 j0Var = n0Var.f301752g;
                    if (z17) {
                        j0Var.postValue(ju1.o0.f301779i);
                    } else {
                        j0Var.postValue(ju1.o0.f301778h);
                    }
                    n0Var.f301771o = qd3Var;
                    n0Var.f301749d.postValue(qd3Var.f383855i);
                    androidx.lifecycle.j0 j0Var2 = n0Var.f301751f;
                    r45.k90 items_list = qd3Var.f383856m;
                    kotlin.jvm.internal.o.f(items_list, "items_list");
                    j0Var2.postValue(n0Var.S6(items_list, true));
                } else {
                    ret_msg = qd3Var.f383851e;
                    kotlin.jvm.internal.o.f(ret_msg, "ret_msg");
                }
            } else {
                ret_msg = "";
            }
            ju1.o0 o0Var = ju1.o0.f301780m;
            o0Var.f301782d = ret_msg;
            n0Var.f301752g.postValue(o0Var);
        }
        return jz5.f0.f302826a;
    }
}
