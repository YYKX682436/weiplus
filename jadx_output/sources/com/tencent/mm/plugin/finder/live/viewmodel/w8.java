package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes8.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.x8 f117518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.plugin.finder.live.viewmodel.x8 x8Var) {
        super(1);
        this.f117518d = x8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.viewmodel.x8 x8Var = this.f117518d;
        if (booleanValue) {
            com.tencent.mm.plugin.finder.live.viewmodel.x8.O6(x8Var, true);
        } else {
            db5.e1.L(x8Var.getContext(), false, x8Var.getContext().getString(com.tencent.mm.R.string.evc), "", x8Var.getContext().getString(com.tencent.mm.R.string.ed9), x8Var.getContext().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.finder.live.viewmodel.u8(x8Var), new com.tencent.mm.plugin.finder.live.viewmodel.v8(x8Var), com.tencent.mm.R.color.a_0, 0);
        }
        return jz5.f0.f302826a;
    }
}
