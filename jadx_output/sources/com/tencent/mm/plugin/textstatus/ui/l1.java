package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f174044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.textstatus.ui.w1 w1Var) {
        super(0);
        this.f174044d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var = this.f174044d;
        return com.tencent.mm.ui.id.b(w1Var.getContext()).inflate(com.tencent.mm.R.layout.dx8, w1Var);
    }
}
