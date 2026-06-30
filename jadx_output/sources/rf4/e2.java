package rf4;

/* loaded from: classes4.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        super(0);
        this.f395045d = storyMsgView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395045d;
        if (storyMsgView.getCommentInputView().getInputType() != -1) {
            storyMsgView.getCommentInputView().b();
        } else {
            storyMsgView.a();
        }
        return jz5.f0.f302826a;
    }
}
