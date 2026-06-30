package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w5 f193102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.sdk.platformtools.w5 w5Var) {
        super(0);
        this.f193102d = w5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.w5 w5Var = this.f193102d;
        if (w5Var != null) {
            w5Var.onCompletion();
        }
        return jz5.f0.f302826a;
    }
}
