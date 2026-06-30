package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f174028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        super(0);
        this.f174028d = textStatusCardFeedsActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f174028d;
        super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
        textStatusCardFeedsActivity.overridePendingTransition(0, 0);
        return jz5.f0.f302826a;
    }
}
