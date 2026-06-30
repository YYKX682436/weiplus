package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx3.e f158432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158433e;

    public j0(qx3.e eVar, com.tencent.mm.plugin.ringtone.uic.v0 v0Var) {
        this.f158432d = eVar;
        this.f158433e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<ox3.a> data;
        java.util.List<ox3.a> data2;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        java.util.List<ox3.a> data3;
        qx3.e eVar = this.f158432d;
        long j17 = eVar.f367351a;
        int i17 = eVar.f367352b;
        com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158433e;
        if (i17 == 1) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = v0Var.f158518m;
            if (wxRecyclerAdapter2 == null || (data = wxRecyclerAdapter2.getData()) == null) {
                return;
            }
            for (ox3.a aVar : data) {
                if (aVar.f349722e && aVar.getItemId() != j17) {
                    aVar.f349722e = false;
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = v0Var.f158518m;
                    if (wxRecyclerAdapter3 != null) {
                        wxRecyclerAdapter3.d0(aVar.getItemId(), java.lang.Boolean.FALSE);
                    }
                }
            }
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = v0Var.f158518m;
            if (wxRecyclerAdapter4 == null || (data2 = wxRecyclerAdapter4.getData()) == null) {
                return;
            }
            for (ox3.a aVar2 : data2) {
                if (aVar2.getItemId() == j17) {
                    aVar2.f349722e = true;
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter5 = v0Var.f158518m;
                    if (wxRecyclerAdapter5 != null) {
                        wxRecyclerAdapter5.d0(aVar2.getItemId(), java.lang.Boolean.TRUE);
                    }
                } else if (aVar2.f349722e) {
                    aVar2.f349722e = false;
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter6 = v0Var.f158518m;
                    if (wxRecyclerAdapter6 != null) {
                        wxRecyclerAdapter6.d0(aVar2.getItemId(), java.lang.Boolean.FALSE);
                    }
                }
            }
            return;
        }
        if (i17 != 3 || (wxRecyclerAdapter = v0Var.f158518m) == null || (data3 = wxRecyclerAdapter.getData()) == null) {
            return;
        }
        for (ox3.a aVar3 : data3) {
            if (aVar3.f349722e && aVar3.getItemId() == j17) {
                aVar3.f349722e = false;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter7 = v0Var.f158518m;
                if (wxRecyclerAdapter7 != null) {
                    wxRecyclerAdapter7.d0(aVar3.getItemId(), java.lang.Boolean.FALSE);
                }
            }
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
        }
    }
}
