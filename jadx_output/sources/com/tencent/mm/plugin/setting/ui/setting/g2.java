package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class g2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161064d;

    public g2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161064d = selfQRCodeUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161064d;
        if (itemId == 1) {
            java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.C;
            selfQRCodeUI.getClass();
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(selfQRCodeUI, new com.tencent.mm.plugin.setting.ui.setting.v2(selfQRCodeUI), new com.tencent.mm.plugin.setting.ui.setting.d2(selfQRCodeUI));
            return;
        }
        if (itemId == 2) {
            java.lang.String str2 = com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.C;
            selfQRCodeUI.V6(0);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.U6(selfQRCodeUI);
        } else {
            if (iq.b.g(selfQRCodeUI.getContext()) || iq.b.x(selfQRCodeUI.getContext()) || iq.b.c(selfQRCodeUI.getContext(), true)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scan_report_enter_scene", 4);
            j45.l.j(selfQRCodeUI.getContext(), "scanner", ".ui.BaseScanUI", intent, null);
        }
    }
}
