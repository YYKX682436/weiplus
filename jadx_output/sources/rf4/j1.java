package rf4;

/* loaded from: classes5.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgInputView f395075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f395076e;

    public j1(com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView, android.content.Context context) {
        this.f395075d = storyMsgInputView;
        this.f395076e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView = this.f395075d;
        int inputType = storyMsgInputView.getInputType();
        android.content.Context context = this.f395076e;
        if (inputType == 0) {
            storyMsgInputView.setInputType(2);
            storyMsgInputView.setKeyboardVisibility(true);
            storyMsgInputView.f171987h.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_sticker, -1));
        } else {
            if (storyMsgInputView.f171993q) {
                storyMsgInputView.setInputType(0);
                storyMsgInputView.setKeyboardVisibility(false);
            } else {
                storyMsgInputView.setInputType(0);
                storyMsgInputView.f171985f.setVisibility(0);
            }
            storyMsgInputView.f171987h.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_keyboard_night, -1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
