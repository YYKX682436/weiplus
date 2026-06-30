package sg3;

@j95.b
/* loaded from: classes9.dex */
public class a extends i95.w implements tg3.v0 {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        return c01.a2.f(str, str2);
    }

    public java.lang.String Bi(java.lang.String str) {
        java.util.Set set = c01.a2.f37047a;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        return n17 == null ? str : !com.tencent.mm.sdk.platformtools.t8.K0(n17.P0()) ? com.tencent.mm.contact.s.q3(n17.P0()) : !com.tencent.mm.sdk.platformtools.t8.K0(n17.t0()) ? com.tencent.mm.contact.s.q3(n17.t0()) : com.tencent.mm.storage.z3.E4(str) ? " " : str;
    }

    public java.lang.String Di(java.lang.String str) {
        return c01.a2.f37047a.contains(str) ? "" : str;
    }

    public java.lang.String Ni(java.lang.String str) {
        java.util.Set set = c01.a2.f37047a;
        if (str == null || str.length() <= 0) {
            return com.tencent.mm.contact.u.a();
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            return com.tencent.mm.contact.u.a();
        }
        if (com.tencent.mm.storage.z3.R4(str) && com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
            java.lang.String displayName = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().getDisplayName(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(displayName)) {
                return displayName;
            }
        }
        return (n17.i2() == null || n17.i2().length() <= 0) ? com.tencent.mm.contact.u.a() : n17.i2();
    }

    public java.lang.String getDisplayName(java.lang.String str) {
        return c01.a2.e(str);
    }

    public java.lang.String wi(com.tencent.mm.storage.z3 z3Var) {
        java.util.Set set = c01.a2.f37047a;
        java.lang.String e17 = c01.a2.e(z3Var.d1());
        if (!com.tencent.mm.storage.z3.R4(z3Var.d1())) {
            return e17;
        }
        if (e17 != null && !e17.equals(z3Var.d1())) {
            return e17;
        }
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(z3Var.d1());
        if (L0 == null || ((java.util.LinkedList) L0).size() <= 0) {
            return com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f489865dw);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = L0.iterator();
        while (it.hasNext()) {
            arrayList.add(c01.a2.e((java.lang.String) it.next()));
        }
        return "(" + com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ", ") + ")";
    }
}
