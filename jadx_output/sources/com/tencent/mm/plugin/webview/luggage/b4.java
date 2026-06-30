package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public abstract class b4 extends sd.w {

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.h f182153k;

    public b4(android.app.Activity activity) {
        super(activity);
        java.util.LinkedList linkedList;
        this.f406660a = uw4.n.class;
        sd.f fVar = this.f406664e;
        synchronized (com.tencent.mm.plugin.webview.luggage.jsapi.t5.class) {
            com.tencent.mm.plugin.webview.luggage.jsapi.t5.f182467a = new java.util.LinkedList();
            com.tencent.mm.plugin.webview.luggage.jsapi.t5.b();
            linkedList = com.tencent.mm.plugin.webview.luggage.jsapi.t5.f182467a;
        }
        fVar.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            fVar.f406599a.add((java.lang.Class) it.next());
        }
        this.f182153k = new com.tencent.mm.plugin.webview.modeltools.h();
        nf.g gVar = ((sd.u) this.f406669j).f406653a.f406665f;
        gVar.f336584c.add(new com.tencent.mm.plugin.webview.luggage.a4(this, activity));
    }

    @Override // sd.w
    public void d() {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = (com.tencent.mm.plugin.webview.luggage.e0) b();
        e0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onAddInContainer");
        java.lang.String string = e0Var.f406657n.getString("float_ball_key");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(string);
        com.tencent.mm.plugin.webview.luggage.x3 x3Var = e0Var.E;
        com.tencent.mm.plugin.webview.luggage.x2 x2Var = e0Var.D;
        if (K0) {
            x2Var.b(5, com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("web-%s", e0Var.s())));
            x3Var.y(5, com.tencent.mm.plugin.multitask.s0.d(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(e0Var.s())));
        } else {
            x2Var.b(5, string);
            x3Var.y(5, string);
        }
        x2Var.c0("rawUrl", e0Var.s());
        x2Var.t0(e0Var.s());
        if (com.tencent.mm.sdk.platformtools.t8.K0(e0Var.t())) {
            x2Var.Z(e0Var.s());
        }
        e0Var.Y = true;
        if (e0Var.X) {
            x2Var.x();
            x3Var.z();
        }
        java.lang.String s17 = e0Var.s();
        if (s17 == null) {
            s17 = "";
        }
        java.lang.String s18 = e0Var.s();
        if (s18 == null) {
            s18 = "";
        }
        e0Var.F = new com.tencent.mm.plugin.handoff.model.HandOffURL(s17, s18, "");
        ((d73.i) i95.n0.c(d73.i.class)).Sb(e0Var.F);
        e0Var.l();
        k();
    }

    public final void k() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        android.content.Context context = this.f406661b;
        if (!(context instanceof com.tencent.mm.ui.MMActivity) || (swipeBackLayout = ((com.tencent.mm.ui.MMActivity) context).getSwipeBackLayout()) == null) {
            return;
        }
        if (((sd.u) this.f406669j).f406653a.f406663d.size() <= 1) {
            swipeBackLayout.setEnableGesture(true);
        } else {
            swipeBackLayout.setEnableGesture(false);
        }
    }
}
