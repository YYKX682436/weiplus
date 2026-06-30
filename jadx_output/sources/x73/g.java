package x73;

/* loaded from: classes11.dex */
public class g implements x73.h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f452447a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.ServiceConnection f452448b;

    public g(android.content.Context context) {
        this.f452447a = context;
    }

    public int a(java.lang.String str, oq1.n nVar, boolean z17) {
        android.content.Context context = this.f452447a;
        if (com.tencent.mm.sdk.platformtools.a0.c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMdiffPatchListener", "[-] In GP version, skip onPachReceived logic.");
            return 0;
        }
        try {
            this.f452448b = new x73.f(this);
            context.bindService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchForeService.class), this.f452448b, 1);
        } catch (java.lang.Throwable unused) {
        }
        if (z17) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService.f142401d;
            com.tencent.mars.xlog.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "preLoadPatchProcess...");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService.class);
            intent.putExtra("is_preload_patch_process", true);
            try {
                context.startService(intent);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "run patch service fail, exception:" + th6);
            }
        } else {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService.f142401d;
            com.tencent.mars.xlog.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "run patch service...");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ak0.n.f5541a;
            ak0.o.b();
            com.tencent.tinker.lib.service.TinkerPatchService.a(ak0.o.a());
            android.os.Bundle bundle = new android.os.Bundle();
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService.class);
            bundle.putString("patch_path_extra", str);
            bundle.putParcelable("patch_syncresponse_extra", (com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar);
            intent2.putExtra("result_bundle_extra", bundle);
            try {
                context.startService(intent2);
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "run patch service fail, exception:" + th7);
            }
        }
        return 0;
    }
}
