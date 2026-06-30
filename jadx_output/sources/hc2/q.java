package hc2;

/* loaded from: classes2.dex */
public abstract class q {
    public static final nr2.m a(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.dm2 object_extend = finderObject.getObject_extend();
        r45.uz0 uz0Var = object_extend != null ? (r45.uz0) object_extend.getCustom(32) : null;
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        r45.do2 do2Var = object_extend2 != null ? (r45.do2) object_extend2.getCustom(39) : null;
        nr2.m mVar = do2Var != null ? new nr2.m(do2Var) : uz0Var != null ? cu2.g0.f222404a.d(uz0Var) : null;
        if (mVar == null || mVar.l() == 0) {
            return null;
        }
        return mVar;
    }

    public static final boolean b(r45.vx0 vx0Var) {
        if (vx0Var != null && vx0Var.getInteger(21) == 23) {
            return true;
        }
        return vx0Var != null && vx0Var.getInteger(21) == 24;
    }
}
