package rf4;

/* loaded from: classes4.dex */
public final class p0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf4.a f395093b;

    public p0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView, gf4.a aVar) {
        this.f395092a = storyCommentView;
        this.f395093b = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.plugin.story.ui.view.StoryCommentView.a(this.f395092a, this.f395093b);
        }
    }
}
