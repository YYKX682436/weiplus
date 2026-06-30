package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusIndicator f174239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.textstatus.ui.StatusIndicator statusIndicator) {
        super(1);
        this.f174239d = statusIndicator;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mm.plugin.textstatus.ui.StatusIndicator statusIndicator = this.f174239d;
        statusIndicator.f173476h = floatValue;
        statusIndicator.requestLayout();
        return jz5.f0.f302826a;
    }
}
