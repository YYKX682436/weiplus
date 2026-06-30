package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120696d;

    public d0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120696d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "hasShowAnchorInteractionWishRedDot");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_INTERACTION_WISH_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        java.lang.Integer num = 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 3);
        if (num != null) {
            num.intValue();
            jSONObject.put("type", num.intValue());
        }
        jSONObject.put("sub_element", 1);
        jSONObject.put("sub_type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120696d;
        t0Var.getClass();
        ll2.e.b(ll2.e.f319133a, t0Var.C(), false, false, 6, null);
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "disposeInteractionWishRedDot path=".concat(t0Var.C()));
        r45.c04 data = t0Var.f120781r;
        kotlin.jvm.internal.o.g(data, "data");
        if (data.getLong(1) > 0 && data.getLong(0) > ((long) 0) && data.getLong(0) <= ((long) 3)) {
            if (t0Var.K == null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(t0Var.f118381d, 1, false);
                t0Var.K = k0Var;
                k0Var.f211872n = new com.tencent.mm.plugin.finder.live.wish.widget.m0(t0Var);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.live.wish.widget.p0(t0Var);
                k0Var.f211854d = new com.tencent.mm.plugin.finder.live.wish.widget.q0(t0Var);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = t0Var.K;
            if (k0Var2 != null) {
                k0Var2.v();
            }
        } else {
            ((com.tencent.mm.plugin.finder.live.wish.widget.e) ((jz5.n) t0Var.f120776J).getValue()).y(t0Var.f120781r, t0Var.f120783t, t0Var.f120784u, t0Var.f120788y);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
