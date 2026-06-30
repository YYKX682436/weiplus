package d82;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d82.a f226922a = new d82.a();

    public final boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, android.graphics.Bitmap.CompressFormat format, int i19) {
        java.lang.String Y;
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.tencent.mm.vfs.w6.u(o72.x1.H());
        java.lang.String thumbFullPath = o72.x1.H() + g17 + str3;
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(thumbFullPath, "thumbFullPath");
        boolean x17 = com.tencent.mm.sdk.platformtools.x.x(str, i17, i18, format, i19, thumbFullPath, true);
        if (x17 && (Y = com.tencent.mm.sdk.platformtools.x.Y(str)) != null) {
            com.tencent.mm.sdk.platformtools.x.L0(Y, thumbFullPath);
        }
        if (!x17 || !com.tencent.mm.vfs.w6.j(thumbFullPath)) {
            com.tencent.mm.vfs.w6.h(thumbFullPath);
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageCompressHelper", "compressAndCopy: compress failed, tempPath=".concat(thumbFullPath));
            return false;
        }
        long d17 = com.tencent.mm.vfs.w6.d(thumbFullPath, str2, false);
        com.tencent.mm.vfs.w6.h(thumbFullPath);
        if (d17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageCompressHelper", "compressAndCopy: success, tempPath=" + thumbFullPath + " -> targetPath=" + str2 + ", copyBytes=" + d17);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageCompressHelper", "compressAndCopy: copy failed, tempPath=" + thumbFullPath + " -> targetPath=" + str2 + ", copyBytes=" + d17);
        return false;
    }
}
