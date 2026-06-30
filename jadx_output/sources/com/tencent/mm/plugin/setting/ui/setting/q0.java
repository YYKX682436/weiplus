package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161458d;

    public q0(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f161458d = colorfulChatroomQRCodeUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f161458d.getContext(), com.tencent.mm.R.string.i87, 1).show();
    }
}
