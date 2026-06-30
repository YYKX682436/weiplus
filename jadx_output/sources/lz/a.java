package lz;

/* loaded from: classes11.dex */
public abstract class a {
    public static java.lang.String a(com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference, int i17) {
        lz.f fVar = contactListExpandPreference.M;
        if (fVar == null) {
            return "";
        }
        r35.u1 u1Var = (r35.u1) fVar;
        return u1Var.f369274f.g(i17) ? ((com.tencent.mm.storage.z3) u1Var.f369274f.getItem(i17)).P0() : "";
    }

    public static java.lang.String b(com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference, int i17) {
        lz.f fVar = contactListExpandPreference.M;
        if (fVar == null) {
            return "";
        }
        r35.u1 u1Var = (r35.u1) fVar;
        return u1Var.f369274f.g(i17) ? ((com.tencent.mm.storage.z3) u1Var.f369274f.getItem(i17)).w0() : "";
    }

    public static java.lang.String c(com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference, int i17) {
        lz.f fVar = contactListExpandPreference.M;
        if (fVar == null) {
            return "";
        }
        r35.u1 u1Var = (r35.u1) fVar;
        return u1Var.f369274f.g(i17) ? ((com.tencent.mm.storage.z3) u1Var.f369274f.getItem(i17)).d1() : "";
    }
}
