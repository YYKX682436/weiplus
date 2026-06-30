package sm3;

/* loaded from: classes10.dex */
public final class s extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView f409905d;

    public s(com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView) {
        this.f409905d = mvTracksEditView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "onScrollStateChanged: newState=" + i17);
        if (i17 == 0) {
            int i18 = com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView.F;
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = this.f409905d;
            boolean z17 = true;
            if (!mvTracksEditView.f152023s) {
                if (!(mvTracksEditView.getDraggingIndex() != -1)) {
                    if (!(mvTracksEditView.getSelectedIndex() != -1)) {
                        z17 = false;
                    }
                }
            }
            if (!z17) {
                mvTracksEditView.setVideoProgress(mvTracksEditView.B);
                mvTracksEditView.getVideoProgress();
                sm3.u callback = mvTracksEditView.getCallback();
                if (callback != null) {
                    long videoProgress = mvTracksEditView.getVideoProgress();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onSeek: " + videoProgress);
                    ((mm3.h) callback).f329639g.T6(videoProgress);
                    kl3.t.g().a().c((int) videoProgress);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i19 = com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView.F;
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = this.f409905d;
        mvTracksEditView.a();
        mvTracksEditView.f152025u.f409857m = mvTracksEditView.B;
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
