package wu2;

/* loaded from: classes2.dex */
public final class z implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final wu2.z f449711a = new wu2.z();

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17);
        lVarArr[3] = new jz5.l("extra_info", "");
        lVarArr[4] = new jz5.l("enter_source_info", "");
        return kz5.c1.k(lVarArr);
    }
}
