package rf4;

/* loaded from: classes4.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        super(1);
        this.f395109d = storyMsgView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395109d;
        if (storyMsgView.f172014i.getVisibility() == 0) {
            storyMsgView.f172011f.setCurrentItem(intValue);
        } else {
            storyMsgView.b(intValue, false);
        }
        return jz5.f0.f302826a;
    }
}
