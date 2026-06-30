package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class wp implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.zp f133307d;

    public wp(com.tencent.mm.plugin.finder.view.zp zpVar) {
        this.f133307d = zpVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        com.tencent.mm.plugin.finder.view.tp tpVar = (com.tencent.mm.plugin.finder.view.tp) obj;
        com.tencent.mm.plugin.finder.view.zp zpVar = this.f133307d;
        zpVar.getClass();
        java.util.ArrayList arrayList = zpVar.f133487d;
        if (i17 != arrayList.size() - 1) {
            zpVar.f133485b.invoke(java.lang.Integer.valueOf(tpVar.f133146d));
            com.tencent.mm.ui.widget.dialog.y1 y1Var = zpVar.f133486c;
            if (y1Var != null) {
                y1Var.q();
            }
        } else {
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = zpVar.f133486c;
            com.tencent.mm.plugin.finder.view.gq gqVar = zpVar.f133489f;
            gqVar.f211798d = y1Var2;
            if (y1Var2 != null) {
                y1Var2.h(gqVar);
            }
        }
        arrayList.size();
    }
}
