package te;

/* loaded from: classes7.dex */
public final class a implements te.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f417764d;

    public a(java.lang.String uin, java.lang.String appId) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(uin, "uin");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f417764d = "";
        synchronized (lp0.b.class) {
            str = lp0.b.D() + "appbrand/wxaudio/";
        }
        com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(new java.io.File(str));
        if (j17 != null) {
            java.lang.String o17 = j17.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            o17 = r26.i0.n(o17, "/", false) ? o17 : o17.concat("/");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(o17);
            sb6.append(com.tencent.mm.sdk.platformtools.w2.a(uin + '#' + appId));
            java.lang.String sb7 = sb6.toString();
            this.f417764d = sb7;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb7);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                return;
            }
            com.tencent.mm.vfs.w6.u(sb7);
        }
    }
}
