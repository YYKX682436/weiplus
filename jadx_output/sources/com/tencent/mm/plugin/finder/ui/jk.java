package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class jk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129403d;

    public jk(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f129403d = finderShareFeedRelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem item) {
        java.lang.String str;
        r45.dm2 object_extend;
        java.lang.String username;
        java.lang.String str2;
        r45.dm2 object_extend2;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129403d;
        boolean M7 = finderShareFeedRelUI.M7(finderShareFeedRelUI.U1);
        finderShareFeedRelUI.A7(M7);
        so2.z1 z1Var = so2.z1.f410730a;
        java.lang.String str3 = "";
        if (M7) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = finderShareFeedRelUI.U1;
            if (finderContact == null || (str2 = finderContact.getUsername()) == null) {
                str2 = "";
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finderShareFeedRelUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderShareFeedRelUI.V1;
            long id6 = finderObject != null ? finderObject.getId() : 0L;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = finderShareFeedRelUI.V1;
            so2.z1.c(z1Var, V6, str2, 2, id6, (finderObject2 == null || (object_extend2 = finderObject2.getObject_extend()) == null) ? null : object_extend2.getString(62), false, 0, null, null, 0L, 992, null);
            ya2.g gVar = ya2.h.f460484a;
            l75.e0 e0Var = ya2.b2.O2;
            gVar.i(str2, 0);
            return true;
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = finderShareFeedRelUI.U1;
        if (finderContact2 == null || (str = finderContact2.getUsername()) == null) {
            str = "";
        }
        r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finderShareFeedRelUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = finderShareFeedRelUI.U1;
        if (finderContact3 != null && (username = finderContact3.getUsername()) != null) {
            str3 = username;
        }
        int i17 = db2.m0.f228066v;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = finderShareFeedRelUI.V1;
        long id7 = finderObject3 != null ? finderObject3.getId() : 0L;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = finderShareFeedRelUI.V1;
        so2.z1.c(z1Var, V62, str3, 1, id7, (finderObject4 == null || (object_extend = finderObject4.getObject_extend()) == null) ? null : object_extend.getString(62), false, 0, null, null, 0L, 992, null);
        ya2.h.f460484a.i(str, ya2.b2.Q2);
        return true;
    }
}
