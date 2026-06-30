package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class ma extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f201957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f201957d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf((int) (((java.lang.Number) ((jz5.n) this.f201957d.f200435r).getValue()).intValue() * 0.75d));
    }
}
