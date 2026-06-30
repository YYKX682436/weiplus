package ui5;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final ri5.j a(androidx.appcompat.app.AppCompatActivity activity, java.lang.String id6, com.tencent.mm.storage.z3 contact, int i17, java.lang.String managerHeadDisplay, ui5.b extension) {
        j75.f stateCenter;
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(managerHeadDisplay, "managerHeadDisplay");
        kotlin.jvm.internal.o.g(extension, "extension");
        si5.e a17 = si5.b.f408325a.a(activity, contact, extension.f428143b, extension.f428144c, extension.f428142a);
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        java.lang.CharSequence charSequence = a17.f408329a;
        java.lang.String str = "";
        ri5.j jVar = new ri5.j(id6, i17, d17, charSequence == null ? "" : charSequence, extension, 0, 32, null);
        jVar.n(a17.f408330b);
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        if (b0Var != null) {
            java.lang.String fj6 = ((l41.q2) b0Var).fj(contact.Q0(), contact.G0());
            if (fj6 != null) {
                str = fj6;
            }
        }
        jVar.f396116m = str;
        if (!com.tencent.mm.sdk.platformtools.t8.J0(str) && kotlin.jvm.internal.o.b("3552365301", contact.Q0())) {
            jVar.f396116m = "@" + ((java.lang.Object) jVar.f396116m);
        }
        if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
            jVar.f396127x = n0Var.e();
            java.lang.String str2 = jVar.f396111f;
            jVar.f396126w = n0Var.f(str2);
            boolean d18 = n0Var.d(str2);
            jVar.f396125v = d18;
            jVar.f396115l1 = !d18 && n0Var.e(str2);
        }
        jVar.f396119p = managerHeadDisplay;
        jVar.f396120q = activity.getResources().getColor(com.tencent.mm.R.color.f478491c);
        return jVar;
    }

    public final ri5.j b(androidx.appcompat.app.AppCompatActivity activity, java.lang.String id6, com.tencent.mm.storage.z3 contact, int i17, ui5.b extension) {
        j75.f stateCenter;
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(extension, "extension");
        si5.a aVar = si5.b.f408325a;
        si5.e a17 = aVar.a(activity, contact, extension.f428143b, extension.f428144c, extension.f428142a);
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        java.lang.CharSequence charSequence = a17.f408329a;
        java.lang.String str = "";
        ri5.j jVar = new ri5.j(id6, i17, d17, charSequence == null ? "" : charSequence, extension, 0, 32, null);
        jVar.n(a17.f408330b);
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        if (b0Var != null) {
            java.lang.String fj6 = ((l41.q2) b0Var).fj(contact.Q0(), contact.G0());
            if (fj6 != null) {
                str = fj6;
            }
        }
        jVar.f396116m = str;
        if (!com.tencent.mm.sdk.platformtools.t8.J0(str) && kotlin.jvm.internal.o.b("3552365301", contact.Q0())) {
            jVar.f396116m = "@" + ((java.lang.Object) jVar.f396116m);
        }
        if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
            jVar.f396127x = n0Var.e();
            java.lang.String str2 = jVar.f396111f;
            jVar.f396126w = n0Var.f(str2);
            boolean d18 = n0Var.d(str2);
            jVar.f396125v = d18;
            jVar.f396115l1 = !d18 && n0Var.e(str2);
        }
        si5.d c17 = aVar.c(extension.f428146e, contact, extension.f428142a);
        extension.f428146e = c17.f408326a;
        java.lang.String str3 = c17.f408327b;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        extension.f428147f = str3;
        jVar.o(c17.f408328c);
        jVar.f396120q = activity.getResources().getColor(com.tencent.mm.R.color.f478491c);
        return jVar;
    }

    public final java.lang.String c(com.tencent.mm.storage.z3 memberContact, com.tencent.mm.storage.a3 a3Var) {
        kotlin.jvm.internal.o.g(memberContact, "memberContact");
        java.lang.String z07 = a3Var != null ? a3Var.z0(memberContact.d1()) : null;
        if (z07 == null) {
            z07 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            return z07;
        }
        java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(memberContact);
        return wi6 != null ? wi6 : "";
    }
}
