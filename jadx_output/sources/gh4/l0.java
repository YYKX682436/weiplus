package gh4;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final gh4.l0 f271938a = new gh4.l0();

    public final boolean a(android.graphics.Bitmap bmp, java.lang.String src, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(bmp, "bmp");
        kotlin.jvm.internal.o.g(src, "src");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        java.lang.String concat = destPath.concat("_temp");
        boolean z17 = false;
        boolean D0 = com.tencent.mm.sdk.platformtools.x.D0(bmp, 100, android.graphics.Bitmap.CompressFormat.JPEG, concat, false);
        if (!D0) {
            return D0;
        }
        try {
            boolean z18 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ui(concat, destPath, 0) == 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarLogic", "nativePic2Wxam ret:%b", java.lang.Boolean.valueOf(z18));
            z17 = z18;
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TaskBarLogic", "convertBmp2Wxam bmp OutOfMemoryError!");
        }
        com.tencent.mm.vfs.w6.h(concat);
        return z17;
    }

    public final java.lang.String b(java.lang.String path, o11.g imageLoaderOptions) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(imageLoaderOptions, "imageLoaderOptions");
        if (imageLoaderOptions.f342124v) {
            path = path + "round" + imageLoaderOptions.f342125w;
        }
        java.lang.String str = imageLoaderOptions.f342122t;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            path = path + str;
        }
        return path + "size" + imageLoaderOptions.f342111i + imageLoaderOptions.f342112j;
    }

    public final java.lang.String c(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = gh4.m0.f271939a;
        sb6.append(gh4.m0.f271940b);
        sb6.append(id6);
        return sb6.toString();
    }
}
