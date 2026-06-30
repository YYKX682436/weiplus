package zw1;

/* loaded from: classes15.dex */
public class c6 extends ww1.z2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476598f;

    public c6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476598f = walletCollectQrCodeUI;
    }

    @Override // ww1.z2
    public void a() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476598f;
        this.f450377e = (android.widget.ImageView) walletCollectQrCodeUI.findViewById(com.tencent.mm.R.id.c4h);
        walletCollectQrCodeUI.f96445q.setOnClickListener(new zw1.b6(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "facingreceiveremerchantapplydot";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f476598f.f96445q;
    }
}
