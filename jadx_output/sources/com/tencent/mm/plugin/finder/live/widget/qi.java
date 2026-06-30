package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qi implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ri f119528d;

    public qi(com.tencent.mm.plugin.finder.live.widget.ri riVar) {
        this.f119528d = riVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.live.widget.xh xhVar;
        com.tencent.mm.plugin.finder.live.widget.xh xhVar2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vm2.d dVar = (vm2.d) holder.f293125i;
        vm2.c cVar = vm2.d.f438087f;
        kotlin.jvm.internal.o.d(dVar);
        r45.kv1 a17 = cVar.a(dVar);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveFansModifySettingWidget", "gift null, do nothing");
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.ri riVar = this.f119528d;
        if (riVar.f119645p == null) {
            android.content.Context context = riVar.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.xh xhVar3 = new com.tencent.mm.plugin.finder.live.widget.xh(context);
            xhVar3.setBackClickListener(new com.tencent.mm.plugin.finder.live.widget.pi(riVar));
            riVar.f119645p = xhVar3;
        }
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = riVar.getBasePlugin();
        if (basePlugin == null || (xhVar2 = riVar.f119645p) == null) {
            f0Var = null;
        } else {
            xhVar2.a(basePlugin);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null && (xhVar = riVar.f119645p) != null) {
            xhVar.setScope(riVar.getScope());
        }
        com.tencent.mm.plugin.finder.live.widget.xh xhVar4 = riVar.f119645p;
        if (xhVar4 != null) {
            xhVar4.h(riVar.f119646q, dVar.f438088d, a17, dVar.f438089e);
        }
    }
}
