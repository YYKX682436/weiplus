package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f174046d;

    public l4(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f174046d = textStatusCardFeedsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f174046d;
        if (textStatusCardFeedsActivity.isFinishing()) {
            return;
        }
        textStatusCardFeedsActivity.Z6();
    }
}
