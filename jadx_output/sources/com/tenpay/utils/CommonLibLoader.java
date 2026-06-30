package com.tenpay.utils;

/* loaded from: classes12.dex */
public class CommonLibLoader {
    private static boolean extractAndLoadLibFile(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = str + "/" + str2;
        java.io.File file = new java.io.File(str3, str2);
        try {
            if (file.exists()) {
                if (md5sum(com.tenpay.utils.CommonLibLoader.class.getResourceAsStream(str4)).equals(md5sum(new java.io.FileInputStream(file)))) {
                    return loadNativeLib(str3, str2);
                }
                if (!file.delete()) {
                    throw new java.io.IOException("failed to remove existing native library file: " + file.getAbsolutePath());
                }
            }
            java.io.InputStream resourceAsStream = com.tenpay.utils.CommonLibLoader.class.getResourceAsStream(str4);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            resourceAsStream.close();
            if (!java.lang.System.getProperty("os.name").contains("Windows")) {
                try {
                    java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"chmod", "755", file.getAbsolutePath()}).waitFor();
                } catch (java.lang.Throwable unused) {
                }
            }
            return loadNativeLib(str3, str2);
        } catch (java.io.IOException e17) {
            java.lang.System.err.println(e17.getMessage());
            return false;
        }
    }

    private static boolean extractResourceFiles(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return extractAndLoadLibFile(str, new java.lang.String[]{str2}[0], str3) & true;
    }

    private static java.lang.String getNativeLibPath() {
        java.lang.String lowerCase = java.lang.System.getProperty("os.name").toLowerCase();
        if (lowerCase.contains("win")) {
            return "/win64";
        }
        if (lowerCase.contains("nux")) {
            return "/linux";
        }
        if (lowerCase.contains(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC)) {
            return "/mac";
        }
        return null;
    }

    public static boolean load(java.lang.String str) {
        java.lang.String mapLibraryName = java.lang.System.mapLibraryName(str);
        if (mapLibraryName != null && mapLibraryName.endsWith("dll")) {
            mapLibraryName = com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH.concat(mapLibraryName);
        }
        java.lang.String str2 = "/" + com.tenpay.utils.Platform.getNativeLibraryResourcePrefix();
        java.lang.System.out.println("jar lib path=" + str2);
        if (com.tenpay.utils.CommonLibLoader.class.getResource(str2 + "/" + mapLibraryName) == null) {
            str2 = getNativeLibPath();
            if (com.tenpay.utils.CommonLibLoader.class.getResource(str2 + "/" + mapLibraryName) == null) {
                throw new java.lang.Exception("Error loading native library: " + str2 + "/" + mapLibraryName);
            }
        }
        return extractResourceFiles(str2, mapLibraryName, new java.io.File(java.lang.System.getProperty("java.io.tmpdir")).getAbsolutePath());
    }

    private static synchronized boolean loadNativeLib(java.lang.String str, java.lang.String str2) {
        synchronized (com.tenpay.utils.CommonLibLoader.class) {
            if (!new java.io.File(str, str2).exists()) {
                return false;
            }
            try {
                com.tencent.cso.CsoLoader.g(new java.io.File(str, str2).getAbsolutePath());
                return true;
            } catch (java.lang.UnsatisfiedLinkError e17) {
                java.lang.System.err.println(e17);
                return false;
            }
        }
    }

    public static java.lang.String md5sum(java.io.InputStream inputStream) {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
        try {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                do {
                } while (new java.security.DigestInputStream(bufferedInputStream, messageDigest).read() >= 0);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byteArrayOutputStream.write(messageDigest.digest());
                return byteArrayOutputStream.toString();
            } catch (java.security.NoSuchAlgorithmException e17) {
                throw new java.lang.IllegalStateException("MD5 algorithm is not available: " + e17);
            }
        } finally {
            bufferedInputStream.close();
        }
    }
}
