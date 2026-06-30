package te5;

/* loaded from: classes9.dex */
public abstract class x0 {
    public static void a(rl5.r rVar, db5.g4 g4Var, android.content.res.Resources resources, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, long j17, int i17) {
        java.lang.String sb6;
        if (g4Var == null || rVar == null || com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return;
        }
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        if (su4.r2.l()) {
            return;
        }
        g4Var.c(0, 101, 0, resources.getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
        java.lang.String Ai = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            rVar.Y = new te5.v0(resources, Ai);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            rVar.Y = null;
        }
        if (2 == i17 || 1 == i17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            sb7.append(o13.n.l(34));
            sb7.append("_");
            sb6 = sb7.toString();
        } else if (3 == i17 || 4 == i17) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            sb8.append(o13.n.l(34));
            sb8.append("_");
            sb6 = sb8.toString();
        } else {
            sb6 = "";
        }
        c(str, str2, j17, 1, !com.tencent.mm.sdk.platformtools.t8.K0(Ai), charSequence.toString(), sb6 + c01.id.c(), i17);
    }

    public static void b(android.content.Context context, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17) {
        java.lang.String str3;
        int i18;
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return;
        }
        if (3 == i17 || 4 == i17) {
            str3 = "65_" + c01.id.c();
            i18 = 65;
        } else {
            str3 = "34_" + c01.id.c();
            i18 = 34;
        }
        java.lang.String str4 = str3;
        java.lang.String charSequence2 = charSequence.toString();
        java.lang.String Ai = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(Ai);
        c(str, str2, j17, 2, z18, charSequence2, str4, i17);
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = context;
        j2Var.f412939b = i18;
        j2Var.f412941d = charSequence2;
        j2Var.f412942e = str4;
        j2Var.f412943f = true;
        if (z17) {
            j2Var.f412945h = true;
            j2Var.f412946i = false;
            j2Var.f412958u = true;
            j2Var.f412952o = i65.a.d(context, com.tencent.mm.R.color.aaw);
            j2Var.f412953p = true;
            j2Var.f412944g.put("chatSearch", "1");
        } else {
            j2Var.f412946i = false;
        }
        if (z18) {
            java.lang.String Ni = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ni(Ai);
            java.lang.String Ui = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ui(Ai, charSequence2);
            boolean isEmpty = android.text.TextUtils.isEmpty(Ni);
            java.util.Map map = j2Var.f412959v;
            if (!isEmpty) {
                ((java.util.HashMap) map).put("exposedFingerWord", Ni);
            }
            if (!android.text.TextUtils.isEmpty(Ui)) {
                ((java.util.HashMap) map).put("matchedFingerWord", Ui);
            }
        }
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }

    public static void c(java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17, java.lang.String str3, java.lang.String str4, int i18) {
        int i19 = com.tencent.mm.storage.z3.R4(str) ? 2 : 1;
        java.lang.String str5 = com.tencent.mm.storage.z3.R4(str) ? str : "0";
        java.lang.String str6 = j17 + "";
        java.lang.String Zi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Zi();
        long Vi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Vi();
        int i27 = (2 == i18 || 1 == i18) ? 34 : 65;
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).g(new te5.w0(str3, i17, str4, i27, Zi, str6, str2, i19, str5, Vi, i18));
        } else {
            su4.k3.d(i17, str4, i27, 0, "", Zi, str6, str2, i19, str5, Vi, str3.length(), i18, "", "", -1, 0);
        }
    }
}
