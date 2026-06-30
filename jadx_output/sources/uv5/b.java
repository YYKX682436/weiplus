package uv5;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f431470a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f431471b;

    public b(java.lang.String str, java.lang.String str2) {
        this.f431470a = str;
        this.f431471b = str2;
    }

    public static uv5.b a(java.io.File file) {
        java.lang.String str;
        java.io.InputStream inputStream;
        java.util.Properties properties = new java.util.Properties();
        java.lang.String str2 = null;
        try {
            try {
                inputStream = new java.io.FileInputStream(file);
                try {
                    properties.load(inputStream);
                    str = properties.getProperty("md5");
                } catch (java.io.IOException e17) {
                    e = e17;
                    str = null;
                }
                try {
                    str2 = properties.getProperty("times");
                } catch (java.io.IOException e18) {
                    e = e18;
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.UpgradePatchRetry", "fail to readRetryProperty:" + e, new java.lang.Object[0]);
                    lv5.a.a(inputStream);
                    return new uv5.b(str, str2);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                str2 = inputStream;
                lv5.a.a(str2);
                throw th;
            }
        } catch (java.io.IOException e19) {
            e = e19;
            str = null;
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            lv5.a.a(str2);
            throw th;
        }
        lv5.a.a(inputStream);
        return new uv5.b(str, str2);
    }

    public static void b(java.io.File file, uv5.b bVar) {
        java.io.FileOutputStream fileOutputStream;
        if (bVar == null) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        java.util.Properties properties = new java.util.Properties();
        properties.put("md5", bVar.f431470a);
        properties.put("times", bVar.f431471b);
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file, false);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            properties.store(fileOutputStream, (java.lang.String) null);
            lv5.a.a(fileOutputStream);
        } catch (java.lang.Exception e18) {
            e = e18;
            fileOutputStream2 = fileOutputStream;
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace("Tinker.UpgradePatchRetry", e, "retry write property fail", new java.lang.Object[0]);
            lv5.a.a(fileOutputStream2);
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream2 = fileOutputStream;
            lv5.a.a(fileOutputStream2);
            throw th;
        }
    }
}
