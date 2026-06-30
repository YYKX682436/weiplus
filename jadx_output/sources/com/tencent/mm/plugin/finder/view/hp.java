package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class hp implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.kp f132267d;

    public hp(com.tencent.mm.plugin.finder.view.kp kpVar) {
        this.f132267d = kpVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        com.tencent.mm.plugin.finder.view.ep epVar = (com.tencent.mm.plugin.finder.view.ep) obj;
        com.tencent.mm.plugin.finder.view.kp kpVar = this.f132267d;
        kpVar.getClass();
        java.util.ArrayList arrayList = kpVar.f132525g;
        int size = arrayList.size() - 1;
        com.tencent.mm.plugin.finder.view.dp dpVar = kpVar.f132523e;
        if (i17 != size) {
            ((com.tencent.mm.plugin.finder.view.so) dpVar).d(epVar.f132050d);
        } else {
            com.tencent.mm.plugin.finder.view.so soVar = (com.tencent.mm.plugin.finder.view.so) dpVar;
            soVar.b().h(soVar.f133072f);
        }
        arrayList.size();
    }
}
