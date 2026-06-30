package yw1;

/* loaded from: classes9.dex */
public class c implements dn.k {

    /* renamed from: f, reason: collision with root package name */
    public static yw1.c f466602f;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f466603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466604e;

    public static java.lang.String b() {
        return lp0.b.D() + "wallet/img/";
    }

    public static yw1.c c() {
        if (f466602f == null) {
            f466602f = new yw1.c();
        }
        return f466602f;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public java.lang.String a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f466604e)) {
            this.f466604e = com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r() + "_reward_img");
        }
        return this.f466604e;
    }

    public boolean d() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b() + a());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardCdnDownloadHelper", "cdn callback, id: %s, ret: %s, sceneResult: %s", str, java.lang.Integer.valueOf(i17), hVar);
        com.tencent.mm.sdk.platformtools.u3.h(new yw1.a(this, str, hVar, i17));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
