package com.tencent.youtu.ytcommon.tools;

/* loaded from: classes12.dex */
public class YTFileUtils {
    private YTFileUtils() {
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
        } catch (java.lang.Exception unused) {
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
        } catch (java.io.IOException unused) {
        }
    }

    public static android.graphics.Bitmap drawableToBitmap(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        android.graphics.Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888) : android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static java.lang.String getLastPathComponent(java.lang.String str) {
        java.lang.String[] split = str.split("/");
        return split.length == 0 ? "" : split[split.length - 1];
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
                                throw new java.lang.RuntimeException("IOException occurred. ", e17);
                            }
                        }
                        if (!sb6.toString().equals("")) {
                            sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
                        }
                        sb6.append(readLine);
                    } catch (java.io.IOException e18) {
                        e = e18;
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
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
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
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

    public static boolean zipFileAtPath(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        try {
            java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(str2)));
            if (!file.isDirectory()) {
                byte[] bArr = new byte[2048];
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(str), 2048);
                zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(getLastPathComponent(str)));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } else {
                zipSubFolder(zipOutputStream, file, file.getParent().length());
            }
            zipOutputStream.close();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static void zipSubFolder(java.util.zip.ZipOutputStream zipOutputStream, java.io.File file, int i17) {
        for (java.io.File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                zipSubFolder(zipOutputStream, file2, i17);
            } else {
                byte[] bArr = new byte[2048];
                java.lang.String path = file2.getPath();
                java.lang.String substring = path.substring(i17);
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(path), 2048);
                zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(substring));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, read);
                    }
                }
                bufferedInputStream.close();
            }
        }
    }
}
