package wo3;

/* loaded from: classes9.dex */
public final class b extends com.tencent.mm.modelbase.i {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f448141n;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f448142m;

    public b(java.lang.String bindSerial, java.lang.String bankType, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(bindSerial, "bindSerial");
        kotlin.jvm.internal.o.g(bankType, "bankType");
        this.f448142m = bindSerial;
        r45.h26 h26Var = new r45.h26();
        java.lang.String Ni = to3.c0.Ai().Ni(196617);
        java.lang.String e17 = yo3.m.e();
        java.lang.String Ni2 = to3.c0.Ai().Ni(196628);
        Ni2 = android.text.TextUtils.isEmpty(Ni2) ? wo.w0.k() : Ni2;
        java.lang.String str2 = "" + (java.lang.System.currentTimeMillis() / 1000);
        int random = ((int) (java.lang.Math.random() * 1000000)) + 1000000;
        if (android.text.TextUtils.isEmpty(e17)) {
            str = Ni2 + '&' + str2 + '&' + random;
        } else {
            str = Ni2 + '&' + str2 + '&' + random + '&' + e17;
        }
        com.tencent.mm.wallet_core.model.g.c().getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        java.lang.String genUserSig = com.tenpay.ndk.CertUtil.getInstance().genUserSig(Ni, str);
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, null);
        int a17 = to3.c0.Ai().wi().a();
        h26Var.f375785d = Ni;
        h26Var.f375786e = str;
        h26Var.f375787f = genUserSig;
        h26Var.f375789h = bankType;
        h26Var.f375788g = bindSerial;
        h26Var.f375791m = str3 != null ? java.lang.Integer.parseInt(str3) : 0;
        h26Var.f375790i = i17;
        h26Var.f375792n = a17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = h26Var;
        lVar.f70665b = new r45.i26();
        lVar.f70667d = 7140;
        lVar.f70666c = "/cgi-bin/mmpay-bin/offlinesetpayment";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        p(lVar.a());
        this.f70649i = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSetOfflinePayment", "do setpayment: " + bankType + ", " + bindSerial + ", " + a17);
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard f17;
        r45.i26 i26Var = (r45.i26) fVar;
        if (i17 == 0 && i18 == 0) {
            if ((i26Var != null && i26Var.f376689d == 0) && (f17 = vr4.f1.wi().Ai().f(this.f448142m)) != null) {
                yo3.f fVar2 = yo3.f.f464145a;
                java.lang.String field_bindSerial = f17.field_bindSerial;
                kotlin.jvm.internal.o.f(field_bindSerial, "field_bindSerial");
                yo3.d dVar = yo3.f.f464146b;
                if (dVar == null) {
                    kotlin.jvm.internal.o.o("sImpl");
                    throw null;
                }
                dVar.d(field_bindSerial);
            }
        }
        f448141n = false;
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        f448141n = true;
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }
}
