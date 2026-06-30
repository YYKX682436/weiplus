package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes12.dex */
public class FileUtils {
    public static java.util.function.Function<java.lang.String, java.lang.Boolean> DELETE_ALL = new org.chromium.base.FileUtils$$a();
    private static final java.lang.String TAG = "FileUtils";
    private byte _hellAccFlag_;

    /* loaded from: classes12.dex */
    public interface Natives {
        java.lang.String getAbsoluteFilePath(java.lang.String str);
    }

    public static void batchDeleteFiles(java.util.List<java.lang.String> list, java.util.function.Function<java.lang.String, java.lang.Boolean> function) {
        for (java.lang.String str : list) {
            if (function == null || function.apply(str).booleanValue()) {
                if (org.chromium.base.ContentUriUtils.isContentUri(str)) {
                    org.chromium.base.ContentUriUtils.delete(str);
                } else {
                    java.io.File file = new java.io.File(str);
                    if (file.exists()) {
                        recursivelyDeleteFile(file, function);
                    }
                }
            }
        }
    }

    public static void copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void copyStreamToFile(java.io.InputStream inputStream, java.io.File file) {
        java.io.File file2 = new java.io.File(file.getPath() + ".tmp");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
        try {
            org.chromium.base.Log.i(TAG, "Writing to %s", file);
            copyStream(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!file2.renameTo(file)) {
                throw new java.io.IOException();
            }
        } catch (java.lang.Throwable th6) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static java.lang.String getAbsoluteFilePath(java.lang.String str) {
        return org.chromium.base.FileUtilsJni.get().getAbsoluteFilePath(str);
    }

    public static java.lang.String getExtension(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        return lastIndexOf >= lastIndexOf2 ? "" : str.substring(lastIndexOf2 + 1).toLowerCase(java.util.Locale.US);
    }

    public static long getFileSizeBytes(java.io.File file) {
        long j17 = 0;
        if (file == null) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        for (java.io.File file2 : listFiles) {
            j17 += getFileSizeBytes(file2);
        }
        return j17;
    }

    public static android.net.Uri getUriForFile(java.io.File file) {
        android.net.Uri uri;
        try {
            uri = org.chromium.base.ContentUriUtils.getContentUriFromFile(file);
        } catch (java.lang.IllegalArgumentException e17) {
            org.chromium.base.Log.e(TAG, "Could not create content uri: " + e17);
            uri = null;
        }
        return uri == null ? android.net.Uri.fromFile(file) : uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Boolean lambda$static$0(java.lang.String str) {
        return java.lang.Boolean.TRUE;
    }

    public static android.graphics.Bitmap queryBitmapFromContentProvider(android.content.Context context, android.net.Uri uri) {
        try {
            android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            try {
                if (openFileDescriptor == null) {
                    org.chromium.base.Log.w(TAG, "Null ParcelFileDescriptor from uri " + uri);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                java.io.FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                if (fileDescriptor == null) {
                    org.chromium.base.Log.w(TAG, "Null FileDescriptor from uri " + uri);
                    openFileDescriptor.close();
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(fileDescriptor);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "org/chromium/base/FileUtils", "queryBitmapFromContentProvider", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList.get(0));
                yj0.a.e(obj, decodeFileDescriptor, "org/chromium/base/FileUtils", "queryBitmapFromContentProvider", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;");
                if (decodeFileDescriptor != null) {
                    openFileDescriptor.close();
                    return decodeFileDescriptor;
                }
                org.chromium.base.Log.w(TAG, "Failed to decode image from uri " + uri);
                openFileDescriptor.close();
                return null;
            } finally {
            }
        } catch (java.io.IOException unused) {
            org.chromium.base.Log.w(TAG, "IO exception when reading uri " + uri);
            return null;
        }
    }

    public static byte[] readStream(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean recursivelyDeleteFile(java.io.File file, java.util.function.Function<java.lang.String, java.lang.Boolean> function) {
        java.io.File[] listFiles;
        if (!file.exists()) {
            file.delete();
            return true;
        }
        if (function != null && !function.apply(file.getPath()).booleanValue()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                recursivelyDeleteFile(file2, function);
            }
        }
        boolean delete = file.delete();
        if (!delete) {
            org.chromium.base.Log.e(TAG, "Failed to delete: %s", file);
        }
        return delete;
    }
}
