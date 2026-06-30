package rf4;

/* loaded from: classes5.dex */
public final class b0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395023d;

    public b0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView) {
        this.f395023d = storyCommentInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395023d;
        if (editable == null) {
            storyCommentInputView.f171950w = false;
            storyCommentInputView.f171940m.setVisibility(8);
            return;
        }
        int length = editable.length();
        int i17 = 60 - length;
        storyCommentInputView.f171950w = (editable.length() > 0) && i17 >= 0 && storyCommentInputView.f171937g.getLineCount() <= 10;
        if (length < 55) {
            storyCommentInputView.f171940m.setVisibility(8);
            return;
        }
        storyCommentInputView.f171940m.setVisibility(0);
        storyCommentInputView.f171940m.setText(java.lang.String.valueOf(i17));
        if (i17 >= 0) {
            storyCommentInputView.f171940m.setTextColor(storyCommentInputView.f171951x);
        } else {
            storyCommentInputView.f171940m.setTextColor(storyCommentInputView.f171952y);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
