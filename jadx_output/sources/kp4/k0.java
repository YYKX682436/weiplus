package kp4;

/* loaded from: classes10.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView f311120d;

    public k0(com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView) {
        this.f311120d = multiTrackCropView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = this.f311120d;
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f176023d;
        if (multiTrackRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView.scrollBy(multiTrackCropView.f176029m, 0);
        multiTrackCropView.f176034r = false;
    }
}
