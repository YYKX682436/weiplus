package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        super(0);
        this.f117135d = a1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117135d;
        com.tencent.mars.xlog.Log.i(a1Var.f116871d, "postBtn set enabled");
        a1Var.U6().setEnabled(true);
        return jz5.f0.f302826a;
    }
}
