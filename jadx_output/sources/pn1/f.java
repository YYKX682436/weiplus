package pn1;

/* loaded from: classes11.dex */
public class f implements on1.i {
    @Override // on1.i
    public boolean a(r45.ed edVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // on1.i
    public int b(java.lang.String str, r45.ed edVar, com.tencent.mm.storage.f9 f9Var, on1.a aVar) {
        java.lang.String str2 = edVar.f373283h.f372756d;
        if (str2 != null) {
            f9Var.d1(str2);
        }
        if (edVar.f373279d != 50) {
            return 1;
        }
        f9Var.r1(6);
        return 1;
    }

    @Override // on1.i
    public int c(r45.ed edVar, boolean z17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.util.LinkedList linkedList, boolean z18) {
        if (f9Var.getType() == 10000 && f9Var.w0() == 2097152) {
            return -1;
        }
        if (f9Var.j() == null) {
            return 0;
        }
        return f9Var.j().getBytes().length;
    }
}
