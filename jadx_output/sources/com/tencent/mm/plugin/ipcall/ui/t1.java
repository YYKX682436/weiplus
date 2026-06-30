package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes13.dex */
public class t1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView f143010a;

    public t1(com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView iPCallDynamicTextView) {
        this.f143010a = iPCallDynamicTextView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView iPCallDynamicTextView = this.f143010a;
        double d17 = iPCallDynamicTextView.f142610d;
        if ((d17 <= 0.0d || iPCallDynamicTextView.f142612f >= iPCallDynamicTextView.f142613g) && (d17 >= 0.0d || iPCallDynamicTextView.f142612f <= iPCallDynamicTextView.f142613g)) {
            iPCallDynamicTextView.getClass();
            com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView.a(iPCallDynamicTextView, iPCallDynamicTextView.f142613g);
            return;
        }
        iPCallDynamicTextView.getClass();
        com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView.a(iPCallDynamicTextView, iPCallDynamicTextView.f142612f);
        iPCallDynamicTextView.f142612f += iPCallDynamicTextView.f142610d;
        iPCallDynamicTextView.f142619p.sendEmptyMessageDelayed(1, iPCallDynamicTextView.f142615i);
    }
}
