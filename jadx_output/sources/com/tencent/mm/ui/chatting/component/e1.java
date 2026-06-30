package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f198954d = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(((com.tencent.mm.storage.f9) it.getKey()).getMsgId() == this.f198954d.getMsgId());
    }
}
