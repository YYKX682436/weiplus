package uv5;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static uv5.c f431472d;

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f431473a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f431474b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f431475c;

    public c(android.content.Context context) {
        this.f431473a = null;
        this.f431474b = null;
        this.f431475c = null;
        this.f431475c = context;
        this.f431473a = new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchTempDirectory(context), "patch.retry");
        this.f431474b = new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchTempDirectory(context), "temp.apk");
    }

    public static uv5.c b(android.content.Context context) {
        if (f431472d == null) {
            f431472d = new uv5.c(context);
        }
        return f431472d;
    }

    public final void a(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        java.io.File file2 = this.f431474b;
        if (absolutePath.equals(file2.getAbsolutePath())) {
            return;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "try copy file: %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
        try {
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.copyFileUsingStream(file, file2);
        } catch (java.io.IOException unused) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.UpgradePatchRetry", "fail to copy file: %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
        }
    }

    public boolean c(java.lang.String str) {
        int parseInt;
        java.io.File file = this.f431473a;
        if (!file.exists()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck retry file is not exist, just return", new java.lang.Object[0]);
            return true;
        }
        if (str == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck md5 is null, just return", new java.lang.Object[0]);
            return true;
        }
        uv5.b a17 = uv5.b.a(file);
        if (!str.equals(a17.f431470a) || (parseInt = java.lang.Integer.parseInt(a17.f431471b)) < 20) {
            return true;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck, retry count %d must exceed than max retry count", java.lang.Integer.valueOf(parseInt));
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(this.f431474b);
        return false;
    }

    public boolean d(java.lang.String str) {
        java.io.File file = this.f431473a;
        if (!file.exists()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck retry file is not exist, just return", new java.lang.Object[0]);
            return true;
        }
        if (str == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck md5 is null, just return", new java.lang.Object[0]);
            return true;
        }
        uv5.b a17 = uv5.b.a(file);
        if (str.equals(a17.f431470a)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck, reset max check to 1", new java.lang.Object[0]);
            a17.f431471b = "1";
            uv5.b.b(file, a17);
        }
        return true;
    }
}
