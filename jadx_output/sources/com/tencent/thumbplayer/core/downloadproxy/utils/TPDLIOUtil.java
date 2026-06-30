package com.tencent.thumbplayer.core.downloadproxy.utils;

/* loaded from: classes13.dex */
public class TPDLIOUtil {
    private static final java.lang.String FILE_NAME = "TPDLIOUtil";
    private static final java.lang.String PROTOCOL_ASSET = "asset";
    private static final java.lang.String PROTOCOL_FILE = "file";
    private static final java.lang.String PROTOCOL_HTTP = "http";
    private static final java.lang.String PROTOCOL_HTTPS = "https";
    private static java.util.regex.Pattern PROTOCOL_PATTERN = java.util.regex.Pattern.compile("^(\\w+):/{2,3}");
    private static java.util.regex.Pattern PATH_PATTERN = java.util.regex.Pattern.compile("^(\\w+):/{2,3}(.*)");

    public static java.io.File compare(java.io.File file, java.io.File file2) {
        return file == null ? file2 : (file2 == null || !file2.exists()) ? file : (file.exists() && file.lastModified() > file2.lastModified()) ? file : file2;
    }

    public static int copy(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return 0;
        }
        byte[] bArr = new byte[1024];
        int i17 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i17 += read;
            } catch (java.io.IOException unused) {
            }
        }
        return i17;
    }

    public static boolean createFile(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        if (!createParentDirectories(file)) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static boolean createParentDirectories(java.io.File file) {
        if (file == null) {
            return false;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return true;
        }
        return parentFile.mkdirs();
    }

    public static java.lang.String getPath(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = PATH_PATTERN.matcher(str);
        return (matcher.find() && matcher.group(1).equals(PROTOCOL_ASSET)) ? matcher.group(2) : str;
    }

    public static java.lang.String getProtocol(java.lang.String str) {
        if (str != null && str.length() > 0) {
            java.util.regex.Matcher matcher = PROTOCOL_PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return PROTOCOL_FILE;
    }

    public static boolean isExternalStorageMounted() {
        return android.os.Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isRemoteFile(java.lang.String str) {
        java.lang.String protocol = getProtocol(str);
        return protocol.equals(PROTOCOL_HTTPS) || protocol.equals(PROTOCOL_HTTP);
    }

    public static java.io.InputStream open(android.content.Context context, java.lang.String str) {
        java.lang.String protocol = getProtocol(str);
        if (protocol.equals(PROTOCOL_ASSET)) {
            try {
                return context.getAssets().open(getPath(str));
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        if (protocol.equals(PROTOCOL_FILE)) {
            try {
                return new java.io.FileInputStream(getPath(str));
            } catch (java.lang.Exception unused2) {
                return null;
            }
        }
        if (!protocol.equals(PROTOCOL_HTTP) && !protocol.equals(PROTOCOL_HTTPS)) {
            return null;
        }
        try {
            return new java.net.URL(str).openStream();
        } catch (java.lang.Exception unused3) {
            return null;
        }
    }

    public static java.io.InputStream openInputStream(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openInputStream(new java.io.File(str));
    }

    public static java.io.OutputStream openOutputStream(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openOutputStream(new java.io.File(str));
    }

    public static void recursiveDelete(java.io.File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        java.io.File[] listFiles = file.listFiles();
                        if (listFiles == null) {
                            return;
                        }
                        for (java.io.File file2 : listFiles) {
                            recursiveDelete(file2);
                        }
                    }
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.d(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete: delete=" + file.delete());
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.d(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete failed, error:" + e17.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r6.createNewFile() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean write(java.io.File r6, byte[] r7, int r8, int r9) {
        /*
            java.lang.String r0 = "write error:"
            java.lang.String r1 = "tpdlnative"
            java.lang.String r2 = "TPDLIOUtil"
            r3 = 0
            if (r6 == 0) goto L88
            if (r7 == 0) goto L88
            int r4 = r7.length
            if (r4 > 0) goto L10
            goto L88
        L10:
            boolean r4 = r6.exists()
            if (r4 != 0) goto L2a
            java.io.File r4 = r6.getParentFile()
            if (r4 == 0) goto L23
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L23
            return r3
        L23:
            boolean r4 = r6.createNewFile()     // Catch: java.io.IOException -> L29
            if (r4 != 0) goto L2a
        L29:
            return r3
        L2a:
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L6e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L6e
            r5.write(r7, r8, r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r5.close()     // Catch: java.io.IOException -> L37
            goto L4b
        L37:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(r2, r3, r1, r6)
        L4b:
            r6 = 1
            return r6
        L4d:
            r6 = move-exception
            r4 = r5
            goto L53
        L50:
            r4 = r5
            goto L6e
        L52:
            r6 = move-exception
        L53:
            if (r4 == 0) goto L6d
            r4.close()     // Catch: java.io.IOException -> L59
            goto L6d
        L59:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(r2, r3, r1, r7)
        L6d:
            throw r6
        L6e:
            if (r4 == 0) goto L88
            r4.close()     // Catch: java.io.IOException -> L74
            goto L88
        L74:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(r2, r3, r1, r6)
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.write(java.io.File, byte[], int, int):boolean");
    }

    public static int copy(java.io.File file, java.io.File file2) {
        java.io.FileOutputStream fileOutputStream;
        if (file == null || file2 == null || !file.exists()) {
            return 0;
        }
        if (!file2.exists()) {
            java.io.File parentFile = file2.getParentFile();
            if (parentFile == null) {
                return 0;
            }
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return 0;
            }
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    int copy = copy(fileInputStream2, fileOutputStream);
                    try {
                        fileInputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                    return copy;
                } catch (java.io.FileNotFoundException unused3) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused5) {
                        }
                    }
                    return 0;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (java.io.IOException unused6) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (java.io.IOException unused7) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused8) {
                fileOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileOutputStream = null;
            }
        } catch (java.io.FileNotFoundException unused9) {
            fileOutputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
    }

    public static java.io.InputStream openInputStream(java.io.File file) {
        if (file == null) {
            return null;
        }
        try {
            return new java.io.FileInputStream(file);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    public static java.io.OutputStream openOutputStream(java.io.File file) {
        if (file != null && createFile(file)) {
            try {
                return new java.io.FileOutputStream(file);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean createFile(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return createFile(new java.io.File(str));
    }

    public static boolean createParentDirectories(java.lang.String str) {
        return createParentDirectories(new java.io.File(str));
    }
}
