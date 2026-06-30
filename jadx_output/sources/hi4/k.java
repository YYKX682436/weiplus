package hi4;

/* loaded from: classes11.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(pj4.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = o0Var.f355215f.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (sb6.length() > 0) {
                sb6.append(";");
            }
            sb6.append(str);
        }
        return sb6.toString();
    }

    public final hi4.m b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.m.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hi4.m) a17;
    }

    public final void c(java.lang.String username, int i17) {
        java.lang.String d17;
        kotlin.jvm.internal.o.g(username, "username");
        mj4.h M = ai4.m0.f5173a.M(username);
        qj4.s.o(qj4.s.f363958a, i17, null, hi4.m.f281556g, 0, null, 0, 0, 0, 0, username, M != null ? ((mj4.k) M).h() : "", (M == null || (d17 = wi4.a.d(xe0.j0.a(M, false, 1, null))) == null) ? "" : d17, null, M != null ? ((mj4.k) M).l() : "", 4602, null);
    }

    public final void d(java.lang.String sessionId, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        pj4.b0 t07;
        pj4.o0 o0Var;
        java.lang.String a17;
        pj4.b0 t08;
        pj4.o0 o0Var2;
        pj4.b0 t09;
        pj4.o0 o0Var3;
        java.lang.String str6;
        java.lang.String a18;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.lang.String str7 = "";
        if (kotlin.jvm.internal.o.b(sessionId, en1.a.a())) {
            mj4.h M = ai4.m0.f5173a.M(sessionId);
            java.lang.String h17 = M != null ? ((mj4.k) M).h() : "";
            if (M == null || (str6 = wi4.a.d(xe0.j0.a(M, false, 1, null))) == null) {
                str6 = "";
            }
            java.lang.String l17 = M != null ? ((mj4.k) M).l() : "";
            if (M != null && (a18 = a(xe0.j0.a(M, false, 1, null))) != null) {
                str7 = a18;
            }
            str3 = str7;
            str4 = h17;
            str5 = str6;
            str2 = l17;
        } else {
            mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(sessionId);
            java.lang.String str8 = (Ai == null || (t09 = Ai.t0()) == null || (o0Var3 = t09.f354975g) == null) ? null : o0Var3.f355214e;
            if (str8 == null) {
                str8 = "";
            }
            if (Ai == null || (t08 = Ai.t0()) == null || (o0Var2 = t08.f354975g) == null || (str = wi4.a.d(o0Var2)) == null) {
                str = "";
            }
            java.lang.String str9 = Ai != null ? Ai.field_textStatusId : null;
            if (str9 == null) {
                str9 = "";
            }
            if (Ai != null && (t07 = Ai.t0()) != null && (o0Var = t07.f354975g) != null && (a17 = a(o0Var)) != null) {
                str7 = a17;
            }
            str2 = str9;
            str3 = str7;
            str4 = str8;
            str5 = str;
        }
        qj4.s.o(qj4.s.f363958a, i17, null, hi4.m.f281556g, 0, null, 0, 0, 0, 0, sessionId, str4, str5, str3, str2, 506, null);
    }
}
