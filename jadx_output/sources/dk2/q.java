package dk2;

/* loaded from: classes3.dex */
public abstract class q {
    public static final boolean a(r45.rm1 rm1Var) {
        kotlin.jvm.internal.o.g(rm1Var, "<this>");
        int integer = rm1Var.getInteger(2);
        dk2.s4[] s4VarArr = dk2.s4.f234060d;
        return integer == 0;
    }

    public static final boolean b(r45.d22 d22Var) {
        kotlin.jvm.internal.o.g(d22Var, "<this>");
        int integer = d22Var.getInteger(10);
        dk2.s4[] s4VarArr = dk2.s4.f234060d;
        return integer == 0;
    }

    public static final boolean c(r45.d22 d22Var, r45.rm1 rm1Var) {
        kotlin.jvm.internal.o.g(d22Var, "<this>");
        if (rm1Var == null) {
            return false;
        }
        if (b(d22Var)) {
            return d22Var.getInteger(0) == rm1Var.getInteger(0);
        }
        int integer = d22Var.getInteger(10);
        dk2.s4[] s4VarArr = dk2.s4.f234060d;
        if (integer == 1) {
            return kotlin.jvm.internal.o.b(d22Var.getString(9), rm1Var.getString(1));
        }
        return false;
    }

    public static final boolean d(r45.d22 d22Var, r45.d22 d22Var2) {
        kotlin.jvm.internal.o.g(d22Var, "<this>");
        if (d22Var2 == null) {
            return false;
        }
        if (b(d22Var)) {
            return d22Var.getInteger(0) == d22Var2.getInteger(0);
        }
        int integer = d22Var.getInteger(10);
        dk2.s4[] s4VarArr = dk2.s4.f234060d;
        if (integer == 1) {
            return kotlin.jvm.internal.o.b(d22Var.getString(9), d22Var2.getString(9));
        }
        return false;
    }

    public static final java.lang.String e(r45.d22 d22Var) {
        kotlin.jvm.internal.o.g(d22Var, "<this>");
        java.lang.String string = d22Var.getString(9);
        if (string == null || string.length() == 0) {
            string = java.lang.String.valueOf(d22Var.getInteger(0));
        }
        return string == null ? "" : string;
    }

    public static final boolean f(r45.d22 d22Var) {
        kotlin.jvm.internal.o.g(d22Var, "<this>");
        java.lang.String string = d22Var.getString(7);
        if (!(string == null || string.length() == 0)) {
            return false;
        }
        java.lang.String string2 = d22Var.getString(9);
        return !(string2 == null || string2.length() == 0);
    }

    public static final r45.rm1 g(r45.d22 d22Var) {
        kotlin.jvm.internal.o.g(d22Var, "<this>");
        r45.rm1 rm1Var = new r45.rm1();
        rm1Var.set(1, d22Var.getString(9));
        rm1Var.set(0, java.lang.Integer.valueOf(d22Var.getInteger(0)));
        rm1Var.set(2, java.lang.Integer.valueOf(d22Var.getInteger(10)));
        return rm1Var;
    }

    public static final java.lang.String h(r45.rm1 rm1Var) {
        kotlin.jvm.internal.o.g(rm1Var, "<this>");
        return rm1Var.getInteger(0) + '+' + rm1Var.getString(1) + '+' + rm1Var.getInteger(2);
    }
}
