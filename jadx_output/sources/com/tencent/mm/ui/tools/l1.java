package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class l1 implements i35.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f210540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qk.o f210541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f210542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f210543g;

    public l1(com.tencent.mm.storage.z3 z3Var, qk.o oVar, java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f210540d = z3Var;
        this.f210541e = oVar;
        this.f210542f = weakReference;
        this.f210543g = z17;
    }

    @Override // i35.e
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        com.tencent.wechat.mm.biz.g0 c17;
        com.tencent.wechat.mm.finder_box.c0 a17;
        com.tencent.mm.storage.z3 z3Var = this.f210540d;
        if (!str.equals(z3Var.d1())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizContactDeleteUtil", "not current contact %s,%s", z3Var.d1(), str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizContactDeleteUtil", "dealDelContactEvent callBack %s, ret=%d", str, java.lang.Integer.valueOf(i17));
        ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(this);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.ui.tools.n1.f210590b;
        if (weakReference != null && weakReference.get() != null) {
            ((com.tencent.mm.ui.widget.dialog.u3) com.tencent.mm.ui.tools.n1.f210590b.get()).dismiss();
        }
        java.lang.ref.WeakReference weakReference2 = this.f210542f;
        if (i17 != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(g25Var.f374841d)) {
                db5.e1.s((android.content.Context) weakReference2.get(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490368t1), "");
                return;
            } else {
                db5.e1.s((android.content.Context) weakReference2.get(), g25Var.f374841d, g25Var.f374842e);
                return;
            }
        }
        android.app.Activity activity = (android.app.Activity) weakReference2.get();
        qk.o oVar = this.f210541e;
        if (oVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(oVar == null);
            objArr[1] = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b", objArr);
            return;
        }
        java.lang.String d17 = z3Var.d1();
        if (c01.e2.M(d17)) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k(d17);
            ((com.tencent.mm.storage.b3) c01.d9.b().l()).y0(d17);
        } else {
            com.tencent.mm.ui.tools.m1 m1Var = new com.tencent.mm.ui.tools.m1(oVar, d17);
            r01.q3.Ai().getClass();
            r01.d.f368041a = d17;
            r01.d.f368042b = java.lang.System.currentTimeMillis();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(d17, z3Var);
            if (oVar.I0()) {
                r01.z.a(oVar.field_username);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k(d17);
            } else {
                c01.w9.h(d17, m1Var);
                ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                com.tencent.mm.modelsimple.g1.I(d17, 15);
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(d17);
            }
            if (activity != null && this.f210543g) {
                activity.setResult(-1, activity.getIntent().putExtra("_delete_ok_", true));
            }
        }
        if (com.tencent.mm.app.plugin.exdevice.b.a(oVar)) {
            com.tencent.mm.autogen.events.ExDeviceUnBindHardDeviceEvent exDeviceUnBindHardDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceUnBindHardDeviceEvent();
            exDeviceUnBindHardDeviceEvent.f54185g.f7988a = d17;
            exDeviceUnBindHardDeviceEvent.e();
        }
        r01.q3.hj().y0(d17);
        if (z3Var.l2()) {
            r01.q3.ij().z0(d17);
        } else {
            r01.q3.nj().D0(d17);
            r01.q3.oj().z0(d17);
        }
        vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
        m2Var.getClass();
        if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
            if (((y40.i0) z40.e.get()).Ni() && (a17 = a50.e1.f1471a.a()) != null) {
                a17.c(d17 == null ? "" : d17, y40.d.f459283a);
            }
        } else if (m2Var.aj() && (c17 = yw.q3.f466437a.c()) != null) {
            c17.c(d17 == null ? "" : d17, vw.e1.f440627a);
        }
        if (z3Var.m2()) {
            ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).getClass();
            if (zv.q.f476079a.g()) {
                com.tencent.wechat.aff.brand_service.v b17 = yw.a3.f466266a.b();
                if (b17 != null) {
                    b17.d(d17 != null ? d17 : "", zv.n0.f476058a);
                }
                if (d17 != null) {
                    com.tencent.mm.autogen.events.BrandEcsDeleteUserNotifyEvent brandEcsDeleteUserNotifyEvent = new com.tencent.mm.autogen.events.BrandEcsDeleteUserNotifyEvent();
                    brandEcsDeleteUserNotifyEvent.f54011g.f6204a = d17;
                    brandEcsDeleteUserNotifyEvent.e();
                }
            }
        }
        if (gm0.j1.s(qk.s6.class) == null || gm0.j1.s(zq1.a0.class) == null || !((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94443i.getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94438d.a();
    }
}
