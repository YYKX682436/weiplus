package kp4;

/* loaded from: classes10.dex */
public final class d0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView f311098d;

    public d0(com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView) {
        this.f311098d = multiTrackCropView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTrackCropView", "onScrollStateChanged: " + i17);
        if (i17 == 0) {
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = this.f311098d;
            if (multiTrackCropView.f176038v) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTrackCropView", "onScrollStateChanged: SCROLL_STATE_IDLE");
                multiTrackCropView.f176038v = false;
                multiTrackCropView.f176037u = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = this.f311098d;
        multiTrackCropView.f176032p = multiTrackCropView.f176032p + i17;
        if (!multiTrackCropView.f176037u && !multiTrackCropView.f176034r && !multiTrackCropView.f176039w) {
            long j17 = multiTrackCropView.f176031o;
            long j18 = multiTrackCropView.f176030n;
            long j19 = (((j17 - j18) * (r9 - multiTrackCropView.f176029m)) / multiTrackCropView.f176028i) + j18;
            kp4.c0 callback = multiTrackCropView.getCallback();
            if (callback != null) {
                callback.seekTo(j19);
            }
        }
        if (!multiTrackCropView.f176039w) {
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView.a(multiTrackCropView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
