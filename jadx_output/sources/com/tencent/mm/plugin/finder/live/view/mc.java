package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f116483a;

    /* renamed from: b, reason: collision with root package name */
    public final df2.ar f116484b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f116485c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f116486d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f116487e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f116488f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f116489g;

    public mc(android.view.ViewGroup root, df2.ar controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f116483a = root;
        this.f116484b = controller;
        this.f116485c = "LiveProductGiftCardWidget";
        this.f116486d = root.findViewById(com.tencent.mm.R.id.uuo);
        this.f116487e = root.findViewById(com.tencent.mm.R.id.uun);
        this.f116488f = root.findViewById(com.tencent.mm.R.id.uup);
    }

    public static final void a(com.tencent.mm.plugin.finder.live.view.mc mcVar, r45.lv1 lv1Var) {
        r45.ce0 ce0Var;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mars.xlog.Log.i(mcVar.f116485c, "jumpProductDetail");
        r45.y23 y23Var = new r45.y23();
        r45.uv1 uv1Var = (r45.uv1) lv1Var.getCustom(1);
        byte[] g17 = (uv1Var == null || (byteString = uv1Var.getByteString(3)) == null) ? null : byteString.g();
        if (g17 != null) {
            try {
                y23Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            if (y23Var != null || (ce0Var = (r45.ce0) y23Var.getCustom(8)) == null) {
            }
            com.tencent.mars.xlog.Log.i(mcVar.f116485c, "jumpProductDetail jumpInfo.appid:" + ce0Var.getString(0) + ", jumpInfo.path:" + ce0Var.getString(1));
            l81.b1 b1Var = new l81.b1();
            java.lang.String string = ce0Var.getString(0);
            if (string == null) {
                string = "";
            }
            b1Var.f317014b = string;
            java.lang.String string2 = ce0Var.getString(1);
            b1Var.f317022f = string2 != null ? string2 : "";
            b1Var.f317032k = 1205;
            float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
            if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
                f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
            }
            b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, (int) ((ae2.in.f3688a.h0() / 100.0f) * f17), null, false, null, false, null, k91.t2.f305768f, true, false, null, null, true, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, true, 0, false, true, false, false, null, null, null, false, null, null, false, -1073746308, 2045, null);
            dk2.ah ahVar = new dk2.ah();
            ahVar.f233218n = false;
            ahVar.f233223s = true;
            b1Var.f317028i = ahVar;
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context = mcVar.f116486d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gk2.e liveRoomData = mcVar.f116484b.getStore().getLiveRoomData();
            com.tencent.mm.plugin.finder.live.view.ub ubVar = mcVar.f116484b.f291099e;
            q4Var.n(context, liveRoomData, b1Var, ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null);
            return;
        }
        y23Var = null;
        if (y23Var != null) {
        }
    }

    public final void b(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f116483a.setVisibility(8);
        kotlinx.coroutines.r2 r2Var = this.f116489g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mars.xlog.Log.i(this.f116485c, "dismiss for ".concat(source));
    }
}
