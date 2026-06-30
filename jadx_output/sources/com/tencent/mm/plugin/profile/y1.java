package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f154742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.MMActivity mMActivity) {
        super(0);
        this.f154741d = h0Var;
        this.f154742e = mMActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = this.f154741d;
        if (h0Var.f310123d == null) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f154742e);
            e4Var.f211780g = 2;
            e4Var.d(com.tencent.mm.R.string.gga);
            e4Var.f211779f = true;
            h0Var.f310123d = e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
