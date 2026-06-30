package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f134540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        super(0);
        this.f134540d = mnVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f134540d;
        mnVar.S6().f107433d = mnVar.f135179d;
        mnVar.S6().d(mnVar.f135182g);
        mnVar.S6().requestRefresh();
        mnVar.V6(true);
        return jz5.f0.f302826a;
    }
}
