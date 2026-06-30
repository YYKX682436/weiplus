package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class q2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161460d;

    public q2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161460d = selfQRCodeUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.C;
        this.f161460d.X6();
        return false;
    }
}
