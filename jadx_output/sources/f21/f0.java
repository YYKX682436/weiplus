package f21;

/* loaded from: classes8.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, rz.o, com.tencent.mm.modelbase.q1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f258893d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f258894e;

    /* renamed from: f, reason: collision with root package name */
    public final int f258895f;

    /* renamed from: g, reason: collision with root package name */
    public final int f258896g;

    /* renamed from: h, reason: collision with root package name */
    public int f258897h = 0;

    public f0(int i17, int i18) {
        this.f258895f = i17;
        this.f258896g = i18;
        f21.i0 z07 = f21.r0.Bi().z0(i17, i18);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene get info null, id:" + i17);
            return;
        }
        z07.f258918f = 3;
        z07.f258924l = 64;
        f21.r0.Bi().P0(z07);
        if (i18 == 5) {
            com.tencent.mm.vfs.w6.h(gm0.j1.u().h() + "brand_i18n.apk");
            return;
        }
        f21.j0 Bi = f21.r0.Bi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        Bi.getClass();
        sb6.append(zz1.a.a());
        sb6.append(Bi.u0(i17, i18));
        com.tencent.mm.vfs.w6.h(sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f258893d = u0Var;
        f21.j0 Bi = f21.r0.Bi();
        int i17 = this.f258895f;
        int i18 = this.f258896g;
        f21.i0 z07 = Bi.z0(i17, i18);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme failed id:" + i17 + " type:" + i18);
            return -1;
        }
        if (z07.f258918f != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme stat failed id:" + i17 + " stat:" + z07.f258918f);
            return -1;
        }
        if (z07.f258916d <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene Theme size err id:" + i17 + " size:" + z07.f258916d);
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lf0();
        lVar.f70665b = new r45.mf0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/downloadpackage";
        lVar.f70667d = 160;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f258894e = a17;
        r45.lf0 lf0Var = (r45.lf0) a17.f70710a.f70684a;
        r45.n35 n35Var = new r45.n35();
        n35Var.f381054d = z07.f258913a;
        n35Var.f381055e = z07.f258914b;
        lf0Var.f379403d = n35Var;
        lf0Var.f379404e = this.f258897h;
        lf0Var.f379405f = 65536;
        lf0Var.f379406g = i18;
        return dispatch(sVar, this.f258894e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 160;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0325  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r29, int r30, int r31, java.lang.String r32, com.tencent.mm.network.v0 r33, byte[] r34) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f21.f0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 50;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        int i17;
        int i18;
        r45.lf0 lf0Var = (r45.lf0) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        f21.j0 Bi = f21.r0.Bi();
        int i19 = this.f258896g;
        int i27 = this.f258895f;
        f21.i0 z07 = Bi.z0(i27, i19);
        com.tencent.mm.modelbase.o1 o1Var = com.tencent.mm.modelbase.o1.EFailed;
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked get Theme failed id:" + i27);
            return o1Var;
        }
        if (lf0Var.f379403d.f381054d == i27 && (i17 = lf0Var.f379404e) == this.f258897h && i17 < (i18 = z07.f258916d) && lf0Var.f379405f == 65536 && i18 > 0 && z07.f258918f == 3) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked Theme failed id:" + i27);
        return o1Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        f21.r0.Bi().L0(this.f258895f, this.f258896g);
    }

    @Override // com.tencent.mm.modelbase.q1
    public int u() {
        return this.f258896g;
    }
}
