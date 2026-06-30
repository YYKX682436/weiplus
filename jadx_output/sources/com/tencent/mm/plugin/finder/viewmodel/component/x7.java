package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class x7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e8 f136415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var) {
        super(0);
        this.f136415d = e8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var = this.f136415d;
        e8Var.T6();
        e8Var.T6();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "requestInit CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(e8Var.f134213o, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.z7(e8Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
