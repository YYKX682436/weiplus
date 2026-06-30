package com.tencent.mm.plugin.scanner;

@j95.b
/* loaded from: classes5.dex */
public class m1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158756d;

    /* renamed from: e, reason: collision with root package name */
    public zz3.a f158757e;

    public m1() {
        new com.tencent.mm.plugin.scanner.model.s();
    }

    public static synchronized com.tencent.mm.plugin.scanner.m1 Ai() {
        com.tencent.mm.plugin.scanner.m1 m1Var;
        synchronized (com.tencent.mm.plugin.scanner.m1.class) {
            m1Var = (com.tencent.mm.plugin.scanner.m1) i95.n0.c(com.tencent.mm.plugin.scanner.m1.class);
        }
        return m1Var;
    }

    public zz3.a Bi() {
        gm0.j1.b().c();
        if (this.f158757e == null) {
            this.f158757e = new zz3.a(gm0.j1.u().f273153f);
        }
        return this.f158757e;
    }

    public java.lang.String Di(java.lang.String str, java.lang.String str2) {
        if (!gm0.j1.a() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        return java.lang.String.format("%s/scanbook%s_%s", this.f158756d + "image/scan/img", str2, kk.k.g(str.getBytes()));
    }

    public java.lang.String Ni() {
        return wi() + "scan_camera/";
    }

    public void Ri() {
        if (this.f158756d != null) {
            java.lang.String d17 = gm0.j1.u().d();
            this.f158756d = d17;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(d17);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(d17.concat("image/scan/img"));
            java.lang.String str2 = a18.f213279f;
            if (str2 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m19 = b3Var.m(a18, null);
            if (!(!m19.a() ? false : m19.f213266a.F(m19.f213267b))) {
                com.tencent.mm.vfs.z2 m27 = b3Var.m(a18, m19);
                if (m27.a()) {
                    m27.f213266a.r(m27.f213267b);
                }
            }
            com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(d17.concat("image/scan/music"));
            java.lang.String str3 = a19.f213279f;
            if (str3 != null) {
                java.lang.String l19 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l19)) {
                    a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l19, a19.f213280g, a19.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m28 = b3Var.m(a19, null);
            if (!(!m28.a() ? false : m28.f213266a.F(m28.f213267b))) {
                com.tencent.mm.vfs.z2 m29 = b3Var.m(a19, m28);
                if (m29.a()) {
                    m29.f213266a.r(m29.f213267b);
                }
            }
            com.tencent.mm.vfs.z7 a27 = com.tencent.mm.vfs.z7.a(wi());
            java.lang.String str4 = a27.f213279f;
            if (str4 != null) {
                java.lang.String l27 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l27)) {
                    a27 = new com.tencent.mm.vfs.z7(a27.f213277d, a27.f213278e, l27, a27.f213280g, a27.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m37 = b3Var.m(a27, null);
            if (!(!m37.a() ? false : m37.f213266a.F(m37.f213267b))) {
                com.tencent.mm.vfs.z2 m38 = b3Var.m(a27, m37);
                if (m38.a()) {
                    m38.f213266a.r(m38.f213267b);
                }
            }
            com.tencent.mm.vfs.z7 a28 = com.tencent.mm.vfs.z7.a(Ai().Ni());
            java.lang.String str5 = a28.f213279f;
            if (str5 != null) {
                java.lang.String l28 = com.tencent.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l28)) {
                    a28 = new com.tencent.mm.vfs.z7(a28.f213277d, a28.f213278e, l28, a28.f213280g, a28.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m39 = b3Var.m(a28, null);
            if (!(m39.a() ? m39.f213266a.F(m39.f213267b) : false)) {
                com.tencent.mm.vfs.z2 m47 = b3Var.m(a28, m39);
                if (m47.a()) {
                    m47.f213266a.r(m47.f213267b);
                }
            }
            com.tencent.mm.vfs.w6.t(Ai().Ni());
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        Ri();
        s75.d.b(new com.tencent.mm.plugin.scanner.l1(this), "MicroMsg.scanner.SubCoreScannerdeleteOutDateImg");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mm.plugin.scanner.model.s.b();
    }

    public java.lang.String wi() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("scanner/");
        return sb6.toString();
    }
}
