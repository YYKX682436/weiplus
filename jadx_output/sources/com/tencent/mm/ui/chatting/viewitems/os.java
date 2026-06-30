package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes16.dex */
public final class os extends kotlin.jvm.internal.q implements yz5.l {
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wr C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os(com.tencent.mm.ui.chatting.viewitems.wr wrVar) {
        super(1);
        this.C = wrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        w05.h hVar;
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        v05.b k17 = com.tencent.mm.ui.chatting.viewitems.wr.a(this.C, msg).k();
        return java.lang.Boolean.valueOf((k17 == null || (hVar = (w05.h) k17.getCustom(k17.f432315e + 74)) == null) ? false : hVar.C());
    }
}
