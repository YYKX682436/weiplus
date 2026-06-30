package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class DownloadHelper {
    public static final int PHONE = 1;
    public static final float SAVE_FATOR = 1.5f;
    public static final long SAVE_LENGTH = 104857600;
    public static final int SDCARD = 2;
    public static final java.lang.String TAG = "DownloadHelper";
    public static final int UNKNOWN = 0;

    public static java.lang.String correctFileName(java.lang.String str) {
        return str.replace("?", "_").replace("*", "_").replace(" ", "_").replace("$", "_").replace("&", "_").replace("@", "_").replace("#", "_").replace("<", "_").replace(">", "_").replace("|", "_").replace(":", "_").replace("/", "_").replace("\\", "_").replace("\"", "_");
    }

    public static java.lang.String correctURL(java.lang.String str) {
        java.lang.String trim = str.replace("\r", "").replace("\n", "").trim();
        java.lang.String str2 = new java.lang.String(trim);
        try {
            android.net.Uri parse = android.net.Uri.parse(trim);
            java.lang.String lastPathSegment = parse.getLastPathSegment();
            return (lastPathSegment == null || lastPathSegment.length() <= 0) ? str2 : str2.replace(lastPathSegment, java.net.URLEncoder.encode(parse.getLastPathSegment()).replace("+", "%20"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return str2;
        }
    }

    public static java.lang.String decodeFileName(java.lang.String str) {
        if (str != null) {
            return java.net.URLDecoder.decode(str);
        }
        return null;
    }

    public static java.lang.String genAPKFileName(java.lang.String str) {
        if (!str.contains(".apk")) {
            return null;
        }
        java.lang.String trim = str.trim().substring(str.lastIndexOf("/") + 1).trim();
        if (trim.contains("?")) {
            trim = trim.substring(0, trim.lastIndexOf("?"));
        }
        if (android.text.TextUtils.isEmpty(trim)) {
            return null;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "file name = " + trim);
        return renameAPKFileName(trim);
    }

    public static java.lang.String generateFileNameFromURL(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String calcMD5AsString = com.tencent.tmassistantsdk.util.GlobalUtil.calcMD5AsString(str);
        if (android.text.TextUtils.isEmpty(calcMD5AsString)) {
            calcMD5AsString = java.lang.Integer.toString(java.lang.Math.abs(str.hashCode()));
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            if (str2.equals("application/vnd.android.package-archive")) {
                str3 = ".apk";
            } else if (str2.equals("application/tm.android.apkdiff")) {
                str3 = ".diff";
            } else if (str2.equals("resource/tm.android.unknown")) {
                str3 = ".other";
            }
            return calcMD5AsString + str3;
        }
        str3 = "";
        return calcMD5AsString + str3;
    }

    public static synchronized java.lang.String getNetStatus() {
        synchronized (com.tencent.tmassistantsdk.downloadservice.DownloadHelper.class) {
            android.content.Context context = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext();
            if (context == null) {
                return "";
            }
            try {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return "";
                }
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return "";
                }
                if (activeNetworkInfo.getType() == 1) {
                    return "wifi";
                }
                java.lang.String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null) {
                    return "";
                }
                java.lang.String lowerCase = extraInfo.toLowerCase();
                com.tencent.tmassistantsdk.util.TMLog.v(TAG, "netInfo  =  " + lowerCase);
                return lowerCase;
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
    }

    public static int getStorePosition(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str == null || !str.startsWith("/data")) {
            return com.tencent.tmassistantsdk.storage.TMAssistantFile.isSDCardExistAndCanWrite() ? 2 : 0;
        }
        return 1;
    }

    public static android.os.PowerManager.WakeLock getWakeLock() {
        return null;
    }

    public static boolean isDownloadFileExisted(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(com.tencent.tmassistantsdk.storage.TMAssistantFile.getSaveFilePath(generateFileNameFromURL(str, str2)));
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                return m17.f213266a.F(m17.f213267b);
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean isNetworkConncted() {
        if (com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext() == null) {
            com.tencent.tmassistantsdk.util.TMLog.w(TAG, "GlobalUtil.getInstance().getContext() == null.");
            return false;
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    public static boolean isSpaceEnough(java.lang.String str, long j17) {
        int storePosition = getStorePosition(str);
        long j18 = 0;
        if (storePosition == 1) {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            long blockSize = statFs.getBlockSize() * (statFs.getAvailableBlocks() - 4);
            if (blockSize >= 0) {
                j18 = blockSize;
            }
        } else if (storePosition != 2) {
            j18 = -1;
        } else if ("mounted".equals(android.os.Environment.getExternalStorageState())) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            android.os.StatFs statFs2 = new android.os.StatFs(a17.toString());
            long blockSize2 = statFs2.getBlockSize() * (statFs2.getAvailableBlocks() - 4);
            if (blockSize2 >= 0) {
                j18 = blockSize2;
            }
        }
        long j19 = ((float) j17) * 1.5f;
        return j19 > SAVE_LENGTH ? j18 >= j19 : j18 >= SAVE_LENGTH;
    }

    public static boolean isValidURL(java.lang.String str) {
        try {
            new java.net.URI(correctURL(str));
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    public static java.lang.String renameAPKFileName(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.vfs.z2 m17;
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf <= 0 || lastIndexOf == str.length() - 1) {
            return str;
        }
        java.lang.String[] strArr = {str.substring(0, lastIndexOf), str.substring(lastIndexOf, str.length())};
        int i17 = 0;
        do {
            if (i17 == 0) {
                str2 = str;
            } else {
                str2 = strArr[0] + "(" + i17 + ")" + strArr[1];
            }
            i17++;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(com.tencent.tmassistantsdk.storage.TMAssistantFile.getSavePathRootDir() + "/" + str2);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        } while (!m17.a() ? false : m17.f213266a.F(m17.f213267b));
        return str2;
    }

    public static boolean isDownloadFileExisted(java.lang.String str) {
        if (str == null) {
            return false;
        }
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(com.tencent.tmassistantsdk.storage.TMAssistantFile.getSaveFilePath(str));
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                return m17.f213266a.F(m17.f213267b);
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
