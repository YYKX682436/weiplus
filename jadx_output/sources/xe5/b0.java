package xe5;

/* loaded from: classes8.dex */
public final class b0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f453987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453988b;

    public b0(kotlin.jvm.internal.f0 f0Var, java.lang.String str) {
        this.f453987a = f0Var;
        this.f453988b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[6];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
        if (this.f453987a.f310116d == 1) {
            ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
            ml2.v1 v1Var = ml2.v1.f328140e;
            j17 = 1;
        } else {
            ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            j17 = 2;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[4] = new jz5.l("share_username", "");
        lVarArr[5] = new jz5.l("live_notice_type", java.lang.Integer.valueOf(this.f453988b.length() == 0 ? 1 : 0));
        return kz5.c1.k(lVarArr);
    }
}
