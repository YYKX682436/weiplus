package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f133828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var) {
        super(0);
        this.f133828d = f2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f133828d.f134316d;
        if (hVar != null) {
            hVar.d0(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("multiTaskHelper");
        throw null;
    }
}
