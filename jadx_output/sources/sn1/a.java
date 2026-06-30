package sn1;

/* loaded from: classes12.dex */
public class a extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.t f409966u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.u f409967v;

    /* renamed from: w, reason: collision with root package name */
    public final int f409968w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f409969x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f409970y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f409971z;

    public a(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, int i17, int i18, boolean z17) {
        wn1.t tVar = new wn1.t();
        this.f409966u = tVar;
        this.f409967v = new wn1.u();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupAuthScene", "BackupAuthScene init, backupType[%d], stack:%s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        tVar.f447478f = new com.tencent.mm.protobuf.g(kk.p.b(str.getBytes(), bArr));
        tVar.f447476d = 0;
        tVar.f447477e = str3;
        tVar.f447479g = i17;
        tVar.f447480h = z17 ? 1 : 0;
        this.f409969x = str2;
        this.f409971z = str3;
        this.f409970y = bArr;
        this.f409968w = i18;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f M() {
        return this.f409966u;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f N() {
        return this.f409967v;
    }

    @Override // sn1.i
    public void P(int i17) {
        wn1.u uVar = this.f409967v;
        int i18 = uVar.f447484e;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupAuthScene", "onSceneEnd errType[%d]", java.lang.Integer.valueOf(i18));
            J(4, uVar.f447484e, "onSceneEnd status failed");
            kn1.q.a(kn1.m.f309635h, kn1.o.f309651g, "OnHandShake: status fail");
            return;
        }
        java.lang.String str = uVar.f447485f;
        java.lang.String str2 = this.f409971z;
        if (!str2.equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupAuthScene", "onSceneEnd not the same id");
            kn1.q.a(kn1.m.f309635h, kn1.o.f309651g, "OnHandShake: wrong id");
            J(4, -1, "onSceneEnd not the same id");
            return;
        }
        byte[] bArr = uVar.f447486g.f192156a;
        byte[] bArr2 = this.f409970y;
        java.lang.String str3 = new java.lang.String((bArr == null || bArr2 == null) ? null : kk.p.a(bArr, bArr2));
        int length = str3.length();
        java.lang.String str4 = this.f409969x;
        boolean equals = length != str4.length() ? false : str3.equals(str4);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(equals);
        wn1.t tVar = this.f409966u;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupAuthScene", "onSceneEnd check ok result[%b], req supportExt:%s, resp supportExt:%s", valueOf, java.lang.Integer.valueOf(tVar.f447481i), java.lang.Integer.valueOf(uVar.f447489m));
        if (!equals) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupAuthScene", "onSceneEnd check ok failed");
            kn1.q.a(kn1.m.f309635h, kn1.o.f309651g, "OnHandShake: wrong ok");
            J(4, -3, "onSceneEnd check ok failed");
            return;
        }
        J(0, 0, "onSceneEnd auth success");
        boolean z17 = (uVar.f447489m & 32) != 0 || (tVar.f447481i & 32) == 0;
        int i19 = this.f409968w;
        if (!z17 && i19 == 1) {
            qn1.c.i().j().getClass();
        }
        if (i19 != 22 || uVar.f447487h >= 3) {
            tVar.f447478f = new com.tencent.mm.protobuf.g(kk.p.b(str4.getBytes(), bArr2));
            tVar.f447476d = 1;
            tVar.f447477e = str2;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupAuthScene", "directSendAuthOk");
                sn1.i.S(tVar.toByteArray(), 1, i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupAuthScene", e17, "directSendAuthOk req to bur err.", new java.lang.Object[0]);
            }
        }
    }

    public void b0(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        wn1.t tVar = this.f409966u;
        if (z17) {
            tVar.f447481i |= 1;
        }
        if (z18) {
            tVar.f447481i |= 2;
        }
        if (z19) {
            tVar.f447481i |= 4;
        }
        if (z27) {
            tVar.f447481i |= 8;
        }
        if (z28) {
            tVar.f447481i |= 16;
        }
        if (z29) {
            tVar.f447481i |= 32;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1;
    }
}
