package rf4;

/* loaded from: classes5.dex */
public final class e0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395043d;

    public e0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView) {
        this.f395043d = storyCommentInputView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17 || keyEvent.getAction() == 66) {
            com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395043d;
            if (storyCommentInputView.f171950w) {
                mf4.d.f326160a.a(9);
                android.text.Editable text = storyCommentInputView.f171937g.getText();
                if (text != null) {
                    com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.a(storyCommentInputView);
                    storyCommentInputView.f171937g.setText((java.lang.CharSequence) null);
                    android.view.View view = storyCommentInputView.f171945r;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$6", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$6", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yz5.p commentInputCallback = storyCommentInputView.getCommentInputCallback();
                    if (commentInputCallback != null) {
                        commentInputCallback.invoke(text.toString(), java.lang.Boolean.TRUE);
                    }
                }
            }
        }
        return false;
    }
}
