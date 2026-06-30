package com.tencent.mm.ui.chatting.component;

/* loaded from: classes7.dex */
public final class ja extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ta f199262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(com.tencent.mm.ui.chatting.component.ta taVar) {
        super(1);
        this.f199262d = taVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        return java.lang.Boolean.valueOf((longValue == 0 || ((com.tencent.mm.ui.chatting.component.sa) this.f199262d.f199989x).b(longValue) == null) ? false : true);
    }
}
