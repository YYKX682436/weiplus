package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class f8 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f200508a;

    public f8(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f200508a = chattingSendDataToDeviceUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f200508a;
        if (z17) {
            chattingSendDataToDeviceUI.finish();
        }
        chattingSendDataToDeviceUI.I = null;
    }
}
