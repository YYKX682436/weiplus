package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class rr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wr f205473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(com.tencent.mm.ui.chatting.viewitems.wr wrVar) {
        super(1);
        this.f205473d = wrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        z05.c cVar;
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        v05.b k17 = com.tencent.mm.ui.chatting.viewitems.wr.a(this.f205473d, msg).k();
        if (k17 == null || (cVar = (z05.c) k17.getCustom(k17.f432315e + 64)) == null || (str = cVar.l()) == null) {
            str = "";
        }
        return java.lang.Boolean.valueOf(str.length() > 0);
    }
}
