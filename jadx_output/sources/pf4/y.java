package pf4;

/* loaded from: classes4.dex */
public final class y extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView f353910d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.StoryCommentView f353911e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.StoryMsgView f353912f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f353913g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip f353914h;

    /* renamed from: i, reason: collision with root package name */
    public if4.f f353915i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f353910d = itemView;
        this.f353911e = itemView.getCommentView();
        this.f353912f = itemView.getMsgView();
        this.f353913g = itemView.getThumbView();
        this.f353914h = itemView.getPostTipView();
    }

    public final void i() {
        if4.f fVar = this.f353915i;
        if (fVar == null) {
            return;
        }
        com.tencent.mm.storage.s7 s7Var = new com.tencent.mm.storage.s7("storysight");
        if4.h hVar = fVar.f291247e;
        s7Var.f195313b = hVar.f291255c;
        boolean a17 = hVar.a();
        android.widget.ImageView imageView = this.f353913g;
        if (a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryAdapter", "reBindBitmap FakeVideo");
            ((wo0.b) vo0.e.f438468b.i("")).c(imageView);
            return;
        }
        hf4.e eVar = new hf4.e(hVar.f291258f, fVar.f291249g, s7Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryAdapter", "reBindBitmap NormalVideo " + eVar.n());
        ef4.w.f252468t.m().a(eVar).c(imageView);
    }
}
