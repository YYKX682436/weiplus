package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class nr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wr f204950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(com.tencent.mm.ui.chatting.viewitems.wr wrVar) {
        super(1);
        this.f204950d = wrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s05.d dVar;
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        l15.c a17 = com.tencent.mm.ui.chatting.viewitems.wr.a(this.f204950d, msg);
        java.util.List i17 = kz5.c0.i(0, 2, 3);
        v05.b k17 = a17.k();
        return java.lang.Boolean.valueOf(i17.contains(java.lang.Integer.valueOf((k17 == null || (dVar = (s05.d) k17.getCustom(k17.f432315e + 39)) == null) ? -1 : dVar.getType())));
    }
}
