package eg4;

/* loaded from: classes11.dex */
public class o1 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.r f252770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f252771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f252772f;

    public o1(eg4.t1 t1Var, y35.r rVar, com.tencent.mm.storage.z3 z3Var) {
        this.f252772f = t1Var;
        this.f252770d = rVar;
        this.f252771e = z3Var;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        eg4.t1 t1Var = this.f252772f;
        y35.r rVar = this.f252770d;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationUI", "addContact respUsername is empty");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(931, 21);
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(rVar.f459232a, true);
            if (((int) n17.E2) == 0) {
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
                com.tencent.mm.storage.z3 z3Var = this.f252771e;
                if (!K0) {
                    z3Var.X1(str);
                }
                if (!((com.tencent.mm.storage.k4) c01.d9.b().q()).h0(z3Var)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FMessageConversationUI", "canAddContact fail, insert fail");
                    return;
                }
                n17 = z3Var;
            }
            c01.e2.m0(n17);
            r21.w.wi().k1(rVar.f459232a, 1);
            android.content.Context context = t1Var.f252811o;
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490006i8));
            java.lang.String str3 = rVar.f459232a;
            if (t1Var.f252811o instanceof com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI) {
                com.tencent.mm.sdk.platformtools.u3.i(new eg4.r1(t1Var, str3), 200L);
            }
        } else {
            if (!z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FMessageConversationUI", "canAddContact fail, username = " + rVar.f459232a);
                return;
            }
            r21.w.wi().k1(rVar.f459232a, 2);
        }
        t1Var.notifyDataSetChanged();
    }
}
