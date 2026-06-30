package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f193640a;

    public static boolean a() {
        java.lang.String str = f193640a;
        if (str == null) {
            com.tencent.mm.splash.j.d("MicroMsg.FigLeaf", "request, not init.", new java.lang.Object[0]);
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f193640a + "/main-process-blocking");
        if (r6Var.m()) {
            r6Var.l();
        }
        return r6Var.k();
    }
}
