package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.e1 f141382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.game.ui.e1 e1Var) {
        super(0);
        this.f141382d = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        x0.i0 i0Var = this.f141382d.f141371a;
        if (i0Var.size() > 1) {
            i0Var.remove(i0Var.size() - 1);
        }
        return jz5.f0.f302826a;
    }
}
