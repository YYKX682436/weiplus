package rf4;

/* loaded from: classes4.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        super(0);
        this.f395125d = storyMsgView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395125d;
        if (storyMsgView.f172014i.getTranslationY() < storyMsgView.f172010e) {
            if (storyMsgView.f172014i.getTranslationY() > r1.getMeasuredHeight() / 10) {
                storyMsgView.a();
            } else {
                storyMsgView.b(storyMsgView.getCurPosition(), true);
            }
        }
        return jz5.f0.f302826a;
    }
}
