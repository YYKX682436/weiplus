package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var) {
        super(0);
        this.f117089d = r5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117089d;
        com.tencent.mm.ui.MMActivity N6 = r5Var.N6();
        if (!(N6 != null && N6.isFinishing())) {
            com.tencent.mm.ui.MMActivity N62 = r5Var.N6();
            if (!(N62 != null && N62.isDestroyed())) {
                if2.b.Y6(r5Var, qo0.b.f365444z2, null, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
