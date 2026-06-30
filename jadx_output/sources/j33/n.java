package j33;

/* loaded from: classes10.dex */
public abstract class n {
    public static android.graphics.Bitmap a(java.lang.String str, int i17) {
        android.graphics.Bitmap b17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryBitmapUtil", "imgPath is invalid.");
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        try {
            byte[] thumbnail = new androidx.exifinterface.media.ExifInterface(str).getThumbnail();
            if (thumbnail != null && (b17 = b(thumbnail, options, i17)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryBitmapUtil", "decode thumb success from exif.");
                return b17;
            }
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e17, "failed to find file to read thumbnail: %s.", str);
        } catch (java.io.IOException e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e, "failed to get thumbnail from: %s.", str);
        } catch (java.lang.IndexOutOfBoundsException e19) {
            e = e19;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e, "failed to get thumbnail from: %s.", str);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e27, "failed to get thumbnail from: %s.", str);
        } catch (java.lang.OutOfMemoryError e28) {
            e = e28;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e, "failed to get thumbnail from: %s.", str);
        }
        try {
            return c(com.tencent.mm.vfs.w6.z(com.tencent.mm.vfs.z7.a(str), null, "r").getFileDescriptor(), options, i17);
        } catch (java.lang.Exception e29) {
            e = e29;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e, "decodeThumbnail fail!!!", new java.lang.Object[0]);
            return null;
        } catch (java.lang.OutOfMemoryError e37) {
            e = e37;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e, "decodeThumbnail fail!!!", new java.lang.Object[0]);
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", th6, "err!!", new java.lang.Object[0]);
            return null;
        }
    }

    public static android.graphics.Bitmap b(byte[] bArr, android.graphics.BitmapFactory.Options options, int i17) {
        int i18;
        int i19;
        if (bArr == null) {
            return null;
        }
        android.graphics.BitmapFactory.Options options2 = options == null ? new android.graphics.BitmapFactory.Options() : options;
        options2.inJustDecodeBounds = true;
        int length = bArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options2);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(bArr);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeIfBigEnough", "([BLandroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3)), "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeIfBigEnough", "([BLandroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i27 = options2.outWidth;
        if (i27 < i17 || (i18 = options2.outHeight) < i17) {
            return null;
        }
        int max = java.lang.Math.max(i27 / i17, i18 / i17);
        if (max <= 1) {
            i19 = 1;
        } else if (max > 8) {
            i19 = (max / 8) * 8;
        } else {
            if (max <= 0) {
                throw new java.lang.IllegalArgumentException();
            }
            i19 = java.lang.Integer.highestOneBit(max);
        }
        options2.inSampleSize = i19;
        options2.inJustDecodeBounds = false;
        options2.inMutable = true;
        int length2 = bArr.length;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(java.lang.Integer.valueOf(length2));
        arrayList2.add(0);
        arrayList2.add(bArr);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeIfBigEnough", "([BLandroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList2.get(3));
        yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeIfBigEnough", "([BLandroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeByteArray;
    }

    public static android.graphics.Bitmap c(java.io.FileDescriptor fileDescriptor, android.graphics.BitmapFactory.Options options, int i17) {
        int i18;
        int i19;
        int i27;
        if (fileDescriptor == null) {
            return null;
        }
        android.graphics.BitmapFactory.Options options2 = options == null ? new android.graphics.BitmapFactory.Options() : options;
        options2.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options2);
        arrayList.add(null);
        arrayList.add(fileDescriptor);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeThumbnail", "(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeThumbnail", "(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i28 = options2.outWidth;
        int i29 = options2.outHeight;
        if (i28 == -1 || i29 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryBitmapUtil", "decode error, get invalid picture size");
            return null;
        }
        int min = java.lang.Math.min(i28, i29) / i17;
        if (min < 1) {
            i18 = 1;
        } else {
            if (min <= 0 || min > 1073741824) {
                throw new java.lang.IllegalArgumentException("n is invalid: " + min);
            }
            int i37 = min - 1;
            int i38 = (i37 >> 16) | i37;
            int i39 = i38 | (i38 >> 8);
            int i47 = i39 | (i39 >> 4);
            int i48 = i47 | (i47 >> 2);
            i18 = (i48 | (i48 >> 1)) + 1;
        }
        while (true) {
            i19 = i28 / i18;
            i27 = i29 / i18;
            if (i19 * i27 < 640000) {
                break;
            }
            i18 *= 2;
        }
        options2.inSampleSize = i18;
        options2.inJustDecodeBounds = false;
        options2.inMutable = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(null);
        arrayList2.add(fileDescriptor);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeThumbnail", "(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
        yj0.a.e(obj2, decodeFileDescriptor, "com/tencent/mm/plugin/gallery/utils/GalleryBitmapUtil", "decodeThumbnail", "(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeFileDescriptor.getWidth() * decodeFileDescriptor.getHeight() >= 640000 ? android.graphics.Bitmap.createScaledBitmap(decodeFileDescriptor, i19, i27, false) : decodeFileDescriptor;
    }
}
