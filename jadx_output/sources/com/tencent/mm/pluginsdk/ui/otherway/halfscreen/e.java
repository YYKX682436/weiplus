package com.tencent.mm.pluginsdk.ui.otherway.halfscreen;

/* loaded from: classes8.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f190951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kb0.g f190952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.halfscreen.i f190954g;

    public e(java.util.ArrayList arrayList, kb0.g gVar, com.tencent.mm.pluginsdk.ui.otherway.v vVar, com.tencent.mm.pluginsdk.ui.otherway.halfscreen.i iVar) {
        this.f190951d = arrayList;
        this.f190952e = gVar;
        this.f190953f = vVar;
        this.f190954g = iVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        jz5.f0 f0Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f190951d;
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) kz5.n0.a0(arrayList, i17);
        com.tencent.mm.pluginsdk.ui.otherway.halfscreen.i iVar = this.f190954g;
        if (wVar != null) {
            this.f190952e.e(wVar);
            com.tencent.mm.pluginsdk.ui.otherway.v vVar = this.f190953f;
            vVar.c(vVar.f191000a, wVar);
            iVar.getActivity().finish();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(iVar.f190959d, "onItemClick, position: " + i17 + ", dataList size: " + arrayList.size());
        }
    }
}
