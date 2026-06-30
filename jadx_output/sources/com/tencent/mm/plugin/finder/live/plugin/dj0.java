package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dj0 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ej0 f112297a;

    public dj0(com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var) {
        this.f112297a = ej0Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        kn0.p pVar;
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var = this.f112297a;
        if (ej0Var.f112429q) {
            if (ej0Var.f112428p.getLiveRole() == 1) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                if (r4Var.W1(ej0Var.S0()) || r4Var.z1(ej0Var.S0())) {
                    if (sn0.b.f409964e2 == null) {
                        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
                        sn0.b.f409964e2 = new sn0.b();
                    }
                    sn0.b bVar = sn0.b.f409964e2;
                    kotlin.jvm.internal.o.d(bVar);
                    bVar.D.f309581a = true;
                } else {
                    if (in0.q.f292769b2 == null) {
                        in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
                    }
                    in0.q qVar = in0.q.f292769b2;
                    kotlin.jvm.internal.o.d(qVar);
                    qVar.D.f309581a = true;
                }
            } else {
                co0.b c17 = co0.b.f43709e2.c(((mm2.e1) ej0Var.P0(mm2.e1.class)).f328988r.getLong(0));
                if (c17 != null && (pVar = c17.D) != null) {
                    pVar.f309581a = true;
                }
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
            ej0Var.f112428p.statusChange(qo0.b.B, bundle);
            if (ej0Var.f112428p.getLiveRole() != 1) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Mj(true, ml2.z1.f328333g);
                return;
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.U = true;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.V = false;
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.f328352g;
            ml2.z1 z1Var = ml2.z1.f328331e;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
        }
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        qo0.c.a(this.f112297a.f112428p, qo0.b.G, null, 2, null);
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        qo0.c.a(this.f112297a.f112428p, qo0.b.E, null, 2, null);
    }
}
