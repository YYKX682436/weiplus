package kp4;

/* loaded from: classes10.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView f311108d;

    public g0(com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView) {
        this.f311108d = multiTrackCropView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = this.f311108d;
        java.util.Objects.toString(multiTrackCropView.f176033q);
        multiTrackCropView.dispatchTouchEvent(multiTrackCropView.f176033q);
    }
}
