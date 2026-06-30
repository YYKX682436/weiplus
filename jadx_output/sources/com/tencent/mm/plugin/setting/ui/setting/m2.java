package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161309d;

    public m2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161309d = selfQRCodeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161309d;
        int width = selfQRCodeUI.f160176e.getWidth();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) selfQRCodeUI.f160176e.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = width;
        selfQRCodeUI.f160176e.setLayoutParams(layoutParams);
    }
}
