package rv5;

/* loaded from: classes13.dex */
public class b implements rv5.d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f400565b;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f400566a;

    public b(android.content.Context context) {
        this.f400566a = context;
    }

    @Override // rv5.d
    public void a(java.io.File file, java.io.File file2, java.lang.String str, int i17) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchTypeExtractFail: file extract fail type: %s, path: %s, extractTo: %s, filename: %s", com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(i17), file.getPath(), file2.getPath(), str);
        tv5.b.b(this.f400566a).a(file);
    }

    @Override // rv5.d
    public void b(java.io.File file, java.util.List list, java.lang.Throwable th6) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchDexOptFail: dex opt fail path: %s, dex size: %d", file.getAbsolutePath(), java.lang.Integer.valueOf(list.size()));
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace("Tinker.DefaultPatchReporter", th6, "onPatchDexOptFail:", new java.lang.Object[0]);
        if (!th6.getMessage().contains(com.tencent.tinker.loader.shareutil.ShareConstants.CHECK_DEX_OAT_EXIST_FAIL) && !th6.getMessage().contains(com.tencent.tinker.loader.shareutil.ShareConstants.CHECK_DEX_OAT_FORMAT_FAIL)) {
            tv5.b.b(this.f400566a).a(file);
            return;
        }
        f400565b = true;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile((java.io.File) it.next());
        }
    }

    @Override // rv5.d
    public void c(java.io.File file, int i17) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchPackageCheckFail: package check failed. path: %s, code: %d", file.getAbsolutePath(), java.lang.Integer.valueOf(i17));
        if (i17 == -3 || i17 == -4 || i17 == -8) {
            tv5.b.b(this.f400566a).a(file);
        }
    }

    @Override // rv5.d
    public void d(java.io.File file, java.lang.String str, java.lang.String str2) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchInfoCorrupted: patch info is corrupted. old: %s, new: %s", str, str2);
        com.tencent.tinker.loader.shareutil.ShareTinkerInternals.cleanPatch(tv5.b.b(this.f400566a).f422368a);
    }

    @Override // rv5.d
    public void e(java.io.File file, java.lang.Throwable th6) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchException: patch exception path: %s, throwable: %s", file.getAbsolutePath(), th6.getMessage());
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.DefaultPatchReporter", "tinker patch exception, welcome to submit issue to us: https://github.com/Tencent/tinker/issues", new java.lang.Object[0]);
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace("Tinker.DefaultPatchReporter", th6, "tinker patch exception", new java.lang.Object[0]);
        android.content.Context context = this.f400566a;
        tv5.b.b(context).f422377j = 0;
        tv5.b.b(context).a(file);
    }

    @Override // rv5.d
    public void f(java.io.File file, boolean z17, long j17) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchResult: patch all result path: %s, success: %b, cost: %d", file.getAbsolutePath(), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        if (f400565b) {
            return;
        }
        java.io.File file2 = uv5.c.b(this.f400566a).f431474b;
        if (file2.exists()) {
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(file2);
        }
    }

    @Override // rv5.d
    public void g(android.content.Intent intent) {
        uv5.b bVar;
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchServiceStart: patch service start", new java.lang.Object[0]);
        f400565b = false;
        uv5.c b17 = uv5.c.b(this.f400566a);
        b17.getClass();
        if (intent == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.UpgradePatchRetry", "onPatchServiceStart intent is null, just return", new java.lang.Object[0]);
            return;
        }
        qv5.a aVar = com.tencent.tinker.lib.service.TinkerPatchService.f215546d;
        java.lang.String stringExtra = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(intent, "patch_path_extra");
        if (stringExtra == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch path is null, just return", new java.lang.Object[0]);
            return;
        }
        java.io.File file = new java.io.File(stringExtra);
        java.lang.String md52 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5(file);
        if (md52 == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch md5 is null, just return", new java.lang.Object[0]);
            return;
        }
        java.io.File file2 = b17.f431473a;
        if (file2.exists()) {
            bVar = uv5.b.a(file2);
            java.lang.String str = bVar.f431470a;
            if (str == null || bVar.f431471b == null || !md52.equals(str)) {
                b17.a(file);
                bVar.f431470a = md52;
                bVar.f431471b = "1";
            } else {
                int parseInt = java.lang.Integer.parseInt(bVar.f431471b);
                if (parseInt >= 20) {
                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(b17.f431474b);
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchServiceStart retry more than max count, delete retry info file!", new java.lang.Object[0]);
                    return;
                }
                bVar.f431471b = java.lang.String.valueOf(parseInt + 1);
            }
        } else {
            b17.a(file);
            bVar = new uv5.b(md52, "1");
        }
        uv5.b.b(file2, bVar);
    }

    @Override // rv5.d
    public void h(java.io.File file, com.tencent.tinker.loader.shareutil.SharePatchInfo sharePatchInfo, java.lang.String str) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultPatchReporter", "patchReporter onPatchVersionCheckFail: patch version exist. path: %s, version: %s", file.getAbsolutePath(), str);
    }
}
