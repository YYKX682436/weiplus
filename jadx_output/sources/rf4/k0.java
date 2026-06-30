package rf4;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        super(1);
        this.f395078d = storyCommentView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395078d;
        if (storyCommentView.f171969u == 3) {
            storyCommentView.f(2);
        } else {
            yz5.a outsideClickListener = storyCommentView.getOutsideClickListener();
            if (outsideClickListener != null) {
            }
        }
        return jz5.f0.f302826a;
    }
}
