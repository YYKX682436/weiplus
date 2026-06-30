package lz2;

/* loaded from: classes14.dex */
public class t implements pz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lz2.w f322353a;

    public t(lz2.w wVar) {
        this.f322353a = wVar;
    }

    @Override // pz2.c
    public void a(int i17, int i18, int i19, int i27) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        lz2.w wVar = this.f322353a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "auth result: %s, retry: %s", valueOf, java.lang.Integer.valueOf(wVar.f322361h));
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog = wVar.f322357d;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "identify success");
            wVar.f322361h++;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "auth success");
            if (wVar.f322361h == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.h6.CTRL_INDEX, 3);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.h6.CTRL_INDEX, 4);
            }
            re4.n.d(0);
            walletFaceIdDialog.f136986d.a(com.tencent.mm.R.drawable.f481456tf, new lz2.u(wVar, i18));
            return;
        }
        if (i17 != 2005 && i17 != 2007 && i17 != 2009 && i17 != 10308) {
            switch (i17) {
                case 2000:
                case 2001:
                case 2002:
                    break;
                default:
                    return;
            }
        }
        int i28 = wVar.f322361h + 1;
        wVar.f322361h = i28;
        if (i28 < 2) {
            walletFaceIdDialog.getWindow().setDimAmount(0.5f);
            walletFaceIdDialog.f136991i.setBackgroundResource(com.tencent.mm.R.drawable.aun);
            walletFaceIdDialog.f136992m.setBackground(null);
            walletFaceIdDialog.e(null);
            walletFaceIdDialog.f136990h.setVisibility(0);
            walletFaceIdDialog.f136988f.setVisibility(0);
            walletFaceIdDialog.f136987e.setText(com.tencent.mm.R.string.f491178c90);
            walletFaceIdDialog.f136988f.setText(com.tencent.mm.R.string.c8z);
            walletFaceIdDialog.f136987e.post(new lz2.q(walletFaceIdDialog));
            re4.n.d(2);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletFaceIdDialog", "face id failed: %s", java.lang.Integer.valueOf(wVar.f322360g));
        walletFaceIdDialog.getWindow().setDimAmount(0.5f);
        walletFaceIdDialog.f136991i.setBackgroundResource(com.tencent.mm.R.drawable.aun);
        walletFaceIdDialog.f136992m.setBackground(null);
        re4.n.d(1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.h6.CTRL_INDEX, 5);
        wVar.f322362i = true;
        if (wVar.f322360g != 0) {
            walletFaceIdDialog.e(new lz2.v(wVar));
            return;
        }
        walletFaceIdDialog.e(null);
        walletFaceIdDialog.f136987e.setText(com.tencent.mm.R.string.c8t);
        walletFaceIdDialog.f136988f.setVisibility(8);
        if (i17 == 10308) {
            re4.n.e(6, -1000223, i17, "too many trial");
        } else {
            re4.n.e(1000, -1000223, i17, "fingerprint error");
        }
    }
}
