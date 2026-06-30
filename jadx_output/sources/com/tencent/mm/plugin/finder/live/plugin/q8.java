package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t8 f113970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(com.tencent.mm.plugin.finder.live.plugin.t8 t8Var) {
        super(0);
        this.f113970d = t8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        no0.l lVar = no0.m.f338730a;
        com.tencent.mm.plugin.finder.live.plugin.t8 t8Var = this.f113970d;
        int i17 = t8Var.f114357s + 1;
        t8Var.f114357s = i17;
        t8Var.f114356r.setText(lVar.b(i17, ":"));
        return jz5.f0.f302826a;
    }
}
