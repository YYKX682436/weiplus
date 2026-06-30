package rg1;

/* loaded from: classes7.dex */
public final class n extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f395225m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f395226n;

    public n(java.lang.String str, java.lang.String str2) {
        this.f395225m = str;
        this.f395226n = str2;
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.v54 v54Var = (r45.v54) fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiPrefetchLaunchWxaApp", "onCgiBack, instance[" + hashCode() + "] errType[" + i17 + "] errCode[" + i18 + "] errMsg[" + str + "], accHasReady[" + gm0.j1.a() + ']');
        if (gm0.j1.a()) {
            java.lang.String str2 = v54Var != null ? v54Var.f387908m : null;
            if (!(str2 == null || str2.length() == 0) && th1.a.a(i17, i18, v54Var)) {
                com.tencent.mm.plugin.appbrand.launching.i9 Zi = com.tencent.mm.plugin.appbrand.app.r9.Zi();
                kotlin.jvm.internal.o.d(v54Var);
                java.lang.String str3 = v54Var.f387908m;
                kotlin.jvm.internal.o.d(str3);
                Zi.z0(str3, v54Var);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        java.lang.String str = this.f395225m;
        if (str == null || str.length() == 0) {
            return pq5.h.d(new rg1.m(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run() with username[");
        sb6.append(str);
        sb6.append("] enterPath[");
        java.lang.String str2 = this.f395226n;
        sb6.append(str2);
        sb6.append("] instance[");
        sb6.append(hashCode());
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiPrefetchLaunchWxaApp", sb6.toString());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.u54 u54Var = new r45.u54();
        u54Var.f387065q = str;
        r45.ac7 ac7Var = new r45.ac7();
        ac7Var.f369929g = str2;
        u54Var.f387056e = ac7Var;
        u54Var.f387066r = true;
        u54Var.f387067s = true;
        r45.fd7 fd7Var = new r45.fd7();
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a17 = com.tencent.mm.plugin.appbrand.appcache.x7.a();
        fd7Var.f374246d = a17 != null ? a17.i() : -1;
        u54Var.f387059h = fd7Var;
        r45.y50 y50Var = new r45.y50();
        y50Var.f390799f = 1;
        u54Var.f387071w = y50Var;
        lVar.f70664a = u54Var;
        lVar.f70667d = 1122;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        lVar.f70665b = new r45.v54();
        com.tencent.mm.modelbase.o a18 = lVar.a();
        com.tencent.mm.modelbase.m mVar = a18.f70710a;
        com.tencent.mm.protobuf.f fVar = mVar.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.L((r45.u54) fVar);
        com.tencent.mm.protobuf.f fVar2 = mVar.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.K((r45.u54) fVar2);
        p(a18);
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.d(l17);
        return l17;
    }
}
