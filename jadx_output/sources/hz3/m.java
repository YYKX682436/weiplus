package hz3;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final hz3.m f286348a = new hz3.m();

    public static final void a(hz3.s request, long j17, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 b27 = m11.b1.Di().b2(n17.Q0(), n17.I0());
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(b27.f322652t, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AiScanChatImageUtils", "fillImageCDNInfo parse cdnInfo failed. [%s]", b27.f322652t);
            return;
        }
        boolean z17 = true;
        java.lang.String str2 = i17 != 1 ? (java.lang.String) d17.get(".msg.img.$cdnmidimgurl") : (java.lang.String) d17.get(".msg.img.$cdnbigimgurl");
        java.lang.String str3 = i17 != 1 ? (java.lang.String) d17.get(".msg.img.$tpurl") : (java.lang.String) d17.get(".msg.img.$tphdurl");
        if (str2 == null) {
            str2 = "";
        }
        request.f286357d = str2;
        java.lang.String str4 = (java.lang.String) d17.get(".msg.img.$aeskey");
        if (str4 == null) {
            str4 = "";
        }
        request.f286358e = str4;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        request.f286357d = str3;
        java.lang.String str5 = (java.lang.String) d17.get(".msg.img.$tpauthkey");
        request.f286358e = str5 != null ? str5 : "";
    }

    public final java.lang.String b(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        if (!f9Var.J2() && !f9Var.o2()) {
            return null;
        }
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String concat = tg3.u0.ga((tg3.u0) c17, f9Var, f9Var.z0(), false, 4, null).concat("hd");
        if (com.tencent.mm.sdk.platformtools.y1.g(concat)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            concat = m11.b1.Di().P0(concat);
            kotlin.jvm.internal.o.f(concat, "exportToJpgAndGetFullPath(...)");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanChatImageUtils", "getImagePath hdThumbPath: %s", concat);
        if (com.tencent.mm.vfs.w6.j(concat)) {
            return concat;
        }
        return null;
    }
}
