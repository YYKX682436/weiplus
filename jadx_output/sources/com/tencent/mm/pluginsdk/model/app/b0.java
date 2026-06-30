package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class b0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f188809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188812g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f188813h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f188814i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f188815m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f188816n;

    public b0(com.tencent.mm.pluginsdk.model.app.a0 a0Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.tencent.mm.storage.f9 f9Var, boolean z17, int i18) {
        this.f188809d = j17;
        this.f188810e = str;
        this.f188811f = str2;
        this.f188812g = str3;
        this.f188813h = i17;
        this.f188814i = f9Var;
        this.f188815m = z17;
        this.f188816n = i18;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        java.lang.String str3 = this.f188810e;
        long j17 = this.f188809d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "getThumbByCdn start failed: msgid:%d startRet:%d thumbUrl:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str3);
            return i17;
        }
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.field_retCode;
        java.lang.String str4 = this.f188811f;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "getThumbByCdn failed: msgid:%d sceneResult.field_retCode:%d thumbUrl:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(hVar.field_retCode), str3);
            com.tencent.mm.vfs.w6.h(str4);
        } else {
            com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
            java.lang.String str5 = this.f188812g;
            com.tencent.mm.storage.f9 o27 = g9Var.o2(str5, j17);
            if (o27 == null || o27.I0() != j17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "hy: appmsg %d has been deleted", java.lang.Long.valueOf(j17));
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "hy: %d current msg type is %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(o27.getType()));
            byte[] N = com.tencent.mm.vfs.w6.N(str4, 0, -1);
            int i19 = this.f188813h;
            if (i19 == 33 || i19 == 36 || i19 == 46 || i19 == 44 || i19 == 48 || i19 == 101 || i19 == 76 || i19 == 92 || i19 == 93) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String K3 = m11.b1.Di().K3(o27, "", N, 100, android.graphics.Bitmap.CompressFormat.JPEG);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String D2 = m11.b1.Di().D2(o27, K3, true);
                zz.b Zi = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(D2, 33, null, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", D2, java.lang.Integer.valueOf(Zi.f477691a), java.lang.Boolean.valueOf(Zi.f477692b), java.lang.Boolean.valueOf(Zi.f477693c), java.lang.Boolean.valueOf(Zi.f477694d), java.lang.Long.valueOf(Zi.f477695e));
                com.tencent.mm.vfs.w6.h(str4);
                str2 = K3;
            } else {
                java.lang.String a17 = com.tencent.mm.pluginsdk.model.app.a1.a(this.f188814i);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    boolean m27 = o27.m2();
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    m11.l0 Di = m11.b1.Di();
                    android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.PNG;
                    Di.getClass();
                    boolean z18 = this.f188815m;
                    str2 = Di.v4(o27, N, compressFormat, m27, z18 ? 128 : 120, z18 ? 128 : 120);
                } else {
                    int[] b17 = com.tencent.mm.pluginsdk.model.app.a1.b(a17);
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    str2 = m11.b1.Di().v4(o27, N, android.graphics.Bitmap.CompressFormat.PNG, false, b17[0], b17[1]);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                o27.i1(str2);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).nb(o27.I0(), o27);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "getThumbByCdn finished msgid:%d talker:%s thumbUrl:%s path:%s", java.lang.Long.valueOf(j17), str5, str3, str2);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(198L, 16L, this.f188816n, false);
            g0Var.idkeyStat(198L, 17L, 1L, false);
            g0Var.idkeyStat(198L, com.tencent.mm.storage.z3.R4(str5) ? 19L : 18L, 1L, false);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b1.Di().doNotify();
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
