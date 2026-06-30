package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zb0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f115321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f115322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f115323f;

    public zb0(com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, bw5.mb0 mb0Var, cm2.g0 g0Var) {
        this.f115321d = dc0Var;
        this.f115322e = mb0Var;
        this.f115323f = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bf2.c cVar = bf2.c.f19598a;
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f115321d;
        gk2.e eVar = dc0Var.f112255e;
        jz5.f0 f0Var = null;
        bw5.mb0 mb0Var = this.f115322e;
        java.lang.String b17 = mb0Var != null ? mb0Var.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        bf2.c.c(cVar, eVar, 5, 12, b17, 0, null, 0, 5, null, 0, nd1.y0.CTRL_INDEX, null);
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean z17 = r4Var.Y1(dc0Var.f112254d) && !r4Var.w1();
        java.lang.String str = dc0Var.f112258h;
        com.tencent.mars.xlog.Log.i(str, "click bubble, isVisitorLandscape = " + z17);
        cm2.g0 g0Var = this.f115323f;
        if (!z17 || com.tencent.mm.ui.bk.d0()) {
            bw5.mb0 P0 = r4Var.P0(g0Var.f43346v);
            if (P0 != null) {
                android.view.ViewGroup viewGroup = dc0Var.f112259i;
                if (viewGroup == null) {
                    kotlin.jvm.internal.o.o("root");
                    throw null;
                }
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r4Var.r2(context, P0, bw5.ar0.TingScene_Live_CategoryBubble);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i(str, "[jumpTing] play info null!");
            }
        } else {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null && (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r60.class)) != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray("POST_TING_PORTRAIT_DATA", g0Var.f43346v.toByteArray());
                r60Var.p1("POST_TING_PORTRAIT", bundle);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
