package po3;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f357327a = {false};

    public static java.lang.String a() {
        java.lang.String str = lp0.b.D() + "FailMsgFileCache";
        boolean[] zArr = f357327a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                    java.lang.String str2 = a17.f213279f;
                    if (str2 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                        if (!a17.f213279f.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                    if (m17.a()) {
                        m17.f213266a.r(m17.f213267b);
                    }
                    zArr[0] = true;
                }
            }
        }
        return str;
    }

    public static void b(int i17) {
        java.lang.String str;
        if (i17 == 1) {
            str = a() + "/normalMsg";
        } else if (i17 == 2) {
            str = a() + "/snsMsg";
        } else {
            str = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FailMsgFileCache", "removeFile error, cannot find filename");
            return;
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.d(m17.f213267b);
            }
        }
    }
}
