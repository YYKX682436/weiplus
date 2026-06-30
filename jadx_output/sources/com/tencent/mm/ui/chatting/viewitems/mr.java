package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class mr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wr f204601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(com.tencent.mm.ui.chatting.viewitems.wr wrVar) {
        super(1);
        this.f204601d = wrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        return java.lang.Boolean.valueOf(te5.b.f418611a.a(com.tencent.mm.ui.chatting.viewitems.wr.a(this.f204601d, msg).k()));
    }
}
