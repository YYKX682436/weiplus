package vi3;

/* loaded from: classes10.dex */
public abstract class l {
    public static void a(java.lang.String str, java.lang.String str2, byte[] bArr) {
        int i17;
        if (android.text.TextUtils.isEmpty(str) || bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeUtil", "appendFile dir:%s fileName:%s ", str, str2);
            return;
        }
        int i18 = 3;
        while (true) {
            int i19 = i18 - 1;
            if (i18 <= 0) {
                return;
            }
            long e17 = kn1.k.e(str + str2);
            try {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str3 = a17.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
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
                java.lang.String str4 = str + "/" + str2;
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str4);
                if (!r6Var.m()) {
                    r6Var.k();
                }
                i17 = com.tencent.mm.vfs.w6.a(str4, bArr);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgSynchronizeUtil", e18, "", new java.lang.Object[0]);
                i17 = -1;
            }
            long e19 = kn1.k.e(str + str2);
            if (i17 == 0 && e19 >= bArr.length) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(e17), java.lang.Long.valueOf(e19), java.lang.Integer.valueOf(bArr.length));
            i18 = i19;
        }
    }

    public static java.lang.String b() {
        return gm0.j1.u().h() + "msgsynchronize/";
    }

    public static java.lang.String c() {
        try {
            java.lang.String str = gm0.j1.u().h() + "msgsynchronize.zip";
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
            if (!r6Var.m()) {
                r6Var.k();
            }
            return str;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgSynchronizeUtil", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}
