package ut;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ut.g f430626a = new ut.g();

    /* renamed from: b, reason: collision with root package name */
    public static final int f430627b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.Size f430628c;

    /* renamed from: d, reason: collision with root package name */
    public static int f430629d;

    static {
        java.lang.Object m521constructorimpl;
        f430628c = new android.util.Size(120, 120);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.msgsend.RepairerConfigBigFileThumbLongSideLimit());
            kotlin.jvm.internal.o.d(f17);
            java.util.List f07 = r26.n0.f0(f17, new java.lang.String[]{":"}, false, 0, 6, null);
            if (f07.size() != 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FileThumbHelper", "pic2pic, qualityConfig = " + f17 + " is invalid, go fallback");
                f430628c = new android.util.Size(120, 120);
                f430627b = 30;
            } else {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) f07.get(0));
                f430627b = java.lang.Integer.parseInt((java.lang.String) f07.get(1));
                f430628c = new android.util.Size(parseInt, parseInt);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            f430628c = new android.util.Size(120, 120);
            f430627b = 30;
        }
    }

    public final boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.List i17 = kz5.c0.i("jpg", "jpeg", "bmp", "png", "tif", "tiff", "heic", "heif", "webp");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return i17.contains(lowerCase);
    }

    public final boolean b(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.List i17 = kz5.c0.i("avi", "flv", "m4v", "mkv", "mov", "mp4", "mts", "webm", "wmv");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return i17.contains(lowerCase);
    }

    public final boolean c(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return a(str) || b(str);
    }

    public final android.graphics.Bitmap d(java.lang.String str, android.content.Context context) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FileThumbHelper", "genThumb failed: filePath is null or empty");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileThumbHelper", "genThumb: filePath = " + str);
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            kotlin.jvm.internal.o.d(parse);
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            android.graphics.Bitmap f17 = f(parse, context);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("genThumb: bitmap is null = ");
            sb6.append(f17 == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileThumbHelper", sb6.toString());
            return f17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileThumbHelper", "genThumb failed: Failed to parse URI: " + str, e17);
            return null;
        }
    }

    public final boolean e(java.lang.String srcThumbPath, java.lang.String destThumbPath) {
        kotlin.jvm.internal.o.g(srcThumbPath, "srcThumbPath");
        kotlin.jvm.internal.o.g(destThumbPath, "destThumbPath");
        if (!com.tencent.mm.vfs.w6.j(destThumbPath)) {
            com.tencent.mm.vfs.w6.e(destThumbPath);
        }
        if (r26.i0.y(srcThumbPath, "content://", false)) {
            srcThumbPath = com.tencent.mm.sdk.platformtools.t8.J(com.tencent.mm.sdk.platformtools.x2.f193071a, android.net.Uri.parse(srcThumbPath));
        }
        java.lang.String str = srcThumbPath;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileThumbHelper", "genThumb failed: realPath is null");
            return false;
        }
        lh0.i iVar = (lh0.i) i95.n0.c(lh0.i.class);
        android.util.Size size = f430628c;
        boolean wi6 = ((lh0.j) iVar).wi(str, 0, 0, destThumbPath, size.getWidth(), size.getHeight(), f430627b);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileThumbHelper", "genThumb result: " + wi6);
        return wi6;
    }

    public final android.graphics.Bitmap f(android.net.Uri uri, android.content.Context context) {
        android.graphics.Bitmap bitmap;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            try {
                java.util.Objects.toString(uri);
                android.content.ContentResolver contentResolver = context.getContentResolver();
                android.util.Size size = f430628c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(null);
                arrayList.add(size);
                arrayList.add(uri);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contentResolver, arrayList.toArray(), "com/tencent/mm/feature/appmsg/file/FileThumbHelper", "generateThumbnailModern", "(Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;", "android/content/ContentResolver_EXEC_", "loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap loadThumbnail = contentResolver.loadThumbnail((android.net.Uri) arrayList.get(0), (android.util.Size) arrayList.get(1), (android.os.CancellationSignal) arrayList.get(2));
                yj0.a.e(contentResolver, loadThumbnail, "com/tencent/mm/feature/appmsg/file/FileThumbHelper", "generateThumbnailModern", "(Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;", "android/content/ContentResolver_EXEC_", "loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;");
                return loadThumbnail;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileThumbHelper", "generateThumbnailModern failed for URI: " + uri, e17);
                return null;
            }
        }
        java.util.Objects.toString(uri);
        try {
            android.database.Cursor query = context.getContentResolver().query(uri, new java.lang.String[]{"_id", "_data"}, null, null, null);
            if (query == null) {
                return null;
            }
            try {
                if (query.moveToFirst()) {
                    long j17 = query.getLong(query.getColumnIndexOrThrow("_id"));
                    android.content.ContentResolver contentResolver2 = context.getContentResolver();
                    zj0.a aVar = new zj0.a();
                    aVar.c(null);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    aVar.c(1);
                    aVar.c(java.lang.Long.valueOf(j17));
                    aVar.c(contentResolver2);
                    java.lang.Object obj = new java.lang.Object();
                    yj0.a.d(obj, aVar.b(), "com/tencent/mm/feature/appmsg/file/FileThumbHelper", "generateThumbnailLegacy", "(Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    android.content.ContentResolver contentResolver3 = (android.content.ContentResolver) aVar.a(0);
                    zj0.c.f473285a.set(aVar);
                    long longValue = ((java.lang.Long) aVar.a(1)).longValue();
                    zj0.a a17 = zj0.c.a();
                    bitmap = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentResolver3, longValue, ((java.lang.Integer) a17.a(2)).intValue(), (android.graphics.BitmapFactory.Options) a17.a(3));
                    yj0.a.e(obj, bitmap, "com/tencent/mm/feature/appmsg/file/FileThumbHelper", "generateThumbnailLegacy", "(Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FileThumbHelper", "generateThumbnailLegacy: No data found for URI: " + uri);
                    bitmap = null;
                }
                vz5.b.a(query, null);
                return bitmap;
            } finally {
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileThumbHelper", "generateThumbnailLegacy failed for URI: " + uri, e18);
            return null;
        }
    }

    public final java.lang.String g(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = gm0.j1.b().j() + "_file_thumb";
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        sb6.append(lp0.b.h0(str2).o());
        sb6.append(java.io.File.separator);
        sb6.append(c01.id.c());
        sb6.append('_');
        if (r26.n0.N(str)) {
            int i17 = f430629d;
            f430629d = i17 + 1;
            str = java.lang.String.valueOf(i17);
        }
        sb6.append(str);
        sb6.append("_s");
        return sb6.toString();
    }

    public final android.graphics.Bitmap h(android.graphics.Bitmap bitmap, int i17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        if (i17 == 0) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i17);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Boolean.TRUE);
            aVar.c(matrix);
            aVar.c(java.lang.Integer.valueOf(height));
            aVar.c(java.lang.Integer.valueOf(width));
            aVar.c(0);
            aVar.c(0);
            aVar.c(bitmap);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/feature/appmsg/file/FileThumbHelper", "rotateBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/feature/appmsg/file/FileThumbHelper", "rotateBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            bitmap.recycle();
            return createBitmap;
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileThumbHelper", e17, "", new java.lang.Object[0]);
            return bitmap;
        }
    }
}
