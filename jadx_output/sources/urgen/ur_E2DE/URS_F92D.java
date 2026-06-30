package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0007¨\u0006\u0011"}, d2 = {"Lurgen/ur_E2DE/URS_F92D;", "", "", "userName", "Lcom/tencent/unit_rc/BaseObjectDef;", "callback", "Ljz5/f0;", "UR_FA8B", "UR_48C6", "roomName", "UR_6BEF", "", "logId", "logString", "UR_34FC", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class URS_F92D {
    public static final urgen.ur_E2DE.URS_F92D INSTANCE = new urgen.ur_E2DE.URS_F92D();

    private URS_F92D() {
    }

    public static final void UR_34FC(int i17, java.lang.String logString) {
        kotlin.jvm.internal.o.g(logString, "logString");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, logString);
    }

    public static final java.lang.String UR_48C6(java.lang.String userName) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(userName, "userName");
        if (y02.j.f458608a == null) {
            y02.j.f458608a = new b30.n();
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 == null) {
            c17 = null;
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            c17 = c01.a2.c(n17, userName);
        }
        return c17 == null ? "" : c17;
    }

    public static final java.lang.String UR_6BEF(java.lang.String userName, java.lang.String roomName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(roomName, "roomName");
        if (y02.j.f458608a == null) {
            y02.j.f458608a = new b30.n();
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(userName, roomName);
        return f17 == null ? "" : f17;
    }

    public static final void UR_FA8B(java.lang.String userName, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        y02.j1 j1Var;
        kotlin.jvm.internal.o.g(userName, "userName");
        int i17 = y02.o1.f458617n;
        y02.h1 h1Var = (y02.h1) baseObjectDef;
        if (h1Var == null) {
            j1Var = null;
        } else {
            if (h1Var instanceof y02.o1) {
            }
            j1Var = new y02.j1(h1Var);
        }
        b30.n nVar = y02.j.f458608a;
        if (nVar == null) {
            nVar = new b30.n();
            y02.j.f458608a = nVar;
        }
        y02.i iVar = new y02.i(j1Var);
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true) != null) {
            iVar.invoke(java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) b30.n.f17571a.get(userName);
        if (num == null) {
            num = 0;
        }
        kotlin.jvm.internal.o.d(num);
        if (num.intValue() < 3) {
            b30.n.f17572b.put(userName, iVar);
            ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(userName, 13, nVar);
            return;
        }
        com.tencent.mars.xlog.Log.w("EcsGetContactHelper", "Skip getContact of " + userName + ", because 3 attempts to get contact failed.");
        iVar.invoke(java.lang.Boolean.FALSE);
    }
}
