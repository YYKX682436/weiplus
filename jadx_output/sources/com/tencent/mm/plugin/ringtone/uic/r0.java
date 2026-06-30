package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class r0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158469d;

    public r0(com.tencent.mm.plugin.ringtone.uic.v0 v0Var) {
        this.f158469d = v0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        int a17;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        if (i17 < 0 || i17 >= wxRecyclerAdapter.getItemCount() - wxRecyclerAdapter.Z()) {
            com.tencent.mars.xlog.Log.e(pf5.o.TAG, "invalid position:" + i17);
            return;
        }
        ox3.a aVar = (ox3.a) wxRecyclerAdapter.getData().get(i17);
        aVar.getClass();
        boolean z17 = aVar.f349722e;
        if (z17) {
            if (by3.a.f36370b) {
                b21.m.g();
                ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
                b21.r b17 = b21.m.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
                if ((b17 == null || b17.N) ? false : true) {
                    b17.N = true;
                    b21.m.k(b17);
                }
                ll3.q0.d(b17);
            }
            by3.a.f36370b = false;
            a17 = 1;
        } else {
            a17 = by3.a.f36369a.a();
            if (a17 == 0) {
                return;
            }
        }
        for (ox3.a aVar2 : wxRecyclerAdapter.getData()) {
            if (aVar2.getItemId() != aVar.getItemId()) {
                aVar2.f349722e = false;
                wxRecyclerAdapter.d0(aVar2.getItemId(), java.lang.Boolean.FALSE);
            }
        }
        boolean z18 = !z17;
        aVar.f349722e = z18;
        vx3.i a18 = qx3.b.a(aVar.getItemId());
        if (a18 == null || (str = aVar.f349721d.f415588d) == null) {
            return;
        }
        if (aVar.f349722e) {
            boolean z19 = (a18.f441301r == null || a18.i().f257604b == null || !co4.c.b(a18.i())) ? false : true;
            androidx.appcompat.app.AppCompatActivity activity = this.f158469d.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.d3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).Q6(a18, str, z19);
        }
        if (a17 != 2) {
            com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158469d;
            long itemId = aVar.getItemId();
            boolean z27 = aVar.f349722e;
            v0Var.getClass();
            if (a18.j()) {
                android.app.Activity context = v0Var.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a19 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.ringtone.uic.v.class);
                kotlin.jvm.internal.o.f(a19, "get(...)");
                ((com.tencent.mm.plugin.ringtone.uic.v) a19).R6(a18, 39, 23, (r18 & 8) != 0 ? 0L : 0L, (r18 & 16) != 0 ? "" : null, (r18 & 32) != 0 ? 0 : 0);
                android.app.Activity context2 = v0Var.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.ringtone.uic.d3) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).O6(a18, str);
            } else {
                androidx.appcompat.app.AppCompatActivity activity2 = v0Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                ((com.tencent.mm.plugin.ringtone.uic.z1) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).P6(a18, itemId, z27, true, true);
            }
        } else {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.ringtone.uic.q0 q0Var = new com.tencent.mm.plugin.ringtone.uic.q0(this.f158469d);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(q0Var, 200L, false);
        }
        wxRecyclerAdapter.d0(aVar.getItemId(), java.lang.Boolean.valueOf(z18));
    }
}
