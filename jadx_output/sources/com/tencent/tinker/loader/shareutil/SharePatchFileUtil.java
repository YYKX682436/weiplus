package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class SharePatchFileUtil {
    private static final java.lang.String TAG = "Tinker.PatchFileUtil";
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean checkIfMd5Valid(java.lang.String str) {
        return str != null && str.length() == 32;
    }

    public static boolean checkResourceArscMd5(java.io.File file, java.lang.String str) {
        java.util.zip.ZipFile zipFile;
        java.util.zip.ZipEntry entry;
        java.util.zip.ZipFile zipFile2 = null;
        java.io.InputStream inputStream = null;
        try {
            zipFile = new java.util.zip.ZipFile(file);
            try {
                entry = zipFile.getEntry(com.tencent.tinker.loader.shareutil.ShareConstants.RES_ARSC);
            } catch (java.lang.Throwable th6) {
                th = th6;
                zipFile2 = zipFile;
                try {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "checkResourceArscMd5 throwable:" + th.getMessage(), new java.lang.Object[0]);
                    return false;
                } finally {
                    closeZip(zipFile2);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        if (entry == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "checkResourceArscMd5 resources.arsc not found", new java.lang.Object[0]);
            closeZip(zipFile);
            return false;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            java.lang.String md52 = getMD5(inputStream);
            if (md52 != null) {
                if (md52.equals(str)) {
                    closeZip(zipFile);
                    return true;
                }
            }
            closeZip(zipFile);
            return false;
        } finally {
            closeQuietly(inputStream);
        }
    }

    public static java.lang.String checkTinkerLastUncaughtCrash(android.content.Context context) {
        java.io.BufferedReader bufferedReader;
        java.io.File patchLastCrashFile = getPatchLastCrashFile(context);
        java.io.BufferedReader bufferedReader2 = null;
        if (!isLegalFile(patchLastCrashFile)) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(patchLastCrashFile)));
            while (true) {
                try {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            closeQuietly(bufferedReader);
                            return stringBuffer.toString();
                        }
                        stringBuffer.append(readLine);
                        stringBuffer.append("\n");
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "checkTinkerLastUncaughtCrash exception: " + e, new java.lang.Object[0]);
                        closeQuietly(bufferedReader);
                        return null;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    closeQuietly(bufferedReader2);
                    throw th;
                }
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            bufferedReader = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            closeQuietly(bufferedReader2);
            throw th;
        }
    }

    public static void closeQuietly(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof java.io.Closeable) {
                ((java.io.Closeable) obj).close();
            } else if (obj instanceof java.lang.AutoCloseable) {
                ((java.lang.AutoCloseable) obj).close();
            } else {
                if (!(obj instanceof java.util.zip.ZipFile)) {
                    throw new java.lang.IllegalArgumentException("obj: " + obj + " cannot be closed.");
                }
                ((java.util.zip.ZipFile) obj).close();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void closeZip(java.util.zip.ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (java.io.IOException e17) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "Failed to close resource", e17);
            }
        }
    }

    public static void copyFileUsingStream(java.io.File file, java.io.File file2) {
        java.io.FileOutputStream fileOutputStream;
        if (!isLegalFile(file) || file2 == null || file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        java.io.File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileOutputStream = new java.io.FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            closeQuietly(fileInputStream2);
                            closeQuietly(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileInputStream = fileInputStream2;
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileOutputStream = null;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
    }

    public static final boolean deleteDir(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return deleteDir(new java.io.File(str));
    }

    public static void deleteDirAsync(java.lang.String str) {
        deleteDirAsync(new java.io.File(str));
    }

    public static void ensureFileDirectory(java.io.File file) {
        if (file == null) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    public static long getFileOrDirectorySize(java.io.File file) {
        long j17 = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    j17 += file2.isDirectory() ? getFileOrDirectorySize(file2) : file2.length();
                }
            }
        }
        return j17;
    }

    public static java.io.File getGuardDirectory(java.lang.String str) {
        return new java.io.File(str, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_GUARD_DIRECTORY_NAME);
    }

    public static final java.lang.String getMD5(java.io.InputStream inputStream) {
        int i17;
        if (inputStream == null) {
            return null;
        }
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            for (byte b17 : messageDigest.digest()) {
                sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
            }
            return sb6.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.io.File getPatchDirectory(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        "oppo".equalsIgnoreCase(android.os.Build.MANUFACTURER);
        return new java.io.File(applicationInfo.dataDir, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_DIRECTORY_NAME);
    }

    public static java.io.File getPatchInfoFile(java.lang.String str) {
        return new java.io.File(str + "/patch_meta.info");
    }

    public static java.io.File getPatchInfoLockFile(java.lang.String str) {
        return new java.io.File(str + "/info.lock");
    }

    public static java.io.File getPatchLastCrashFile(android.content.Context context) {
        java.io.File patchTempDirectory = getPatchTempDirectory(context);
        if (patchTempDirectory == null) {
            return null;
        }
        return new java.io.File(patchTempDirectory, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_TEMP_LAST_CRASH_NAME);
    }

    public static java.io.File getPatchTempDirectory(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        return new java.io.File(applicationInfo.dataDir, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_TEMP_DIRECTORY_NAME);
    }

    public static java.lang.String getPatchVersionDirectory(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_BASE_NAME + str.substring(0, 8);
    }

    public static java.lang.String getPatchVersionFile(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return getPatchVersionDirectory(str) + ".apk";
    }

    public static final boolean isLegalFile(java.io.File file) {
        return file != null && file.exists() && file.canRead() && file.isFile() && file.length() > 0;
    }

    public static boolean isRawDexFile(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX);
    }

    public static java.lang.String loadDigestes(java.util.jar.JarFile jarFile, java.util.jar.JarEntry jarEntry) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.BufferedInputStream bufferedInputStream = null;
        try {
            java.io.InputStream inputStream = jarFile.getInputStream(jarEntry);
            byte[] bArr = new byte[4096];
            java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(inputStream);
            while (true) {
                try {
                    int read = bufferedInputStream2.read(bArr);
                    if (read <= 0) {
                        closeQuietly(bufferedInputStream2);
                        return sb6.toString();
                    }
                    sb6.append(new java.lang.String(bArr, 0, read));
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedInputStream = bufferedInputStream2;
                    closeQuietly(bufferedInputStream);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static java.lang.String optimizedPathFor(java.io.File file, java.io.File file2) {
        if (!com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isAfterAndroidO()) {
            java.lang.String name = file.getName();
            if (!name.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                int lastIndexOf = name.lastIndexOf(".");
                if (lastIndexOf < 0) {
                    name = name.concat(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX);
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(lastIndexOf + 4);
                    sb6.append((java.lang.CharSequence) name, 0, lastIndexOf);
                    sb6.append(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX);
                    name = sb6.toString();
                }
            }
            return new java.io.File(file2, name).getPath();
        }
        try {
            java.lang.String currentInstructionSet = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getCurrentInstructionSet();
            java.io.File parentFile = file.getParentFile();
            java.lang.String name2 = file.getName();
            int lastIndexOf2 = name2.lastIndexOf(46);
            if (lastIndexOf2 > 0) {
                name2 = name2.substring(0, lastIndexOf2);
            }
            return parentFile.getAbsolutePath() + "/oat/" + currentInstructionSet + "/" + name2 + com.tencent.tinker.loader.shareutil.ShareConstants.ODEX_SUFFIX;
        } catch (java.lang.Exception e17) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("getCurrentInstructionSet fail:", e17);
        }
    }

    public static final boolean safeDeleteFile(java.io.File file) {
        boolean z17 = true;
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "safeDeleteFile, try to delete path: " + file.getPath(), new java.lang.Object[0]);
            z17 = file.delete();
            if (!z17) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "Failed to delete file, try to delete when exit. path: " + file.getPath(), new java.lang.Object[0]);
                file.deleteOnExit();
            }
        }
        return z17;
    }

    public static final boolean shouldAcceptEvenIfIllegal(java.io.File file) {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return (("vivo".equalsIgnoreCase(str) || "oppo".equalsIgnoreCase(str) || "meizu".equalsIgnoreCase(str)) || (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(29, true) || com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isArkHotRuning())) && (!file.exists() || (file.length() > 0L ? 1 : (file.length() == 0L ? 0 : -1)) == 0);
    }

    public static boolean verifyDexFileMd5(java.io.File file, java.lang.String str) {
        return verifyDexFileMd5(file, com.tencent.tinker.loader.shareutil.ShareConstants.DEX_IN_JAR, str);
    }

    public static boolean verifyFileMd5(java.io.File file, java.lang.String str) {
        java.lang.String md52;
        if (str == null || (md52 = getMD5(file)) == null) {
            return false;
        }
        return str.equals(md52);
    }

    public static final boolean deleteDir(java.io.File file) {
        java.io.File[] listFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            safeDeleteFile(file);
            return true;
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return true;
        }
        for (java.io.File file2 : listFiles) {
            deleteDir(file2);
        }
        safeDeleteFile(file);
        return true;
    }

    public static void deleteDirAsync(final java.io.File file) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.shareutil.SharePatchFileUtil.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(file);
            }
        }, "tinker-clean") { // from class: com.tencent.tinker.loader.shareutil.SharePatchFileUtil.2
            {
                setPriority(4);
            }
        }.start();
    }

    public static boolean verifyDexFileMd5(java.io.File file, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (file == null || str2 == null || str == null) {
            return false;
        }
        if (isRawDexFile(file.getName())) {
            str3 = getMD5(file);
        } else {
            java.util.zip.ZipFile zipFile = null;
            java.io.InputStream inputStream = null;
            try {
                java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(file);
                try {
                    java.util.zip.ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "There's no entry named: classes.dex in " + file.getAbsolutePath(), new java.lang.Object[0]);
                        closeZip(zipFile2);
                        return false;
                    }
                    try {
                        inputStream = zipFile2.getInputStream(entry);
                        java.lang.String md52 = getMD5(inputStream);
                        closeQuietly(inputStream);
                        str3 = md52;
                    } catch (java.lang.Throwable th6) {
                        try {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "exception occurred when get md5: " + file.getAbsolutePath(), th6);
                            str3 = "";
                        } finally {
                            closeQuietly(inputStream);
                        }
                    }
                    closeZip(zipFile2);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    zipFile = zipFile2;
                    try {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "Bad dex jar file: " + file.getAbsolutePath(), th);
                        return false;
                    } finally {
                        closeZip(zipFile);
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
        return str2.equals(str3);
    }

    public static java.lang.String getMD5(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[digest.length * 2];
            int i17 = 0;
            for (byte b17 : digest) {
                int i18 = i17 + 1;
                char[] cArr2 = hexDigits;
                cArr[i17] = cArr2[(b17 >>> 4) & 15];
                i17 = i18 + 1;
                cArr[i18] = cArr2[b17 & 15];
            }
            return new java.lang.String(cArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getMD5(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(file);
            try {
                try {
                    java.lang.String md52 = getMD5(fileInputStream);
                    closeQuietly(fileInputStream);
                    return md52;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, e.getMessage(), new java.lang.Object[0]);
                    closeQuietly(fileInputStream);
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream2 = fileInputStream;
                closeQuietly(fileInputStream2);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            fileInputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            closeQuietly(fileInputStream2);
            throw th;
        }
    }
}
