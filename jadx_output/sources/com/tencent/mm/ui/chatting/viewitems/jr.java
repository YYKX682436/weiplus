package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class jr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wr f204281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(com.tencent.mm.ui.chatting.viewitems.wr wrVar) {
        super(1);
        this.f204281d = wrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        v05.b k17 = com.tencent.mm.ui.chatting.viewitems.wr.a(this.f204281d, msg).k();
        return java.lang.Integer.valueOf(k17 != null ? k17.getInteger(k17.f368365d + 6) : 0);
    }
}
