package i21;

/* loaded from: classes10.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static i21.q f287915a;

    public static i21.q h() {
        if (f287915a == null) {
            f287915a = new i21.q();
        }
        return f287915a;
    }

    public java.lang.String a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String a17 = gw3.a.a();
        java.lang.String g17 = kk.k.g((str + "ZnVjaw==").getBytes());
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17) || !a17.endsWith("/")) {
            return null;
        }
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.h1.b(g17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return null;
        }
        return a17 + b17;
    }

    public java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.h1.c(gw3.a.a(), "remark_", kk.k.g((str + "ZnVjaw==").getBytes()), ".png", 1);
    }

    public java.lang.String c(java.lang.String str, int i17) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        if (i17 > 0) {
            str2 = "_" + java.lang.Integer.toString(i17);
        } else {
            str2 = "";
        }
        return com.tencent.mm.sdk.platformtools.h1.c(gw3.a.a(), "remark_", kk.k.g((str + "ZnVjaw==").getBytes()) + str2, ".png", 1);
    }

    public java.lang.String d(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String str3 = "_" + kk.k.g(str2.getBytes());
        return com.tencent.mm.sdk.platformtools.h1.c(gw3.a.a(), "remark_", kk.k.g((str + "ZnVjaw==").getBytes()) + str3, ".png", 1);
    }

    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return f(str) + ("_" + kk.k.g(str2.getBytes())) + ".png";
    }

    public java.lang.String f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return "remark_" + kk.k.g((str + "ZnVjaw==").getBytes());
    }

    public java.lang.String g(java.lang.String str) {
        return com.tencent.mm.vfs.q7.c("sayhi") + "/" + ("pic_" + kk.k.g(str.getBytes()));
    }

    public boolean i(java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b(str));
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }
}
