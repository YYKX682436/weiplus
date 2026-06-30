package zw1;

/* loaded from: classes15.dex */
public class f6 extends ww1.z2 {

    /* renamed from: f, reason: collision with root package name */
    public final int f476628f;

    /* renamed from: g, reason: collision with root package name */
    public int f476629g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f476630h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476631i;

    public f6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        this.f476631i = walletCollectQrCodeUI;
        this.f476628f = i17;
    }

    @Override // ww1.z2, com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        android.widget.TextView textView = this.f450376d;
        if (textView != null) {
            if (!z17) {
                textView.setVisibility(8);
            } else if (this.f476631i.f96435d == 2) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(this.f476629g);
                this.f450376d.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        android.widget.ImageView imageView = this.f450377e;
        if (imageView == null) {
            return true;
        }
        imageView.setVisibility(8);
        return true;
    }

    @Override // ww1.z2
    public void a() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476631i;
        ww1.b3 b3Var = walletCollectQrCodeUI.f96439h;
        this.f450376d = b3Var.f450133g;
        this.f450377e = b3Var.f450135h;
        b3Var.f450125c.setOnClickListener(new zw1.d6(this));
        walletCollectQrCodeUI.f96439h.f450124b0.setOnClickListener(new zw1.e6(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        int i17 = this.f476628f;
        if (i17 == 4 || i17 == 5) {
            this.f476630h = "facingreceiveremerchantapplydot";
            this.f476629g = 40;
        } else {
            this.f476630h = "facingreceiveremerchantdot";
            this.f476629g = 41;
        }
        return this.f476630h;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f476631i.f96438g.f450125c;
    }

    @Override // ww1.z2, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        android.widget.ImageView imageView = this.f450377e;
        if (imageView != null) {
            if (!z17) {
                imageView.setVisibility(8);
            } else if (this.f476631i.f96435d == 2) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(this.f476629g);
                this.f450377e.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
        android.widget.TextView textView = this.f450376d;
        if (textView == null) {
            return true;
        }
        textView.setVisibility(8);
        return true;
    }
}
