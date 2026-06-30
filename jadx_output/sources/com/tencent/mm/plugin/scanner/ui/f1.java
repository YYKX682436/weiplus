package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes10.dex */
public class f1 implements com.tencent.mm.plugin.scanner.view.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanCardUI f159546a;

    public f1(com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI) {
        this.f159546a = scanCardUI;
    }

    @Override // com.tencent.mm.plugin.scanner.view.q
    public void a(long j17, android.os.Bundle bundle) {
        if (bundle.containsKey("param_card_bitmap")) {
            android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bundle.getByteArray("param_card_bitmap"));
            com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI = this.f159546a;
            if (scanCardUI.f159331d == 11) {
                com.tencent.mm.autogen.events.ScanCardResultEvent scanCardResultEvent = new com.tencent.mm.autogen.events.ScanCardResultEvent();
                am.rs rsVar = scanCardResultEvent.f54728g;
                rsVar.f7837a = "identity_pay_auth";
                rsVar.f7838b = 1;
                rsVar.f7839c = G;
                scanCardResultEvent.e();
                scanCardUI.finish();
            }
        }
    }
}
