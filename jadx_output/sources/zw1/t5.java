package zw1;

/* loaded from: classes15.dex */
public class t5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f476808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476810d;

    public t5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17, ww1.b3 b3Var) {
        this.f476810d = walletCollectQrCodeUI;
        this.f476807a = a3Var;
        this.f476808b = i17;
        this.f476809c = b3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiF2fShortTermQrcodeMch cgiBack.errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476810d;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || (fVar = fVar2.f70618d) == null) {
            return null;
        }
        ww1.a3 a3Var = this.f476807a;
        if (a3Var.C) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "has show error");
            return null;
        }
        a3Var.C = true;
        int i17 = fVar2.f70615a;
        ww1.b3 b3Var = this.f476809c;
        if (i17 == 0 && fVar2.f70616b == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((r45.lw) fVar).f379870f);
            r45.lw lwVar = (r45.lw) fVar2.f70618d;
            java.lang.String str = lwVar.f379868d;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(lwVar.f379871g);
            r45.lw lwVar2 = (r45.lw) fVar2.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "resp qrcode_type:%s，url：%s,fixed_fee :%s，fixed_desc:%s，payer_desc_placeholder：%s", valueOf, str, valueOf2, lwVar2.f379872h, lwVar2.f379875n);
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI2 = this.f476810d;
            r45.lw lwVar3 = (r45.lw) fVar2.f70618d;
            double d17 = lwVar3.f379871g;
            java.lang.String str2 = lwVar3.f379872h;
            boolean z17 = lwVar3.f379874m;
            java.lang.String str3 = lwVar3.f379875n;
            int i18 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            boolean w76 = walletCollectQrCodeUI2.w7(d17, str2, z17, str3);
            r45.lw lwVar4 = (r45.lw) fVar2.f70618d;
            if (lwVar4.f379870f == 2 || w76) {
                a3Var.f450099i = lwVar4.f379868d;
                a3Var.f450106p = lwVar4.f379869e;
                a3Var.f450101k = com.tencent.mm.wallet_core.ui.r1.j("" + ((r45.lw) fVar2.f70618d).f379871g, "100", 2, java.math.RoundingMode.HALF_UP);
                r45.lw lwVar5 = (r45.lw) fVar2.f70618d;
                a3Var.f450100j = lwVar5.f379873i;
                a3Var.f450103m = lwVar5.f379872h;
                a3Var.f450104n = lwVar5.f379875n;
                a3Var.f450105o = lwVar5.f379874m;
                a3Var.E = java.lang.System.currentTimeMillis();
            } else {
                a3Var.f450088a = lwVar4.f379868d;
                a3Var.f450094d = lwVar4.f379869e;
                a3Var.f450090b = lwVar4.f379873i;
                a3Var.D = java.lang.System.currentTimeMillis();
                walletCollectQrCodeUI.D7(a3Var);
            }
            int i19 = this.f476808b;
            walletCollectQrCodeUI.B7(i19);
            walletCollectQrCodeUI.O7(i19);
            ww1.y2.d(b3Var);
        } else {
            ww1.y2.e(b3Var, a3Var, fVar2.f70617c, walletCollectQrCodeUI.getContext());
        }
        return java.lang.Boolean.TRUE;
    }
}
