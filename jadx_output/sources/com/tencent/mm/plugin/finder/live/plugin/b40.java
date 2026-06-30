package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c40 f111973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f111974e;

    public b40(com.tencent.mm.plugin.finder.live.plugin.c40 c40Var, cm2.b0 b0Var) {
        this.f111973d = c40Var;
        this.f111974e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.plugin.finder.live.plugin.c40 c40Var = this.f111973d;
        boolean z17 = r4Var.Y1(c40Var.f112108d) && !r4Var.w1();
        com.tencent.mars.xlog.Log.i(c40Var.f112112h, "jump isAnchorLandscape:" + z17);
        cm2.b0 b0Var = this.f111974e;
        java.lang.Integer g17 = b0Var.g();
        if (g17 != null) {
            int intValue = g17.intValue();
            bf2.c cVar = bf2.c.f19598a;
            gk2.e eVar = c40Var.f112109e;
            java.lang.String jump_id = b0Var.f43331v.getJump_id();
            if (jump_id == null) {
                jump_id = "";
            }
            bf2.c.c(cVar, eVar, 5, intValue, jump_id, 0, null, 0, 0, null, 0, 1008, null);
        }
        if (b0Var.f43388g) {
            if (zl2.q4.f473933a.E()) {
                db5.t7.makeText(c40Var.f112108d, "getJumpInfo!!", 0).show();
            }
            mm2.e1 e1Var = (mm2.e1) c40Var.f112109e.a(mm2.e1.class);
            long j17 = e1Var.f328983m;
            long j18 = e1Var.f328988r.getLong(0);
            int i17 = b0Var.f43332w;
            java.lang.String e17 = xy2.c.e(c40Var.f112108d);
            gk2.e eVar2 = c40Var.f112109e;
            new ke2.v(j17, j18, i17, e17, ((mm2.e1) eVar2.a(mm2.e1.class)).f328985o, b0Var.f43387f, new com.tencent.mm.protobuf.g(b0Var.f43331v.toByteArray()), r4Var.f1(eVar2, null), ((mm2.e1) eVar2.a(mm2.e1.class)).f328993w, null, 512, null).l().K(new com.tencent.mm.plugin.finder.live.plugin.a40(b0Var, z17, c40Var));
        } else if (z17) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null && (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r60.class)) != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray("POST_PORTRAIT_DATA", b0Var.f43331v.toByteArray());
                bundle.putInt("POST_PORTRAIT_DATA_TYPE", b0Var.f43332w);
                r60Var.p1("POST_PORTRAIT", bundle);
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.c40.f112107m.a(c40Var.f112108d, b0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
