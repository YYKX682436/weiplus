package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.p6 f134701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.tencent.mm.plugin.finder.viewmodel.component.p6 p6Var) {
        super(0);
        this.f134701d = p6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.p6 p6Var = this.f134701d;
        p6Var.T6();
        p6Var.T6();
        com.tencent.mars.xlog.Log.i(p6Var.f135527p, "requestInit CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(p6Var.f135526o, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.k6(p6Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
