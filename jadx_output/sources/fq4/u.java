package fq4;

/* loaded from: classes.dex */
public abstract class u {
    public static java.lang.String a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String str3 = com.tencent.mm.storage.v3.f196273a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintLogic", "dbCachePath " + str3);
        if (str3.endsWith("/")) {
            str2 = str3 + str;
        } else {
            str2 = str3 + "/" + str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintLogic", "genpath " + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        if (z17) {
            return str2;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            m17.f213266a.F(m17.f213267b);
        }
        return str2;
    }
}
