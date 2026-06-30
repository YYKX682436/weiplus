package rf4;

/* loaded from: classes5.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f395035e;

    public d0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView, android.content.Context context) {
        this.f395034d = storyCommentInputView;
        this.f395035e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395034d;
        int i17 = storyCommentInputView.f171947t;
        android.content.Context context = this.f395035e;
        if (i17 == 0) {
            storyCommentInputView.f171947t = 2;
            storyCommentInputView.setKeyboardVisibility(true);
            storyCommentInputView.f171938h.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_sticker, -1));
        } else {
            if (storyCommentInputView.f171948u) {
                storyCommentInputView.f171947t = 0;
                storyCommentInputView.setKeyboardVisibility(false);
            } else {
                storyCommentInputView.f171947t = 0;
                storyCommentInputView.f171936f.setVisibility(0);
            }
            storyCommentInputView.f171938h.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_keyboard_night, -1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
