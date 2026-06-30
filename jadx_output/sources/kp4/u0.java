package kp4;

/* loaded from: classes10.dex */
public final class u0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f311147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView f311148e;

    public u0(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView) {
        this.f311148e = trackCropView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView = this.f311148e;
        com.tencent.mars.xlog.Log.i(trackCropView.f176054d, "onScrollStateChanged: " + i17);
        if (i17 == 0) {
            com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.a(trackCropView);
            com.tencent.mars.xlog.Log.i(trackCropView.f176054d, "onScrollStateChanged: " + trackCropView.f176063p + ", " + trackCropView.f176064q);
            kp4.t0 callback = trackCropView.getCallback();
            if (callback != null) {
                callback.b(trackCropView.f176063p, trackCropView.f176064q);
            }
            trackCropView.getClass();
            this.f311147d = false;
        } else if (i17 == 1) {
            if (!this.f311147d) {
                trackCropView.setDragCnt(trackCropView.getDragCnt() + 1);
            }
            this.f311147d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView = this.f311148e;
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.a(trackCropView);
        com.tencent.mars.xlog.Log.i(trackCropView.f176054d, "onScroll: range: " + trackCropView.f176063p + ", " + trackCropView.f176064q);
        kp4.t0 callback = trackCropView.getCallback();
        if (callback != null) {
            callback.seekTo(trackCropView.f176063p);
        }
        trackCropView.setProgress(trackCropView.f176063p);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
