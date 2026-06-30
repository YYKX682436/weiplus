package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes12.dex */
public class FileUtils {
    private static final java.lang.String TAG = "FileUtils";
    private static java.util.Map<java.lang.String, java.lang.String> mLoadedLibrary = new java.util.HashMap();

    private FileUtils() {
        throw new java.lang.AssertionError();
    }

    public static boolean copyAsset(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        try {
            java.io.InputStream open = assetManager.open(str);
            new java.io.File(str2).createNewFile();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str2);
            copyFile(open, fileOutputStream);
            open.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "copyAsset fail:" + android.util.Log.getStackTraceString(e17));
            return false;
        }
    }

    public static void copyFile(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void copyFileOrDir(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String[] list = assetManager.list(str);
            if (list.length == 0) {
                copyAsset(assetManager, str, str2 + "/" + str);
                return;
            }
            java.lang.String str3 = java.io.File.separator;
            java.io.File file = new java.io.File(str2.endsWith(str3) ? str2 + str : str2 + str3 + str);
            if (!file.exists()) {
                file.mkdir();
            }
            for (java.lang.String str4 : list) {
                copyFileOrDir(assetManager, str + "/" + str4, str2);
            }
        } catch (java.io.IOException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "copyFileOrDir fail:" + android.util.Log.getStackTraceString(e17));
        }
    }

    public static java.io.File createFile(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(android.os.Environment.getExternalStorageDirectory());
        java.lang.String str3 = java.io.File.separator;
        sb6.append(str3);
        sb6.append(str2);
        sb6.append(str3);
        java.io.File file = new java.io.File(sb6.toString());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file.getPath() + str3 + str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "createFile fail:" + android.util.Log.getStackTraceString(e17));
            }
        }
        return file2;
    }

    public static void loadLibrary(java.lang.String str) {
        if (mLoadedLibrary.get(str) == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "[YTUtils.loadLibrary] " + java.lang.System.getProperty("java.library.path"));
            try {
                com.tencent.cso.CsoLoader.e(str);
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "loadLibrary fail: libName:" + str + ",exception:" + android.util.Log.getStackTraceString(e17));
            }
            mLoadedLibrary.put(str, "loaded");
        }
    }

    public static java.lang.StringBuilder readAssetFile(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.io.BufferedReader bufferedReader = null;
        try {
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(context.getResources().getAssets().open(str)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader2.close();
                                return sb6;
                            } catch (java.io.IOException e17) {
                                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "readAssetFile fail:" + android.util.Log.getStackTraceString(e17));
                                throw new java.lang.RuntimeException("IOException occurred. ", e17);
                            }
                        }
                        if (!sb6.toString().equals("")) {
                            sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
                        }
                        sb6.append(readLine);
                    } catch (java.io.IOException e18) {
                        e = e18;
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "readAssetFile fail:" + android.util.Log.getStackTraceString(e));
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
                                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "readAssetFile fail:" + android.util.Log.getStackTraceString(e19));
                                throw new java.lang.RuntimeException("IOException occurred. ", e19);
                            }
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.io.IOException e27) {
            e = e27;
        }
    }

    public static java.lang.StringBuilder readFile(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.io.BufferedReader bufferedReader = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader2.close();
                                return sb6;
                            } catch (java.io.IOException e17) {
                                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "readFile fail:" + android.util.Log.getStackTraceString(e17));
                                throw new java.lang.RuntimeException("IOException occurred. ", e17);
                            }
                        }
                        if (!sb6.toString().equals("")) {
                            sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
                        }
                        sb6.append(readLine);
                    } catch (java.io.IOException e18) {
                        e = e18;
                        bufferedReader = bufferedReader2;
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "readFile fail:" + android.util.Log.getStackTraceString(e));
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
                                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "readFile fail:" + android.util.Log.getStackTraceString(e19));
                                throw new java.lang.RuntimeException("IOException occurred. ", e19);
                            }
                        }
                        throw th;
                    }
                }
            } catch (java.io.IOException e27) {
                e = e27;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
