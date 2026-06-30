package rf4;

/* loaded from: classes5.dex */
public final class k1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgInputView f395079d;

    public k1(com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView) {
        this.f395079d = storyMsgInputView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 && keyEvent.getAction() != 66) {
            return true;
        }
        com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView = this.f395079d;
        if (!storyMsgInputView.f171995s) {
            return true;
        }
        mf4.d.f326160a.a(9);
        android.text.Editable text = storyMsgInputView.f171986g.getText();
        if (text == null) {
            return true;
        }
        storyMsgInputView.c();
        storyMsgInputView.f171986g.setText((java.lang.CharSequence) null);
        yz5.p commentInputCallback = storyMsgInputView.getCommentInputCallback();
        if (commentInputCallback == null) {
            return true;
        }
        commentInputCallback.invoke(text.toString(), java.lang.Boolean.TRUE);
        return true;
    }
}
