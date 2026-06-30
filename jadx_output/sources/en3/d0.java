package en3;

/* loaded from: classes2.dex */
public abstract class d0 {
    public static final r45.ll2 a(r45.pm2 pm2Var) {
        kotlin.jvm.internal.o.g(pm2Var, "<this>");
        r45.ll2 ll2Var = (r45.ll2) pm2Var.getCustom(0);
        if (ll2Var != null) {
            return ll2Var;
        }
        r45.ll2 ll2Var2 = new r45.ll2();
        pm2Var.set(0, ll2Var2);
        return ll2Var2;
    }

    public static final r45.pm2 b(r45.dm2 dm2Var) {
        kotlin.jvm.internal.o.g(dm2Var, "<this>");
        r45.pm2 pm2Var = (r45.pm2) dm2Var.getCustom(12);
        if (pm2Var != null) {
            return pm2Var;
        }
        r45.pm2 pm2Var2 = new r45.pm2();
        dm2Var.set(12, pm2Var2);
        return pm2Var2;
    }

    public static final r45.dm2 c(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend != null) {
            return object_extend;
        }
        r45.dm2 dm2Var = new r45.dm2();
        finderObject.setObject_extend(dm2Var);
        return dm2Var;
    }

    public static final void d(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.pm2 b17 = b(c(finderObject));
        r45.zm2 zm2Var = (r45.zm2) b17.getCustom(5);
        if (zm2Var == null) {
            zm2Var = new r45.zm2();
            b17.set(5, zm2Var);
        }
        zm2Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
    }
}
