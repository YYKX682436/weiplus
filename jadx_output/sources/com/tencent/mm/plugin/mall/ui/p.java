package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI f148458a;

    public p(com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI) {
        this.f148458a = mallFunctionSettingsUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.List list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI = this.f148458a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.yk3 yk3Var = (r45.yk3) fVar.f70618d;
            int i18 = com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI.f148229o;
            mallFunctionSettingsUI.getClass();
            com.tencent.mm.protobuf.g gVar = yk3Var.f391176e;
            if (gVar != null) {
                mallFunctionSettingsUI.f148232f.setText(gVar.i());
            }
            com.tencent.mm.protobuf.g gVar2 = yk3Var.f391177f;
            if (gVar2 != null) {
                mallFunctionSettingsUI.f148233g.setText(gVar2.i());
            }
            java.util.LinkedList linkedList = ((r45.yk3) fVar.f70618d).f391175d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                int i19 = -1;
                while (true) {
                    boolean hasNext = it.hasNext();
                    list = mallFunctionSettingsUI.f148236m;
                    if (!hasNext) {
                        break;
                    }
                    r45.y55 y55Var = (r45.y55) it.next();
                    if (i19 != y55Var.f390807i) {
                        com.tencent.mm.plugin.mall.ui.s sVar = new com.tencent.mm.plugin.mall.ui.s(null);
                        sVar.f148477a = 0;
                        sVar.f148479c = y55Var.f390808m;
                        java.util.ArrayList arrayList = (java.util.ArrayList) list;
                        arrayList.add(sVar);
                        if (arrayList.size() - 2 >= 0) {
                            ((com.tencent.mm.plugin.mall.ui.s) arrayList.get(arrayList.size() - 2)).f148480d = true;
                        }
                    }
                    com.tencent.mm.plugin.mall.ui.s sVar2 = new com.tencent.mm.plugin.mall.ui.s(null);
                    sVar2.f148477a = 1;
                    sVar2.f148478b = y55Var;
                    ((java.util.ArrayList) list).add(sVar2);
                    i19 = y55Var.f390807i;
                }
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                if (!arrayList2.isEmpty()) {
                    ((com.tencent.mm.plugin.mall.ui.s) arrayList2.get(arrayList2.size() - 1)).f148480d = true;
                }
            }
            mallFunctionSettingsUI.f148234h.notifyDataSetChanged();
        } else {
            at4.j0.c(fVar.f70616b, fVar.f70617c).a(mallFunctionSettingsUI.getContext(), true);
        }
        return null;
    }
}
