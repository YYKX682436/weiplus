package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class h8 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f201663a;

    public h8(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f201663a = chattingSendDataToDeviceUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f201663a;
        chattingSendDataToDeviceUI.H = null;
        if (z17) {
            chattingSendDataToDeviceUI.finish();
        }
    }
}
