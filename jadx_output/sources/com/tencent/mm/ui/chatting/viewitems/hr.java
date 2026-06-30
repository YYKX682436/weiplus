package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class hr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.hr f204142d = new com.tencent.mm.ui.chatting.viewitems.hr();

    public hr() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        w05.a aVar;
        java.lang.String R;
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        l15.c cVar = new l15.c();
        java.lang.String U1 = msg.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        return java.lang.Boolean.valueOf(((k17 == null || (aVar = (w05.a) k17.getCustom(k17.f432315e + 56)) == null || (R = aVar.R()) == null) ? 0 : com.tencent.mm.storage.m2.a(R)) > 0);
    }
}
