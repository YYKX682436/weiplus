package k91;

/* loaded from: classes7.dex */
public class k1 extends com.tencent.mm.plugin.appbrand.networking.d {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f305657o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.xc7 f305658p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r4 = 0
            r5 = 0
            r45.y50 r6 = new r45.y50
            r6.<init>()
            r0 = 1
            r6.f390799f = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.k1.<init>(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public r45.y50 A() {
        return this.f305658p.f389987i;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String B() {
        java.lang.String str = this.f305658p.f389985g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String C() {
        java.lang.String str = this.f305658p.f389982d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d, com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        super.x(i17, i18, str, (r45.zc7) fVar, m1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiWxaAttrSync", "onCgiBack errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public pq5.g u() {
        com.tencent.mm.protobuf.f fVar = this.f305657o.f70710a.f70684a;
        if (com.tencent.mm.plugin.appbrand.networking.a.a(((r45.xc7) fVar).f389984f, ((r45.xc7) fVar).f389982d)) {
            return null;
        }
        return pq5.h.d(new k91.j1(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public void x(int i17, int i18, java.lang.String str, r45.js5 js5Var, com.tencent.mm.modelbase.m1 m1Var) {
        super.x(i17, i18, str, (r45.zc7) js5Var, m1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiWxaAttrSync", "onCgiBack errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String y() {
        java.lang.String str = this.f305658p.f389984f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    public k1(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i17, r45.y50 y50Var) {
        com.tencent.mm.protobuf.g f17;
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.xc7 xc7Var = new r45.xc7();
        this.f305658p = xc7Var;
        xc7Var.f389982d = str;
        if (z17) {
            f17 = null;
        } else {
            f17 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.plugin.appbrand.config.q.f(str2) : k91.j4.i1(com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, "syncVersion"));
        }
        xc7Var.f389983e = f17;
        xc7Var.f389984f = str2;
        xc7Var.f389985g = str3;
        xc7Var.f389986h = i17;
        java.util.Objects.requireNonNull(y50Var);
        xc7Var.f389987i = y50Var;
        xc7Var.f389989n = wo.w0.m();
        java.lang.String str5 = android.os.Build.VERSION.RELEASE;
        xc7Var.f389990o = str5;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a17 = com.tencent.mm.plugin.appbrand.appcache.x7.a();
        if (a17 != null) {
            r45.fd7 fd7Var = new r45.fd7();
            xc7Var.f389988m = fd7Var;
            fd7Var.f374246d = a17.i();
            xc7Var.f389992q = a17.W0();
        }
        xc7Var.f389991p = str5;
        lVar.f70664a = xc7Var;
        lVar.f70665b = new r45.zc7();
        lVar.f70667d = 1151;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
        com.tencent.mm.modelbase.o a18 = lVar.a();
        this.f305657o = a18;
        p(a18);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiWxaAttrSync", "<init> hash:%d, username:%s, appId:%s, cleanUpdate:%b, instanceId:%s, scene:%d, source:%s", java.lang.Integer.valueOf(hashCode()), str, str2, java.lang.Boolean.valueOf(z17), str3, java.lang.Integer.valueOf(i17), wz0.a.a(y50Var));
    }
}
