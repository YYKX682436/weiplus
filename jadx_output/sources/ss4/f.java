package ss4;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412056d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412057e;

    public f(java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo call");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qa3();
        lVar.f70665b = new r45.ra3();
        lVar.f70666c = "/cgi-bin/mmpay-bin/bankresource";
        lVar.f70667d = 1650;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412057e = a17;
        a17.setIsUserCmd(true);
        r45.qa3 qa3Var = (r45.qa3) a17.f70710a.f70684a;
        qa3Var.f383791d = linkedList;
        qa3Var.f383792e = at4.g0.c();
        if (!h45.y.c()) {
            qa3Var.f383793f = h45.y.f278968a;
        }
        com.tencent.mm.wallet_core.ui.r1.q0(42, 1);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412056d = u0Var;
        return dispatch(sVar, this.f412057e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1650;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo onGYNetEnd,errType=" + i18 + "errCode=" + i19);
        if (i18 == 0 && i19 == 0) {
            r45.ra3 ra3Var = (r45.ra3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBankcardLogo", "respone %s", ra3Var.f384693g);
            java.util.LinkedList linkedList = ra3Var.f384690d;
            if (linkedList != null && linkedList.size() != 0) {
                com.tencent.mm.autogen.events.SaveBankLogoEvent saveBankLogoEvent = new com.tencent.mm.autogen.events.SaveBankLogoEvent();
                saveBankLogoEvent.f54723g.f7361a = linkedList;
                saveBankLogoEvent.e();
            }
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC;
            java.lang.String str2 = ra3Var.f384693g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            c17.x(u3Var, str2);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        } else {
            com.tencent.mm.wallet_core.ui.r1.q0(43, 1);
        }
        this.f412056d.onSceneEnd(i18, i19, str, this);
    }
}
