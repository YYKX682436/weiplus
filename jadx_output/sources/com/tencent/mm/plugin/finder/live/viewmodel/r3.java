package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes5.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.u3 f117356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.finder.live.viewmodel.u3 u3Var) {
        super(0);
        this.f117356d = u3Var;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.u3 u3Var = this.f117356d;
        return kotlinx.coroutines.l.d(u3Var.getMainScope(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.q3(u3Var, null), 3, null);
    }
}
