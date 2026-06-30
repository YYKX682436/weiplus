package z46;

/* loaded from: classes12.dex */
public class h implements z46.a {
    public final z46.g a(android.content.Context context, java.lang.String[] strArr, java.lang.String str, z46.f fVar) {
        java.lang.String[] strArr2;
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String[] strArr3 = applicationInfo.splitSourceDirs;
        int i17 = 0;
        int i18 = 1;
        if (strArr3 == null || strArr3.length == 0) {
            strArr2 = new java.lang.String[]{applicationInfo.sourceDir};
        } else {
            strArr2 = new java.lang.String[strArr3.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            java.lang.System.arraycopy(strArr3, 0, strArr2, 1, strArr3.length);
        }
        int length = strArr2.length;
        java.util.zip.ZipFile zipFile = null;
        int i19 = 0;
        while (i19 < length) {
            java.lang.String str2 = strArr2[i19];
            int i27 = i17;
            while (true) {
                int i28 = i27 + 1;
                if (i27 >= 5) {
                    break;
                }
                try {
                    zipFile = new java.util.zip.ZipFile(new java.io.File(str2), i18);
                    break;
                } catch (java.io.IOException unused) {
                    i27 = i28;
                }
            }
            if (zipFile != null) {
                int i29 = i17;
                while (true) {
                    int i37 = i29 + 1;
                    if (i29 < 5) {
                        int length2 = strArr.length;
                        int i38 = i17;
                        while (i38 < length2) {
                            java.lang.String str3 = strArr[i38];
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH);
                            char c17 = java.io.File.separatorChar;
                            sb6.append(c17);
                            sb6.append(str3);
                            sb6.append(c17);
                            sb6.append(str);
                            java.lang.String sb7 = sb6.toString();
                            fVar.d("Looking for %s in APK %s...", sb7, str2);
                            java.util.zip.ZipEntry entry = zipFile.getEntry(sb7);
                            if (entry != null) {
                                return new z46.g(zipFile, entry);
                            }
                            i38++;
                            i17 = 0;
                        }
                        i29 = i37;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
            i19++;
            i17 = 0;
            i18 = 1;
        }
        return null;
    }

    public final void b(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
