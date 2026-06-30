package eg4;

/* loaded from: classes11.dex */
public final class f implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.r f252697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f252698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252699f;

    public f(y35.r rVar, com.tencent.mm.storage.z3 z3Var, android.content.Context context) {
        this.f252697d = rVar;
        this.f252698e = z3Var;
        this.f252699f = context;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        y35.r rVar = this.f252697d;
        if (!z17) {
            if (z18) {
                r21.w.wi().k1(rVar.f459232a, 2);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "canAddContact fail, username = " + rVar.f459232a);
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(rVar.f459232a, true);
        boolean z19 = false;
        if (n17 != null && ((int) n17.E2) == 0) {
            z19 = true;
        }
        if (z19) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            com.tencent.mm.storage.z3 z3Var = this.f252698e;
            if (!K0) {
                z3Var.X1(str);
            }
            if (!((com.tencent.mm.storage.k4) c01.d9.b().q()).h0(z3Var)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "canAddContact fail, insert fail");
                return;
            }
            n17 = z3Var;
        }
        c01.e2.m0(n17);
        r21.w.wi().k1(rVar.f459232a, 1);
        android.content.Context context = this.f252699f;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490006i8));
    }
}
