package mo3;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j4 f330415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.v8 f330416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f330417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mo3.l f330418g;

    public k(mo3.l lVar, r45.j4 j4Var, c01.v8 v8Var, com.tencent.mm.storage.f9 f9Var) {
        this.f330418g = lVar;
        this.f330415d = j4Var;
        this.f330416e = v8Var;
        this.f330417f = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        ot0.q v17;
        int t17;
        r45.j4 j4Var = this.f330415d;
        int i17 = j4Var.f377560g;
        com.tencent.mm.storage.f9 f9Var = this.f330417f;
        c01.v8 v8Var = this.f330416e;
        if (i17 != 49) {
            v8Var.a(f9Var);
            return;
        }
        this.f330418g.getClass();
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        java.lang.String g18 = x51.j1.g(j4Var.f377559f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17) || com.tencent.mm.sdk.platformtools.t8.K0(g18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncMessageNotifier", "empty fromuser or touser");
        } else {
            str = x51.j1.g(j4Var.f377561h);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (com.tencent.mm.storage.z3.R4(g17) && (t17 = c01.w9.t(str)) != -1) {
                    str = (str + " ").substring(t17 + 2).trim();
                }
                v17 = ot0.q.v(str);
                if (v17.f348656f1 == 1 || com.tencent.mm.sdk.platformtools.t8.K0(v17.f348660g1) || com.tencent.mm.sdk.platformtools.t8.K0(v17.f348664h1)) {
                    v8Var.a(f9Var);
                } else {
                    mm.w.e("showNotifyWeb");
                    this.f330416e.b(39, v17.f348664h1, "", v17.f348660g1, null, null);
                    return;
                }
            }
        }
        str = null;
        v17 = ot0.q.v(str);
        if (v17.f348656f1 == 1) {
        }
        v8Var.a(f9Var);
    }
}
