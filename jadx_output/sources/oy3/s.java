package oy3;

/* loaded from: classes13.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f350043e;

    public s(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI, int i17) {
        this.f350042d = rtosWatchLoginUI;
        this.f350043e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = this.f350042d.f158596n;
        if (mMProgressLoading == null) {
            return;
        }
        mMProgressLoading.setProgress(this.f350043e);
    }
}
