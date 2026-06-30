package l22;

/* loaded from: classes15.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView f315205d;

    public a(com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView previewRelativeEmotionRecyclerView) {
        this.f315205d = previewRelativeEmotionRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView previewRelativeEmotionRecyclerView = this.f315205d;
        if (previewRelativeEmotionRecyclerView.f98516d2) {
            return;
        }
        previewRelativeEmotionRecyclerView.getAdapter();
    }
}
