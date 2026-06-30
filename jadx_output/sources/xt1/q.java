package xt1;

/* loaded from: classes5.dex */
public class q implements x51.o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f456549b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f456550c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f456551a;

    static {
        java.lang.String str = lp0.b.D() + "card";
        f456549b = str;
        f456550c = str + "/video";
    }

    public q(java.lang.String str) {
        this.f456551a = null;
        this.f456551a = str;
    }

    public static java.lang.String m(java.lang.String str) {
        return java.lang.String.format("%s/%s", f456549b, kk.k.g(str.getBytes()));
    }

    @Override // x51.o0
    public boolean a() {
        return true;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f456551a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f456551a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        return null;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f456551a;
    }

    @Override // x51.o0
    public void h(x51.m0 m0Var, java.lang.String str) {
    }

    @Override // x51.o0
    public boolean i() {
        return false;
    }

    @Override // x51.o0
    public void j(java.lang.String str, boolean z17) {
    }

    @Override // x51.o0
    public java.lang.String k() {
        return java.lang.String.format("%s/%s", f456549b, kk.k.g(this.f456551a.getBytes()));
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            try {
                try {
                    com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardSimpleGetPicStrategy", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.w("MicroMsg.CardSimpleGetPicStrategy", "save bitmap fail");
                }
            } catch (java.io.IOException unused) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(k());
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                    if (m18.a()) {
                        m18.f213266a.r(m18.f213267b);
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.CardSimpleGetPicStrategy", " retry saving bitmap");
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            }
        }
        m0Var.toString();
        return bitmap;
    }
}
