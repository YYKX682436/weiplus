package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f134414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f134415e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(yz5.p pVar, com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        super(0);
        this.f134414d = pVar;
        this.f134415e = mnVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.p pVar = this.f134414d;
        if (pVar != null) {
            pVar.invoke(-4036, this.f134415e.getContext().getResources().getString(com.tencent.mm.R.string.f7n));
        }
        return jz5.f0.f302826a;
    }
}
