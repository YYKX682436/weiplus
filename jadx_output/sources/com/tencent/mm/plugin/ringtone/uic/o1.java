package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class o1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.x1 f158453d;

    public o1(com.tencent.mm.plugin.ringtone.uic.x1 x1Var) {
        this.f158453d = x1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        vx3.i iVar;
        int a17;
        cy3.e eVar = (cy3.e) obj;
        int i17 = eVar == null ? -1 : com.tencent.mm.plugin.ringtone.uic.n1.f158450a[eVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                androidx.appcompat.app.AppCompatActivity activity = this.f158453d.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f353948a;
                com.tencent.mm.plugin.ringtone.uic.k1 k1Var = (com.tencent.mm.plugin.ringtone.uic.k1) zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.k1.class);
                com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(k1Var.getContext(), k1Var.getContext().getResources().getString(com.tencent.mm.R.string.f492985ik1), false, 3, null);
                f17.show();
                kotlinx.coroutines.l.d(k1Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.j1(k1Var, f17, null), 3, null);
                androidx.appcompat.app.AppCompatActivity activity2 = this.f158453d.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                ((com.tencent.mm.plugin.ringtone.uic.d3) zVar.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).getClass();
                wx3.a.c(6L, "", 3, null, false, false, 56, null);
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity3 = this.f158453d.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            pf5.z zVar2 = pf5.z.f353948a;
            int i18 = ((com.tencent.mm.plugin.ringtone.uic.v) zVar2.a(activity3).a(com.tencent.mm.plugin.ringtone.uic.v.class)).f158499e;
            mx3.s sVar = mx3.u.f332620f;
            androidx.appcompat.app.AppCompatActivity activity4 = this.f158453d.getActivity();
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            mx3.s.a(sVar, activity4, 1, r17, i18, false, null, 48, null);
            androidx.appcompat.app.AppCompatActivity activity5 = this.f158453d.getActivity();
            kotlin.jvm.internal.o.g(activity5, "activity");
            vx3.i iVar2 = (vx3.i) ((com.tencent.mm.plugin.ringtone.uic.k1) zVar2.a(activity5).a(com.tencent.mm.plugin.ringtone.uic.k1.class)).f158440d.getValue();
            if (iVar2 != null) {
                com.tencent.mm.plugin.ringtone.uic.x1 x1Var = this.f158453d;
                boolean z17 = (iVar2.f441301r == null || iVar2.i().f257604b == null || !co4.c.b(iVar2.i())) ? false : true;
                androidx.appcompat.app.AppCompatActivity activity6 = x1Var.getActivity();
                kotlin.jvm.internal.o.g(activity6, "activity");
                ((com.tencent.mm.plugin.ringtone.uic.d3) zVar2.a(activity6).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).R6(iVar2, null, z17);
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity7 = this.f158453d.getActivity();
        kotlin.jvm.internal.o.g(activity7, "activity");
        pf5.z zVar3 = pf5.z.f353948a;
        vx3.i iVar3 = (vx3.i) ((com.tencent.mm.plugin.ringtone.uic.k1) zVar3.a(activity7).a(com.tencent.mm.plugin.ringtone.uic.k1.class)).f158440d.getValue();
        if (iVar3 != null) {
            com.tencent.mm.plugin.ringtone.uic.x1 x1Var2 = this.f158453d;
            if (iVar3.f441284a == null) {
                vx3.i f18 = mx3.i0.f();
                iVar3.f441284a = f18.f441284a;
                iVar = f18;
            } else {
                iVar = iVar3;
            }
            dk4.a aVar = iVar.f441284a;
            if (aVar != null) {
                aVar.f234475l = false;
            }
            if (x1Var2.f158542e) {
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
            x1Var2.f158542e = !x1Var2.f158542e;
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.ringtone.uic.l1(x1Var2));
            if (x1Var2.f158542e) {
                boolean z18 = (iVar.f441301r == null || iVar.i().f257604b == null || !co4.c.b(iVar.i())) ? false : true;
                androidx.appcompat.app.AppCompatActivity activity8 = x1Var2.getActivity();
                kotlin.jvm.internal.o.g(activity8, "activity");
                ((com.tencent.mm.plugin.ringtone.uic.d3) zVar3.a(activity8).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).Q6(iVar, null, z18);
            }
            if (a17 == 2) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.ringtone.uic.m1 m1Var = new com.tencent.mm.plugin.ringtone.uic.m1(x1Var2);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(m1Var, 200L, false);
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity9 = x1Var2.getActivity();
            kotlin.jvm.internal.o.g(activity9, "activity");
            androidx.lifecycle.c1 a18 = zVar3.a(activity9).a(com.tencent.mm.plugin.ringtone.uic.z1.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            com.tencent.mm.plugin.ringtone.uic.z1 z1Var = (com.tencent.mm.plugin.ringtone.uic.z1) a18;
            long hashCode = c01.z1.r().hashCode();
            boolean z19 = x1Var2.f158542e;
            boolean z27 = !iVar.j();
            dk4.a aVar2 = iVar.f441284a;
            z1Var.P6(iVar, hashCode, z19, z27, aVar2 != null ? aVar2.f234475l : false);
        }
    }
}
