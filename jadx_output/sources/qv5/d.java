package qv5;

/* loaded from: classes13.dex */
public final class d implements com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f367043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f367044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f367045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable[] f367046d;

    public d(boolean[] zArr, java.util.List list, java.lang.Throwable[] thArr) {
        this.f367044b = zArr;
        this.f367045c = list;
        this.f367046d = thArr;
    }

    @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
    public void onFailed(java.io.File file, java.io.File file2, java.lang.Throwable th6) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DexDiffPatchInternal", "fail to parallel optimize dex %s use time %d", file.getPath(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f367043a));
        this.f367045c.add(file);
        this.f367046d[0] = th6;
    }

    @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
    public void onStart(java.io.File file, java.io.File file2) {
        this.f367043a = java.lang.System.currentTimeMillis();
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DexDiffPatchInternal", "start to parallel optimize dex %s, size: %d", file.getPath(), java.lang.Long.valueOf(file.length()));
    }

    @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
    public void onSuccess(java.io.File file, java.io.File file2, java.io.File file3) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DexDiffPatchInternal", "success to parallel optimize dex %s, opt file:%s, opt file size: %d, use time %d", file.getPath(), file3.getPath(), java.lang.Long.valueOf(file3.length()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f367043a));
        if (file3.exists()) {
            return;
        }
        synchronized (this.f367044b) {
            this.f367044b[0] = true;
        }
    }
}
