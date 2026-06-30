package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fq extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.jq f134418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(com.tencent.mm.plugin.finder.viewmodel.component.jq jqVar) {
        super(2);
        this.f134418d = jqVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        if (((java.lang.Boolean) obj2).booleanValue()) {
            com.tencent.mm.plugin.finder.viewmodel.component.jq jqVar = this.f134418d;
            jqVar.getActivity().getWindow().getDecorView().post(new com.tencent.mm.plugin.finder.viewmodel.component.eq(jqVar));
        }
        return jz5.f0.f302826a;
    }
}
