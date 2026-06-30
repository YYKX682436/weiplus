package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public final class pn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f199726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        super(0);
        this.f199726d = hoVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f199726d.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : com.tencent.mm.ui.chatting.component.ho.E.entrySet()) {
            arrayList.add(new com.tencent.mm.ui.chatting.component.mg(((java.lang.Number) entry.getKey()).intValue(), ((java.lang.Number) entry.getValue()).intValue(), false, 4, null));
        }
        return arrayList;
    }
}
