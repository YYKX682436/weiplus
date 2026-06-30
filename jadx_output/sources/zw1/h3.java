package zw1;

/* loaded from: classes8.dex */
public class h3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zw1.i3 f476653a;

    public h3(zw1.i3 i3Var) {
        this.f476653a = i3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "CgiF2fShortTermQrcode cgiBack.errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        zw1.i3 i3Var = this.f476653a;
        if (!i3Var.f476663d.isFinishing()) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = i3Var.f476663d;
            if (!walletCollectQrCodeSettingUI.isDestroyed() && (fVar = fVar2.f70618d) != null) {
                if (fVar2.f70615a != 0 || fVar2.f70616b != 0) {
                    com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI.V6(walletCollectQrCodeSettingUI, fVar2.f70617c);
                } else if (((r45.nw) fVar).f381701f == 2) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("ftf_pay_url", ((r45.nw) fVar2.f70618d).f381699d);
                    intent.putExtra("key_error_level", ((r45.nw) fVar2.f70618d).f381700e);
                    intent.putExtra("ftf_fixed_fee", (int) ((r45.nw) fVar2.f70618d).f381702g);
                    intent.putExtra("ftf_fixed_fee_type", "1");
                    intent.putExtra("ftf_fixed_desc", ((r45.nw) fVar2.f70618d).f381703h);
                    walletCollectQrCodeSettingUI.setResult(-1, intent);
                    walletCollectQrCodeSettingUI.hideVKB();
                    walletCollectQrCodeSettingUI.finish();
                }
                return java.lang.Boolean.TRUE;
            }
        }
        return null;
    }
}
