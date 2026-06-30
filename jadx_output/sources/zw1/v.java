package zw1;

/* loaded from: classes9.dex */
public class v implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI f476823a;

    public v(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f476823a = collectCreateQRCodeNewUI;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString());
        com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = this.f476823a;
        if (K0) {
            collectCreateQRCodeNewUI.f96380g = "";
            collectCreateQRCodeNewUI.W6();
        } else {
            collectCreateQRCodeNewUI.f96380g = charSequence.toString();
            collectCreateQRCodeNewUI.W6();
        }
        com.tencent.mm.sdk.platformtools.u3.i(new zw1.u(this), 200L);
        return true;
    }
}
