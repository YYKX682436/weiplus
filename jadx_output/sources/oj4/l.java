package oj4;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final oj4.l f345818a = new oj4.l();

    public final java.lang.String a(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return str;
        }
        ((pc0.w1) ((qc0.a1) i95.n0.c(qc0.a1.class))).getClass();
        java.lang.String b17 = b(str, new com.tencent.mm.vfs.r6(dw3.c0.f244182a.n()), 100);
        boolean j17 = com.tencent.mm.vfs.w6.j(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "compressBigBitmap: " + b17 + ", exist=" + j17);
        return (!j17 || com.tencent.mm.vfs.w6.k(b17) >= com.tencent.mm.vfs.w6.k(str)) ? str : b17;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r27, com.tencent.mm.vfs.r6 r28, int r29) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj4.l.b(java.lang.String, com.tencent.mm.vfs.r6, int):java.lang.String");
    }

    public final boolean c(pj4.g2 g2Var) {
        kotlin.jvm.internal.o.g(g2Var, "<this>");
        if (g2Var.f355064f) {
            return true;
        }
        java.lang.String str = g2Var.f355062d.f354978m;
        if (!(str == null || r26.n0.N(str))) {
            java.lang.String str2 = g2Var.f355062d.f354976h;
            if (!(str2 == null || r26.n0.N(str2))) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.UploadPackHelper", "readBitmapAndSave: failed " + str + ", " + str2);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "readBitmapAndSave: ready " + str + " to " + str2);
        android.graphics.Bitmap b17 = dj4.w.b(str);
        if (b17 == null || b17.getWidth() <= 0 || b17.getHeight() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.UploadPackHelper", "readBitmapAndSave: originBitmap get failed");
            return false;
        }
        boolean D0 = com.tencent.mm.sdk.platformtools.x.D0(b17, 100, android.graphics.Bitmap.CompressFormat.PNG, str2, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "readBitmapAndSave: saveResult=" + D0 + ", originBitmap [" + b17.getWidth() + ',' + b17.getHeight() + ']');
        return D0;
    }
}
