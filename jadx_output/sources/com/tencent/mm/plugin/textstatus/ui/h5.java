package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f173951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        super(0);
        this.f173951d = textStatusCardFeedsActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f173951d.findViewById(com.tencent.mm.R.id.ovw);
        findViewById.setOnClickListener(com.tencent.mm.plugin.textstatus.ui.g5.f173896d);
        return findViewById;
    }
}
