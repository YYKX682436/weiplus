package e43;

/* loaded from: classes8.dex */
public abstract class c {
    public static final java.lang.String a(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, u33.i downloadCallback) {
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(downloadCallback, "downloadCallback");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("gameimgdownload_");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(c01.z1.r());
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb8.append(java.lang.System.currentTimeMillis());
        sb7.append(com.tencent.mm.sdk.platformtools.w2.a(sb8.toString()));
        java.lang.String sb9 = sb7.toString();
        h0Var.f310123d = sb9;
        if (str == null) {
            return sb9;
        }
        if (z17) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("thumb_download_");
            sb10.append(com.tencent.mm.sdk.platformtools.w2.a(str + str2));
            sb6 = sb10.toString();
        } else {
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("image_download_");
            sb11.append(com.tencent.mm.sdk.platformtools.w2.a(str + str2));
            sb6 = sb11.toString();
        }
        java.lang.String str4 = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_WEEK) + "image/chatroom/" + sb6;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str4);
        java.lang.String str5 = a17.f213279f;
        if (str5 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomMediaDownloader", "local cache file");
            downloadCallback.b(true, 0, (java.lang.String) h0Var.f310123d, str4);
            return (java.lang.String) h0Var.f310123d;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new e43.a(h0Var, z17, str, str4, str2, new e43.b(downloadCallback, str4)));
        return (java.lang.String) h0Var.f310123d;
    }
}
