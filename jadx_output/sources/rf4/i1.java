package rf4;

/* loaded from: classes5.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgInputView f395071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f395072e;

    public i1(com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView, android.content.Context context) {
        this.f395071d = storyMsgInputView;
        this.f395072e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView = this.f395071d;
        if (!storyMsgInputView.f171993q) {
            storyMsgInputView.setInputType(2);
            storyMsgInputView.setKeyboardVisibility(true);
            storyMsgInputView.f171987h.setImageDrawable(com.tencent.mm.ui.uk.e(this.f395072e, com.tencent.mm.R.raw.icons_filled_sticker, -1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
