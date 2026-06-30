package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f200056d = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((java.lang.Number) obj).longValue() == this.f200056d.getMsgId());
    }
}
