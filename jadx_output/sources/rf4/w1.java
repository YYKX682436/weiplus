package rf4;

/* loaded from: classes4.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        super(1);
        this.f395121d = storyMsgView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395121d;
        storyMsgView.f172014i.setTranslationY(java.lang.Math.min(java.lang.Math.max(storyMsgView.f172014i.getTranslationY() - intValue, 0.0f), storyMsgView.f172010e));
        return jz5.f0.f302826a;
    }
}
