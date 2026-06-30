package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.f10 f115009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f115010e;

    public x00(com.tencent.mm.plugin.finder.live.plugin.f10 f10Var, android.view.ViewGroup viewGroup) {
        this.f115009d = f10Var;
        this.f115010e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = this.f115009d;
        boolean z17 = true;
        if (((mm2.e0) f10Var.P0(mm2.e0.class)).P6()) {
            if (com.tencent.mm.plugin.finder.live.plugin.f10.t1(f10Var)) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", f10Var.f112485u);
                bundle.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
                f10Var.f112480p.statusChange(qo0.b.W, bundle);
                com.tencent.mars.xlog.Log.i(f10Var.f112481q, "[input-auto-wording] text = " + f10Var.f112485u);
            }
        } else if (!((mm2.c1) f10Var.P0(mm2.c1.class)).f328884t || !((mm2.c1) f10Var.P0(mm2.c1.class)).f328896v) {
            java.lang.String str = ((mm2.c1) f10Var.P0(mm2.c1.class)).f328890u;
            if (str == null || str.length() == 0) {
                java.lang.String str2 = ((mm2.c1) f10Var.P0(mm2.c1.class)).f328908x;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                string = !z17 ? ((mm2.c1) f10Var.P0(mm2.c1.class)).f328908x : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eby);
            } else {
                string = ((mm2.c1) f10Var.P0(mm2.c1.class)).f328890u;
            }
            db5.t7.g(this.f115010e.getContext(), string);
        } else if (!((mm2.c1) f10Var.P0(mm2.c1.class)).f328902w || kotlin.jvm.internal.o.b(f10Var.f112483s.getText(), f10Var.f112490z)) {
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_h);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            q4Var.P(string2);
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle2.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", f10Var.f112485u);
            bundle2.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
            f10Var.f112480p.statusChange(qo0.b.W, bundle2);
            com.tencent.mars.xlog.Log.i(f10Var.f112481q, "[input-auto-wording] loc2 text = " + f10Var.f112485u);
        }
        if (((mm2.c1) f10Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) f10Var.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
            vVar.a();
            vVar.c(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_LOADING_END);
        }
        f10Var.f112485u = "";
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
