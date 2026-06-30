package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f136288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var) {
        super(0);
        this.f136288d = f2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f136288d.f134316d;
        if (hVar != null) {
            hVar.d0(false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("multiTaskHelper");
        throw null;
    }
}
