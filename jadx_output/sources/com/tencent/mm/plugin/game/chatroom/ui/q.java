package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.game.chatroom.ui.q f138855a = new com.tencent.mm.plugin.game.chatroom.ui.q();

    public static final void a(com.tencent.mm.plugin.game.chatroom.ui.q qVar, w33.b bVar, com.tencent.mm.plugin.game.chatroom.ui.t tVar, boolean z17) {
        qVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!bVar.f442705a.isEmpty()) {
            arrayList.addAll(bVar.f442705a);
        }
        jz5.l lVar = bVar.f442706b;
        if (((java.lang.Boolean) lVar.f302833d).booleanValue()) {
            arrayList.addAll((java.util.Collection) lVar.f302834e);
        }
        jz5.l lVar2 = bVar.f442707c;
        if (((java.lang.Boolean) lVar2.f302833d).booleanValue()) {
            arrayList.addAll((java.util.Collection) lVar2.f302834e);
        }
        jz5.l lVar3 = bVar.f442708d;
        if (((java.lang.Boolean) lVar3.f302833d).booleanValue()) {
            arrayList.addAll((java.util.Collection) lVar3.f302834e);
        }
        if (!z17) {
            tVar.x(arrayList);
            return;
        }
        tVar.getClass();
        java.util.List a17 = e43.e.f249361a.a(arrayList);
        java.util.List list = tVar.f138861g;
        androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.game.chatroom.ui.r(list, a17), true).b(tVar);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.clear();
        arrayList2.addAll(a17);
    }
}
