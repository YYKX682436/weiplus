package jr1;

/* loaded from: classes11.dex */
public abstract class j {
    public static final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return !r26.i0.n(str, "@bizfansmsg", false) ? str.concat("@bizfansmsg") : str;
    }

    public static final java.lang.String b(java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return (i17 != 5 || r26.i0.n(str, "@picfansmsg", false)) ? (i17 != 0 || r26.i0.n(str, "@bizfansmsg", false)) ? str : str.concat("@bizfansmsg") : str.concat("@picfansmsg");
    }

    public static final java.lang.String c(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return !r26.i0.n(str, "@picfansmsg", false) ? str.concat("@picfansmsg") : str;
    }

    public static final java.lang.String d(java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490737n55);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        return g17;
    }

    public static final java.lang.String e(java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return (i17 == 5 && r26.i0.n(str, "@picfansmsg", false)) ? r26.n0.Z(str, "@picfansmsg") : (i17 == 0 && r26.i0.n(str, "@bizfansmsg", false)) ? r26.n0.Z(str, "@bizfansmsg") : str;
    }

    public static final void f(hr1.e eVar, int i17) {
        kotlin.jvm.internal.o.g(eVar, "<this>");
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            eVar.field_selfBiz = c(((ox.r) d0Var).Bi(2).c());
            eVar.field_sessionId = "bizphotofansnofiticationholder@picfansmsg";
            eVar.field_talker = "bizphotofansnofiticationholder@picfansmsg";
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            eVar.field_selfBiz = a(((ox.r) d0Var2).Bi(1).c());
            eVar.field_sessionId = "bizfansnofiticationholder@bizfansmsg";
            eVar.field_talker = "bizfansnofiticationholder@bizfansmsg";
        }
        eVar.field_type = 1;
        eVar.field_placedFlag = 100L;
    }
}
