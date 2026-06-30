package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class i4 implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f173973a;

    public i4(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f173973a = textStatusCardFeedsActivity;
    }

    @Override // bi4.m0
    public void a(int i17, java.lang.Object obj) {
        if (i17 == 1) {
            this.f173973a.onBackPressed();
        }
    }
}
