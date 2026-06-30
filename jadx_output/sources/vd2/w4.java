package vd2;

/* loaded from: classes3.dex */
public final class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435979d;

    public w4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback) {
        this.f435979d = finderLiveViewCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435979d;
        androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
            finderLiveViewCallback.z(1, 600);
        }
    }
}
