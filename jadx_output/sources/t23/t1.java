package t23;

/* loaded from: classes10.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f415272a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f415273b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f415274c;

    static {
        android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
        int[] iArr = {defaultDisplay.getWidth(), defaultDisplay.getHeight()};
        f415273b = java.lang.Math.max(iArr[0], com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT);
        f415274c = java.lang.Math.max(iArr[1], com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT);
    }

    public static android.graphics.Bitmap a(java.lang.String str, java.lang.String str2, long j17, int i17) {
        if (i17 == 4096) {
            return c(str, str2, j17, 3);
        }
        if (i17 == 8192) {
            return c(str, str2, j17, 1);
        }
        if (i17 != 12288) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaManager", "get image thumb, unknown type %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (j62.e.g().d(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumThumbnailResolver(), false, false) != 0) {
            android.graphics.Bitmap c17 = c(str, str2, j17, 1);
            return (c17 == null || c17.isRecycled()) ? g(str, j33.n.a(str, e())) : c17;
        }
        android.graphics.Bitmap g17 = g(str, j33.n.a(str, e()));
        return (g17 == null || g17.isRecycled()) ? c(str, str2, j17, 1) : g17;
    }

    public static android.graphics.Bitmap b(long j17, int i17) {
        try {
            try {
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    if (j62.e.g().d(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumThumbnailResolver(), false, false) != 0) {
                        android.net.Uri withAppendedId = android.content.ContentUris.withAppendedId(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j17);
                        android.util.Size size = new android.util.Size(e(), e());
                        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(null);
                        arrayList.add(size);
                        arrayList.add(withAppendedId);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(contentResolver, arrayList.toArray(), "com/tencent/mm/plugin/gallery/model/MediaManager", "getImageThumbFromContentResolver", "(JI)Landroid/graphics/Bitmap;", "android/content/ContentResolver_EXEC_", "loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap loadThumbnail = contentResolver.loadThumbnail((android.net.Uri) arrayList.get(0), (android.util.Size) arrayList.get(1), (android.os.CancellationSignal) arrayList.get(2));
                        yj0.a.e(contentResolver, loadThumbnail, "com/tencent/mm/plugin/gallery/model/MediaManager", "getImageThumbFromContentResolver", "(JI)Landroid/graphics/Bitmap;", "android/content/ContentResolver_EXEC_", "loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;");
                        return loadThumbnail;
                    }
                }
                android.content.ContentResolver contentResolver2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
                zj0.a aVar = new zj0.a();
                aVar.c(null);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(java.lang.Integer.valueOf(i17));
                aVar.c(java.lang.Long.valueOf(j17));
                aVar.c(contentResolver2);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/gallery/model/MediaManager", "getImageThumbFromContentResolver", "(JI)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.content.ContentResolver contentResolver3 = (android.content.ContentResolver) aVar.a(0);
                zj0.c.f473285a.set(aVar);
                long longValue = ((java.lang.Long) aVar.a(1)).longValue();
                zj0.a a17 = zj0.c.a();
                android.graphics.Bitmap thumbnail = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentResolver3, longValue, ((java.lang.Integer) a17.a(2)).intValue(), (android.graphics.BitmapFactory.Options) a17.a(3));
                yj0.a.e(obj, thumbnail, "com/tencent/mm/plugin/gallery/model/MediaManager", "getImageThumbFromContentResolver", "(JI)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                return thumbnail;
            } catch (java.io.IOException e17) {
                e = e17;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaManager", e, null, new java.lang.Object[0]);
                android.content.ContentResolver contentResolver4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
                zj0.a aVar2 = new zj0.a();
                aVar2.c(null);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                aVar2.c(java.lang.Integer.valueOf(i17));
                aVar2.c(java.lang.Long.valueOf(j17));
                aVar2.c(contentResolver4);
                java.lang.Object obj2 = new java.lang.Object();
                yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/gallery/model/MediaManager", "getImageThumbFromContentResolver", "(JI)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.content.ContentResolver contentResolver5 = (android.content.ContentResolver) aVar2.a(0);
                zj0.c.f473285a.set(aVar2);
                long longValue2 = ((java.lang.Long) aVar2.a(1)).longValue();
                zj0.a a18 = zj0.c.a();
                android.graphics.Bitmap thumbnail2 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentResolver5, longValue2, ((java.lang.Integer) a18.a(2)).intValue(), (android.graphics.BitmapFactory.Options) a18.a(3));
                yj0.a.e(obj2, thumbnail2, "com/tencent/mm/plugin/gallery/model/MediaManager", "getImageThumbFromContentResolver", "(JI)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                return thumbnail2;
            }
        } catch (java.io.IOException e18) {
            e = e18;
        }
    }

    public static android.graphics.Bitmap c(java.lang.String str, java.lang.String str2, long j17, int i17) {
        android.graphics.Bitmap bitmap = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "filePath is null or nil");
            return null;
        }
        try {
            java.lang.System.currentTimeMillis();
            bitmap = b(j17, i17);
            if (bitmap != null) {
                bitmap.getWidth();
            }
            if (bitmap != null) {
                bitmap.getHeight();
            }
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception | java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "get thumb from content resolver failed: [%s]", e17.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaManager", e17, "", new java.lang.Object[0]);
        }
        return bitmap;
    }

    public static android.graphics.Bitmap d(java.lang.String str) {
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "filepath is null or nil");
            return null;
        }
        try {
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "getSuitableBmp fail, file does not exist, filePath = " + str);
                return null;
            }
            int i18 = f415273b;
            int i19 = f415274c;
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            boolean z17 = true;
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, options);
            if (d17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaManager", "bitmap recycle %s", d17.toString());
                d17.recycle();
            }
            int i27 = options.outWidth;
            if (i27 > 0 && (i17 = options.outHeight) > 0) {
                boolean z18 = com.tencent.mm.sdk.platformtools.q2.c(i27, i17) && options.outWidth > 480;
                if (!com.tencent.mm.sdk.platformtools.q2.e(options.outWidth, options.outHeight) || options.outHeight <= 480) {
                    z17 = false;
                }
                if (z18 || z17) {
                    i19 = options.outHeight;
                    i18 = options.outWidth;
                }
                int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
                if (a17 != 90 && a17 != 270) {
                    int i28 = i19;
                    i19 = i18;
                    i18 = i28;
                }
                android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(str, i18, i19, false);
                if (T == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "getSuitableBmp fail, temBmp is null, filePath = " + str);
                    return null;
                }
                android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, a17);
                w07.getHeight();
                w07.getWidth();
                return w07;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "decode bitmap err: " + e17.getMessage());
            return null;
        }
    }

    public static int e() {
        int i17 = f415272a;
        if (i17 > 0) {
            return i17;
        }
        int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 100);
        f415272a = a17;
        return a17;
    }

    public static android.graphics.Bitmap f(long j17, int i17, java.lang.String str, java.lang.String str2, int i18) {
        android.graphics.Bitmap bitmap = null;
        if (t23.p0.k() == null) {
            return null;
        }
        if (i17 == 1) {
            android.graphics.Bitmap a17 = a(str, str2, j17, i18);
            if (a17 != null) {
                return a17;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "get thumb from content resolver failed: [%s], [%s]", str, str2);
            return a17;
        }
        if (i17 != 2) {
            if (i17 != 6) {
                return null;
            }
            return a(str, str2, j17, i18);
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                if (j62.e.g().d(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumThumbnailResolver(), false, false) == 1) {
                    android.net.Uri withAppendedId = android.content.ContentUris.withAppendedId(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j17);
                    android.util.Size size = new android.util.Size(e(), e());
                    android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(null);
                    arrayList.add(size);
                    arrayList.add(withAppendedId);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(contentResolver, arrayList.toArray(), "com/tencent/mm/plugin/gallery/model/MediaManager", "getVideoThumb", "(JLjava/lang/String;)Landroid/graphics/Bitmap;", "android/content/ContentResolver_EXEC_", "loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap loadThumbnail = contentResolver.loadThumbnail((android.net.Uri) arrayList.get(0), (android.util.Size) arrayList.get(1), (android.os.CancellationSignal) arrayList.get(2));
                    yj0.a.e(contentResolver, loadThumbnail, "com/tencent/mm/plugin/gallery/model/MediaManager", "getVideoThumb", "(JLjava/lang/String;)Landroid/graphics/Bitmap;", "android/content/ContentResolver_EXEC_", "loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;");
                    return loadThumbnail;
                }
            }
            android.content.ContentResolver contentResolver2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
            zj0.a aVar = new zj0.a();
            aVar.c(null);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(1);
            aVar.c(java.lang.Long.valueOf(j17));
            aVar.c(contentResolver2);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/gallery/model/MediaManager", "getVideoThumb", "(JLjava/lang/String;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Video$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.content.ContentResolver contentResolver3 = (android.content.ContentResolver) aVar.a(0);
            zj0.c.f473285a.set(aVar);
            long longValue = ((java.lang.Long) aVar.a(1)).longValue();
            zj0.a a18 = zj0.c.a();
            android.graphics.Bitmap thumbnail = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentResolver3, longValue, ((java.lang.Integer) a18.a(2)).intValue(), (android.graphics.BitmapFactory.Options) a18.a(3));
            yj0.a.e(obj, thumbnail, "com/tencent/mm/plugin/gallery/model/MediaManager", "getVideoThumb", "(JLjava/lang/String;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Video$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            bitmap = thumbnail;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "exception: %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        if (bitmap != null) {
            return bitmap;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "get video thumb failed : [%d] [%s]", java.lang.Long.valueOf(j17), str2);
        android.graphics.Bitmap D = com.tencent.mm.sdk.platformtools.x.D(str2, 1, -1);
        if (D != null || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return D;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaManager", "get video thumb failed : [%d], call media scanner : [%s]", java.lang.Long.valueOf(j17), str2);
        q75.c.f(str2, com.tencent.mm.sdk.platformtools.x2.f193071a);
        return D;
    }

    public static android.graphics.Bitmap g(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(bitmap, com.tencent.mm.sdk.platformtools.l.a(str));
        bitmap.getWidth();
        bitmap.getHeight();
        java.lang.System.currentTimeMillis();
        if (w07 != null) {
            return w07;
        }
        return null;
    }
}
