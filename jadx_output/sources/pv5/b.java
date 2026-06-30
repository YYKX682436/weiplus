package pv5;

/* loaded from: classes13.dex */
public class b implements pv5.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f358622a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.ServiceConnection f358623b;

    public b(android.content.Context context) {
        this.f358622a = context;
    }

    @Override // pv5.c
    public int a(java.lang.String str) {
        int b17 = b(str, com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5(new java.io.File(str)));
        android.content.Context context = this.f358622a;
        if (b17 == 0) {
            try {
                this.f358623b = new pv5.a(this);
                context.bindService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.tinker.lib.service.TinkerPatchForeService.class), this.f358623b, 1);
            } catch (java.lang.Throwable unused) {
            }
            qv5.a aVar = com.tencent.tinker.lib.service.TinkerPatchService.f215546d;
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.TinkerPatchService", "run patch service...", new java.lang.Object[0]);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.tinker.lib.service.TinkerPatchService.class);
            intent.putExtra("patch_path_extra", str);
            intent.putExtra("patch_use_emergency_mode", false);
            intent.putExtra("patch_result_class", com.tencent.tinker.lib.service.TinkerPatchService.f215547e.getName());
            try {
                context.startService(intent);
            } catch (java.lang.Throwable th6) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.TinkerPatchService", "run patch service fail, exception:" + th6, new java.lang.Object[0]);
            }
        } else {
            tv5.b.b(context).f422371d.h(new java.io.File(str), b17);
        }
        return b17;
    }

    public int b(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f358622a;
        tv5.b b17 = tv5.b.b(context);
        if (!com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnabled(b17.f422377j) || !com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnableWithSharedPreferences(context)) {
            return -1;
        }
        if (android.text.TextUtils.isEmpty(str2) || !com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(new java.io.File(str))) {
            return -2;
        }
        if (b17.f422376i) {
            return -4;
        }
        java.lang.String str3 = uv5.a.f431469a;
        if (com.tencent.tinker.lib.service.TinkerPatchService.a(context)) {
            return -3;
        }
        if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isVmJit()) {
            return -5;
        }
        tv5.d dVar = b17.f422378k;
        if (!(b17.f422375h && dVar != null && dVar.f422383d)) {
            java.lang.String absolutePath = b17.f422369b.getAbsolutePath();
            try {
                com.tencent.tinker.loader.shareutil.SharePatchInfo readAndCheckPropertyWithLock = com.tencent.tinker.loader.shareutil.SharePatchInfo.readAndCheckPropertyWithLock(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoFile(absolutePath), com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoLockFile(absolutePath));
                if (readAndCheckPropertyWithLock != null && !com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNullOrNil(readAndCheckPropertyWithLock.newVersion) && !readAndCheckPropertyWithLock.newVersion.equals(readAndCheckPropertyWithLock.versionToRemove)) {
                    if (str2.equals(readAndCheckPropertyWithLock.newVersion)) {
                        return -6;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return !uv5.c.b(context).c(str2) ? -7 : 0;
    }
}
