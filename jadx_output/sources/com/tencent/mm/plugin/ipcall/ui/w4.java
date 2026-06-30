package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class w4 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.x4 f143059a;

    public w4(com.tencent.mm.plugin.ipcall.ui.x4 x4Var) {
        this.f143059a = x4Var;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI = this.f143059a.f143075d;
        if (!iPCallShareCouponUI.G) {
            i17++;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.T6(iPCallShareCouponUI);
                return;
            } else {
                if (i17 != 2) {
                    return;
                }
                com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.U6(iPCallShareCouponUI);
                return;
            }
        }
        iPCallShareCouponUI.getClass();
        r45.zr3 e17 = t83.f.e();
        if (e17 == null || com.tencent.mm.sdk.platformtools.t8.K0(e17.f392330t)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", e17.f392330t);
        intent.putExtra("showShare", false);
        j45.l.j(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
