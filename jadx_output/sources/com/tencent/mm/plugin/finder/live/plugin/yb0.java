package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yb0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f115181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f115182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f115183f;

    public yb0(cm2.g0 g0Var, com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, bw5.mb0 mb0Var) {
        this.f115181d = g0Var;
        this.f115182e = dc0Var;
        this.f115183f = mb0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f115181d.f43346v.getBoolean(2);
        bf2.c cVar = bf2.c.f19598a;
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f115182e;
        gk2.e eVar = dc0Var.f112255e;
        int i17 = z17 ? 4 : 3;
        bw5.mb0 mb0Var = this.f115183f;
        jz5.f0 f0Var = null;
        java.lang.String b17 = mb0Var != null ? mb0Var.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        bf2.c.c(cVar, eVar, i17, 12, b17, 0, null, 0, 4, null, 0, nd1.y0.CTRL_INDEX, null);
        java.lang.String b18 = mb0Var != null ? mb0Var.b() : null;
        if (b18 == null) {
            b18 = "";
        }
        java.lang.String str = dc0Var.f112258h;
        com.tencent.mars.xlog.Log.i(str, "click btn, categoryId = " + b18 + ", isLiked=" + z17);
        android.content.Context context = dc0Var.f112254d;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI != null) {
            bw5.g80 g80Var = new bw5.g80();
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            g80Var.f27733q = 2201;
            boolean[] zArr = g80Var.f27740x;
            zArr[12] = true;
            g80Var.f27725f = z17;
            zArr[3] = true;
            g80Var.f27724e = b18;
            zArr[4] = true;
            g80Var.f27727h = 0;
            zArr[6] = true;
            g80Var.f27732p = 6;
            zArr[11] = true;
            g80Var.f27726g = false;
            zArr[5] = true;
            ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Di(new qk.aa(mMFinderUI, g80Var, false, null, null, 28, null), dc0Var.f112266s);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "click btn, not activity");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
