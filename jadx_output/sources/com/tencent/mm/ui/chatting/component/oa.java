package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class oa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f199632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ta f199633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(java.util.List list, com.tencent.mm.ui.chatting.component.ta taVar) {
        super(0);
        this.f199632d = list;
        this.f199633e = taVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (com.tencent.mm.storage.f9 f9Var : this.f199632d) {
            com.tencent.mm.ui.chatting.component.ta taVar = this.f199633e;
            java.lang.Integer num = (java.lang.Integer) taVar.f199979n.get(java.lang.Long.valueOf(f9Var.getMsgId()));
            if (num == null) {
                num = 0;
            }
            kotlin.jvm.internal.o.d(num);
            int intValue = num.intValue();
            int b17 = taVar.f199978m.b(f9Var, intValue);
            if (b17 >= intValue) {
                taVar.f199979n.put(java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(b17));
            }
        }
        return jz5.f0.f302826a;
    }
}
