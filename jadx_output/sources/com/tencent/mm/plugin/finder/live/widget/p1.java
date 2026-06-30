package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class p1 implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.t1 f119342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f119344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f119345g;

    public p1(com.tencent.mm.plugin.finder.live.widget.t1 t1Var, boolean z17, float f17, float f18) {
        this.f119342d = t1Var;
        this.f119343e = z17;
        this.f119344f = f17;
        this.f119345g = f18;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.finder.live.widget.t1 t1Var = this.f119342d;
        java.lang.String i07 = t1Var.i0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPoiCityInfo: onGetLbsLifes, isNeedLoadingToast: ");
        boolean z17 = this.f119343e;
        sb6.append(z17);
        sb6.append(" city:");
        sb6.append(str);
        sb6.append(", list size:");
        jz5.f0 f0Var = null;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i(i07, sb6.toString());
        if (z17) {
            t1Var.I.b();
        }
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.finder.live.widget.t1.f0(t1Var, z17);
            return;
        }
        t1Var.L = com.tencent.mm.plugin.finder.assist.n3.f102399a.e(list != null ? (r45.c64) kz5.n0.Z(list) : null, this.f119344f, this.f119345g, str);
        t1Var.getClass();
        r45.ze2 ze2Var = t1Var.L;
        if (ze2Var != null) {
            t1Var.m0(ze2Var);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.finder.live.widget.t1.f0(t1Var, z17);
        }
    }
}
