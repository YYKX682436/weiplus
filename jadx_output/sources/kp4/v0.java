package kp4;

/* loaded from: classes10.dex */
public final class v0 extends androidx.recyclerview.widget.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView f311152d;

    public v0(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView) {
        this.f311152d = trackCropView;
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        int action = e17.getAction();
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView = this.f311152d;
        if (action == 0) {
            kp4.t0 callback = trackCropView.getCallback();
            if (callback == null) {
                return false;
            }
            callback.pause();
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = trackCropView.f176055e;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        if (recyclerView.getScrollState() != 0) {
            trackCropView.getClass();
            return false;
        }
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.a(trackCropView);
        com.tencent.mars.xlog.Log.i(trackCropView.f176054d, "onInterceptTouchEvent crop: " + trackCropView.f176063p + ", " + trackCropView.f176064q);
        kp4.t0 callback2 = trackCropView.getCallback();
        if (callback2 != null) {
            callback2.b(trackCropView.f176063p, trackCropView.f176064q);
        }
        trackCropView.getClass();
        return false;
    }
}
