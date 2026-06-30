package cw1;

/* loaded from: classes11.dex */
public final class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI f223172d;

    public m7(com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI) {
        this.f223172d = storageDisableAlertUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI = this.f223172d;
        int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI.f95799h;
        storageDisableAlertUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "computeAndShowDialog");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(cw1.l7.f223123d);
            ((ku5.t0) ku5.t0.f312615d).q(futureTask);
            try {
                java.lang.Object obj = futureTask.get(5L, java.util.concurrent.TimeUnit.SECONDS);
                kotlin.jvm.internal.o.d(obj);
                j17 = ((java.lang.Number) obj).longValue();
            } catch (java.util.concurrent.TimeoutException unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "getWechatTotalSize timeout, read from mmkv");
                j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("extreme_storage_wechat_total_webview", -1L);
            }
        } else {
            j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("extreme_storage_wechat_total_webview", -1L);
        }
        if (j17 != -1) {
            fp.r0 r0Var = fp.r0.f265232a;
            double totalBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getTotalBytes();
            if (totalBytes > 0.0d) {
                storageDisableAlertUI.f95800d = (j17 / totalBytes) * 100;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "wechatTotalSize = " + j17 + ", wechatRatio = " + storageDisableAlertUI.f95800d);
        storageDisableAlertUI.runOnUiThread(new cw1.k7(storageDisableAlertUI));
    }
}
