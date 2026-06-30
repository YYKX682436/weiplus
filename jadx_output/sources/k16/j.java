package k16;

/* loaded from: classes16.dex */
public abstract class j {
    public static final i16.l1 a(i16.l1 l1Var, k16.k typeTable) {
        kotlin.jvm.internal.o.g(l1Var, "<this>");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        int i17 = l1Var.f287582f;
        if ((i17 & 256) == 256) {
            return l1Var.f287592s;
        }
        if ((i17 & 512) == 512) {
            return typeTable.a(l1Var.f287593t);
        }
        return null;
    }

    public static final i16.l1 b(i16.j0 j0Var, k16.k typeTable) {
        kotlin.jvm.internal.o.g(j0Var, "<this>");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        int i17 = j0Var.f287526f;
        if ((i17 & 32) == 32) {
            return j0Var.f287533p;
        }
        if ((i17 & 64) == 64) {
            return typeTable.a(j0Var.f287534q);
        }
        return null;
    }

    public static final i16.l1 c(i16.j0 j0Var, k16.k typeTable) {
        kotlin.jvm.internal.o.g(j0Var, "<this>");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        int i17 = j0Var.f287526f;
        if ((i17 & 8) == 8) {
            i16.l1 l1Var = j0Var.f287530m;
            kotlin.jvm.internal.o.f(l1Var, "getReturnType(...)");
            return l1Var;
        }
        if ((i17 & 16) == 16) {
            return typeTable.a(j0Var.f287531n);
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final i16.l1 d(i16.u0 u0Var, k16.k typeTable) {
        kotlin.jvm.internal.o.g(u0Var, "<this>");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        int i17 = u0Var.f287762f;
        if ((i17 & 8) == 8) {
            i16.l1 l1Var = u0Var.f287766m;
            kotlin.jvm.internal.o.f(l1Var, "getReturnType(...)");
            return l1Var;
        }
        if ((i17 & 16) == 16) {
            return typeTable.a(u0Var.f287767n);
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final i16.l1 e(i16.y1 y1Var, k16.k typeTable) {
        kotlin.jvm.internal.o.g(y1Var, "<this>");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        int i17 = y1Var.f287822f;
        if ((i17 & 4) == 4) {
            i16.l1 l1Var = y1Var.f287825i;
            kotlin.jvm.internal.o.f(l1Var, "getType(...)");
            return l1Var;
        }
        if ((i17 & 8) == 8) {
            return typeTable.a(y1Var.f287826m);
        }
        throw new java.lang.IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }
}
