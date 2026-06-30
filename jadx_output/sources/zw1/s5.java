package zw1;

/* loaded from: classes15.dex */
public class s5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f476795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476797d;

    public s5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17, ww1.b3 b3Var) {
        this.f476797d = walletCollectQrCodeUI;
        this.f476794a = a3Var;
        this.f476795b = i17;
        this.f476796c = b3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiF2fShortTermQrcode cgiBack.errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476797d;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || (fVar = fVar2.f70618d) == null) {
            return null;
        }
        ww1.a3 a3Var = this.f476794a;
        if (a3Var.C) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "has show error");
            return null;
        }
        a3Var.C = true;
        int i17 = fVar2.f70615a;
        ww1.b3 b3Var = this.f476796c;
        if (i17 == 0 && fVar2.f70616b == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((r45.nw) fVar).f381701f);
            r45.nw nwVar = (r45.nw) fVar2.f70618d;
            java.lang.String str = nwVar.f381699d;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(nwVar.f381702g);
            r45.nw nwVar2 = (r45.nw) fVar2.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "resp qrcode_type:%s，url：%s,fixed_fee :%s，fixed_desc:%s，payer_desc_placeholder：%s", valueOf, str, valueOf2, nwVar2.f381703h, nwVar2.f381705m);
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI2 = this.f476797d;
            r45.nw nwVar3 = (r45.nw) fVar2.f70618d;
            double d17 = nwVar3.f381702g;
            java.lang.String str2 = nwVar3.f381703h;
            boolean z17 = nwVar3.f381704i;
            java.lang.String str3 = nwVar3.f381705m;
            int i18 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            boolean w76 = walletCollectQrCodeUI2.w7(d17, str2, z17, str3);
            r45.nw nwVar4 = (r45.nw) fVar2.f70618d;
            if (nwVar4.f381701f == 2 || w76) {
                a3Var.f450099i = nwVar4.f381699d;
                a3Var.f450106p = nwVar4.f381700e;
                a3Var.f450101k = com.tencent.mm.wallet_core.ui.r1.j("" + ((r45.nw) fVar2.f70618d).f381702g, "100", 2, java.math.RoundingMode.HALF_UP);
                r45.nw nwVar5 = (r45.nw) fVar2.f70618d;
                a3Var.f450103m = nwVar5.f381703h;
                a3Var.f450104n = nwVar5.f381705m;
                a3Var.f450105o = nwVar5.f381704i;
                a3Var.E = java.lang.System.currentTimeMillis();
            } else {
                a3Var.f450088a = nwVar4.f381699d;
                a3Var.f450094d = nwVar4.f381700e;
                a3Var.D = java.lang.System.currentTimeMillis();
                walletCollectQrCodeUI.D7(a3Var);
            }
            int i19 = this.f476795b;
            walletCollectQrCodeUI.B7(i19);
            walletCollectQrCodeUI.O7(i19);
            ww1.y2.d(b3Var);
        } else {
            ww1.y2.e(b3Var, a3Var, fVar2.f70617c, walletCollectQrCodeUI.getContext());
        }
        return java.lang.Boolean.TRUE;
    }
}
