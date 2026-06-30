package r10;

/* loaded from: classes9.dex */
public abstract class j {
    public static final r10.i a(y02.d0 d0Var) {
        y02.b0 b0Var;
        kotlin.jvm.internal.o.g(d0Var, "<this>");
        y02.e0 e0Var = (y02.e0) d0Var;
        y02.z a17 = e0Var.a();
        if (a17 != null) {
            y02.a0 a0Var = (y02.a0) a17;
            synchronized (a0Var) {
                if (a0Var.f458592d[3]) {
                    b0Var = a0Var.f458596h;
                } else {
                    com.tencent.unit_rc.BaseObjectDef UR_13BD = urgen.ur_E2DE.UR_49D9.UR_13BD(a0Var.getCppPointer());
                    synchronized (a0Var) {
                        a0Var.f458596h = (y02.b0) UR_13BD;
                        a0Var.f458592d[3] = true;
                    }
                    b0Var = (y02.b0) UR_13BD;
                }
            }
        } else {
            b0Var = null;
        }
        if (b0Var == null || !(b0Var instanceof r10.i)) {
            b0Var = new r10.i();
            y02.z a18 = e0Var.a();
            if (a18 != null) {
                urgen.ur_E2DE.UR_49D9.UR_8252(((y02.a0) a18).getCppPointer(), b0Var);
            }
        }
        return (r10.i) b0Var;
    }

    public static final pq.a b(y02.d0 d0Var) {
        bw5.h8 h8Var;
        yz5.p l1Var;
        yz5.p pVar;
        kotlin.jvm.internal.o.g(d0Var, "<this>");
        android.content.Context context = a(d0Var).f368578d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        pq.a aVar = new pq.a(context);
        y02.e0 e0Var = (y02.e0) d0Var;
        y02.z a17 = e0Var.a();
        aVar.f357555e = a17 != null ? ((y02.a0) a17).d() : java.lang.System.currentTimeMillis();
        y02.z a18 = e0Var.a();
        if (a18 != null) {
            ((y02.a0) a18).a();
        }
        synchronized (e0Var) {
            if (e0Var.f458600d[1]) {
                h8Var = e0Var.f458602f;
            } else {
                h8Var = (bw5.h8) y02.k.c(urgen.ur_E2DE.UR_3301.UR_D9E1(e0Var.getCppPointer()), new bw5.h8());
                synchronized (e0Var) {
                    e0Var.f458602f = h8Var;
                    e0Var.f458600d[1] = true;
                }
            }
        }
        kotlin.jvm.internal.o.g(h8Var, "<set-?>");
        aVar.f357552b = h8Var;
        synchronized (e0Var) {
            if (e0Var.f458600d[2]) {
                pVar = e0Var.f458603g;
            } else {
                y02.h1 h1Var = (y02.h1) urgen.ur_E2DE.UR_3301.UR_8F38(e0Var.getCppPointer());
                if (h1Var == null) {
                    pVar = null;
                } else {
                    if (!(h1Var instanceof y02.o1) || (l1Var = ((y02.o1) h1Var).f458620f) == null) {
                        l1Var = new y02.l1(h1Var);
                    }
                    pVar = l1Var;
                }
                synchronized (e0Var) {
                    e0Var.f458603g = pVar;
                    e0Var.f458600d[2] = true;
                }
            }
        }
        aVar.f357553c = pVar;
        pq.c cVar = a(d0Var).f368579e;
        kotlin.jvm.internal.o.g(cVar, "<set-?>");
        aVar.f357554d = cVar;
        return aVar;
    }

    public static final y02.d0 c(pq.a aVar) {
        y02.o1 o1Var;
        y02.z a17;
        kotlin.jvm.internal.o.g(aVar, "<this>");
        int i17 = y02.e0.f458599h;
        y02.d0 d0Var = (y02.d0) urgen.ur_E2DE.UR_3301.UR_21C5(2);
        if (d0Var != null && (a17 = ((y02.e0) d0Var).a()) != null) {
            urgen.ur_E2DE.UR_49D9.UR_502E(((y02.a0) a17).getCppPointer(), aVar.f357555e);
        }
        if (d0Var != null) {
            a(d0Var).f368578d = aVar.c();
        }
        if (d0Var != null) {
            bw5.h8 data = aVar.f357552b;
            kotlin.jvm.internal.o.g(data, "data");
            byte[] byteArray = data.toByteArray();
            long cppPointer = ((y02.e0) d0Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_E2DE.UR_3301.UR_4DDC(cppPointer, byteArray);
        }
        if (d0Var != null) {
            yz5.p pVar = aVar.f357553c;
            y02.e0 e0Var = (y02.e0) d0Var;
            if (pVar == null) {
                o1Var = null;
            } else {
                y02.o1 o1Var2 = new y02.o1();
                o1Var2.f458620f = pVar;
                o1Var = o1Var2;
            }
            urgen.ur_E2DE.UR_3301.UR_F932(e0Var.getCppPointer(), o1Var);
        }
        if (d0Var != null) {
            pq.c value = aVar.f357554d;
            kotlin.jvm.internal.o.g(value, "value");
            a(d0Var).f368579e = value;
        }
        return d0Var;
    }
}
