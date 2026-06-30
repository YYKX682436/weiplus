package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ez implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f118292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f118293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f118294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rz f118295g;

    public ez(r45.fr1 fr1Var, com.tencent.mm.plugin.finder.live.plugin.l lVar, android.content.Context context, com.tencent.mm.plugin.finder.live.widget.rz rzVar) {
        this.f118292d = fr1Var;
        this.f118293e = lVar;
        this.f118294f = context;
        this.f118295g = rzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        r45.fr1 fr1Var = this.f118292d;
        r45.z87 z87Var = (r45.z87) fr1Var.getCustom(18);
        if (z87Var != null) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Uj((ml2.r0) c17, 13, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f118293e;
            new db2.z1(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 0).l();
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = z87Var.getString(0);
            b1Var.f317022f = z87Var.getString(1);
            b1Var.f317016c = z87Var.getInteger(2);
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            com.tencent.mm.protobuf.g byteString = z87Var.getByteString(3);
            appBrandLaunchReferrer.f77334s = byteString != null ? byteString.i() : "";
            b1Var.f317041s = appBrandLaunchReferrer;
            b1Var.f317032k = 1219;
            b1Var.f317034l = java.lang.String.valueOf(((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0));
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f118294f, b1Var);
            com.tencent.mm.plugin.finder.live.widget.rz rzVar = this.f118295g;
            if (rzVar != null) {
                rzVar.a(true);
            }
        }
    }
}
