package ut5;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.shadow.core.common.Logger f431193a = com.tencent.shadow.core.common.LoggerFactory.getLogger("Shadow.DexClassLoaderHelper");

    public static java.lang.ClassLoader a(com.tencent.shadow.core.common.InstalledApk installedApk, java.lang.ClassLoader classLoader) {
        f431193a.info("DexClassLoaderHelper create for %s", installedApk);
        if (installedApk.apkFilePath == null && installedApk.apkFd == null) {
            throw new java.lang.IllegalArgumentException("InstalledApk not accept to ApkClassLoader");
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = installedApk.apkFd;
        if (parcelFileDescriptor != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return new dalvik.system.InMemoryDexClassLoader(c(parcelFileDescriptor), installedApk.libraryPath, classLoader);
            }
            throw new java.lang.IllegalStateException("Android Q及以上系统InMemoryDexClassLoader才开始支持指定librarySearchPath(load(libName)接口需要)");
        }
        java.io.File file = new java.io.File(installedApk.apkFilePath);
        if (file.exists()) {
            file.setReadable(true, false);
            file.setWritable(false, false);
        }
        return new dalvik.system.DexClassLoader(installedApk.apkFilePath, installedApk.oDexPath, installedApk.libraryPath, classLoader);
    }

    public static java.nio.ByteBuffer[] b(java.io.FileInputStream fileInputStream) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(fileInputStream));
        while (true) {
            java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                zipInputStream.close();
                java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[arrayList.size()];
                arrayList.toArray(byteBufferArr);
                return byteBufferArr;
            }
            if (nextEntry.getName().endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                arrayList.add(java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            }
            zipInputStream.closeEntry();
        }
    }

    public static java.nio.ByteBuffer[] c(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            android.system.Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, android.system.OsConstants.SEEK_SET);
            return b(new java.io.FileInputStream(parcelFileDescriptor.getFileDescriptor()));
        } catch (android.system.ErrnoException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }
}
