package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.b9 f115163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(com.tencent.mm.plugin.finder.live.plugin.b9 b9Var) {
        super(0);
        this.f115163d = b9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.b9 b9Var = this.f115163d;
        int i17 = b9Var.f111989s - 1;
        b9Var.f111989s = i17;
        b9Var.f111988r.setText(java.lang.String.valueOf(i17));
        if (b9Var.f111989s <= 0) {
            ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) b9Var.f111992v).getValue()).d();
            b9Var.f111991u = false;
            b9Var.K0(8);
            if (b9Var.f111990t) {
                b9Var.f111990t = false;
            } else {
                dk2.xf W0 = b9Var.W0();
                if (W0 != null) {
                    ((dk2.r4) W0).d0(2, 0, new com.tencent.mm.plugin.finder.live.plugin.x8(b9Var));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
