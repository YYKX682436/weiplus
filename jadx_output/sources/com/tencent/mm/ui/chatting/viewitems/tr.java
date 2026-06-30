package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class tr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wr f205635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(com.tencent.mm.ui.chatting.viewitems.wr wrVar) {
        super(1);
        this.f205635d = wrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        w05.h hVar;
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        v05.b k17 = com.tencent.mm.ui.chatting.viewitems.wr.a(this.f205635d, msg).k();
        return java.lang.Boolean.valueOf((k17 == null || (hVar = (w05.h) k17.getCustom(k17.f432315e + 74)) == null) ? false : hVar.C());
    }
}
