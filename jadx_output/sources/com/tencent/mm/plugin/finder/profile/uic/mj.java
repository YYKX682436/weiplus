package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class mj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        super(1);
        this.f123992d = f4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a callback = (yz5.a) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f123992d;
        f4Var.f123695s = true;
        f4Var.f123701y = callback;
        f4Var.R6(com.tencent.mm.R.id.rlb);
        return jz5.f0.f302826a;
    }
}
