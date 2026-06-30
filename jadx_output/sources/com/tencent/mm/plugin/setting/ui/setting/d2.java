package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f160930d;

    public d2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f160930d = selfQRCodeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(this.f160930d, com.tencent.mm.R.string.i87, 1).show();
    }
}
