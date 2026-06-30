package db2;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f227980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.p pVar) {
        super(1);
        this.f227980d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.dd1 dd1Var;
        r45.dd1 dd1Var2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(" errCode=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(", errMsg=");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.e("CgiFinderGetNewLbsList", sb6.toString());
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            java.util.LinkedList list = ((r45.b91) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getResponse_list(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.dd1) obj2).getInteger(0) == 1) {
                    break;
                }
            }
            dd1Var2 = (r45.dd1) obj2;
            java.util.LinkedList list2 = ((r45.b91) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list2, "getResponse_list(...)");
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                r45.dd1 dd1Var3 = (r45.dd1) obj3;
                if (dd1Var3.getInteger(0) == 2 || dd1Var3.getInteger(0) == 3) {
                    break;
                }
            }
            dd1Var = (r45.dd1) obj3;
        } else {
            dd1Var = null;
            dd1Var2 = null;
        }
        yz5.p pVar = this.f227980d;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(dd1Var2, dd1Var);
        return jz5.f0.f302826a;
    }
}
