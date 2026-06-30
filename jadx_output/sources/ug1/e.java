package ug1;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.networking.d {

    /* renamed from: o, reason: collision with root package name */
    public final r45.u54 f427488o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f427489p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f427490q;

    public e(r45.u54 req, boolean z17) {
        kotlin.jvm.internal.o.g(req, "req");
        this.f427488o = req;
        this.f427489p = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1122;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        lVar.f70664a = req;
        lVar.f70665b = new r45.v54();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f427490q = a17;
        p(a17);
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String B() {
        java.lang.String str = this.f427488o.f387064p;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String C() {
        java.lang.String str = this.f427488o.f387065q;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void x(int i17, int i18, java.lang.String str, r45.v54 resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
        super.x(i17, i18, str, resp, m1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaAppForPreFetch", "onCgiBack response:" + wz0.a.b(resp));
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d, com.tencent.mm.modelbase.i
    public pq5.g l() {
        qg1.c cVar = new qg1.c();
        com.tencent.mm.modelbase.o oVar = this.f427490q;
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        pq5.g a17 = cVar.a((r45.u54) fVar, this.f427489p, this);
        com.tencent.mm.protobuf.f fVar2 = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.L((r45.u54) fVar2);
        com.tencent.mm.protobuf.f fVar3 = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.K((r45.u54) fVar3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run() with request ");
        com.tencent.mm.protobuf.f fVar4 = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        r45.u54 u54Var = (r45.u54) fVar4;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LaunchWxaAppRequest{");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("username[");
        sb8.append(u54Var.f387065q);
        sb8.append("], appId[");
        sb8.append(u54Var.f387055d);
        sb8.append("], sync[");
        sb8.append(u54Var.f387057f == 1);
        sb8.append("], instanceId[");
        sb8.append(u54Var.f387064p);
        sb8.append("], libVersion[");
        r45.fd7 fd7Var = u54Var.f387059h;
        sb8.append(fd7Var != null ? fd7Var.f374246d : 0);
        sb8.append("], ");
        sb8.append(wz0.a.a(u54Var.f387071w));
        sb7.append(sb8.toString());
        sb6.append(sb7.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaAppForPreFetch", sb6.toString());
        return a17 == null ? super.l() : a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public pq5.g u() {
        r45.u54 u54Var = this.f427488o;
        if (com.tencent.mm.plugin.appbrand.networking.a.a(u54Var.f387055d, u54Var.f387065q)) {
            return null;
        }
        return pq5.h.d(new ug1.d(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String y() {
        java.lang.String str = this.f427488o.f387055d;
        return str == null ? "" : str;
    }
}
