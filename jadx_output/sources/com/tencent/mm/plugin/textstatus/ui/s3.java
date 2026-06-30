package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusIndicator f174277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.textstatus.ui.StatusIndicator statusIndicator) {
        super(0);
        this.f174277d = statusIndicator;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.StatusIndicator statusIndicator = this.f174277d;
        statusIndicator.removeView(statusIndicator.f173474f);
        statusIndicator.f173476h = -1.0f;
        statusIndicator.requestLayout();
        return jz5.f0.f302826a;
    }
}
