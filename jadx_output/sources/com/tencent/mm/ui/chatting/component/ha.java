package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class ha extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ta f199156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(com.tencent.mm.ui.chatting.component.ta taVar) {
        super(1);
        this.f199156d = taVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.f9 it = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf((it.getType() == 1 || it.T2()) && com.tencent.mm.sdk.platformtools.t8.D0(it.Q0(), this.f199156d.f198580d.x()));
    }
}
