package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class r implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f190985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f190987f;

    public r(java.util.ArrayList arrayList, com.tencent.mm.pluginsdk.ui.otherway.v vVar, android.content.Context context) {
        this.f190985d = arrayList;
        this.f190986e = vVar;
        this.f190987f = context;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        jz5.f0 f0Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f190985d;
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) kz5.n0.a0(arrayList, i17);
        com.tencent.mm.pluginsdk.ui.otherway.v vVar = this.f190986e;
        if (wVar != null) {
            kb0.g gVar = vVar.f191010k;
            if (gVar != null) {
                gVar.e(wVar);
            }
            vVar.c(this.f190987f, wVar);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(vVar.h(), "onItemClick, position: " + i17 + ", dataList size: " + arrayList.size());
        }
    }
}
