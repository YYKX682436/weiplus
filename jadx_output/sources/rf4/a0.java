package rf4;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f395018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView, android.content.Context context) {
        super(2);
        this.f395017d = storyCommentInputView;
        this.f395018e = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gf4.a comment = (gf4.a) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(comment, "comment");
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395017d;
        yz5.p commentReplyCallback = storyCommentInputView.getCommentReplyCallback();
        if (commentReplyCallback != null) {
            commentReplyCallback.invoke(comment, java.lang.Boolean.valueOf(booleanValue));
        }
        if (booleanValue) {
            storyCommentInputView.setKeyboardVisibility(true);
            android.view.View view = storyCommentInputView.f171945r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$2", "invoke", "(Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$2", "invoke", "(Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            storyCommentInputView.f171938h.setImageDrawable(com.tencent.mm.ui.uk.e(this.f395018e, com.tencent.mm.R.raw.icons_filled_sticker, -1));
        }
        return jz5.f0.f302826a;
    }
}
