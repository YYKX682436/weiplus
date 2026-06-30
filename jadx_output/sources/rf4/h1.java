package rf4;

/* loaded from: classes5.dex */
public final class h1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgInputView f395059d;

    public h1(com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView) {
        this.f395059d = storyMsgInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView = this.f395059d;
        if (editable == null) {
            storyMsgInputView.f171995s = false;
            storyMsgInputView.f171988i.setVisibility(8);
            return;
        }
        int length = editable.length();
        int i17 = 60 - length;
        storyMsgInputView.f171995s = (editable.length() > 0) && i17 >= 0 && storyMsgInputView.f171986g.getLineCount() <= 10;
        if (length < 55) {
            storyMsgInputView.f171988i.setVisibility(8);
            return;
        }
        storyMsgInputView.f171988i.setVisibility(0);
        storyMsgInputView.f171988i.setText(java.lang.String.valueOf(i17));
        if (i17 >= 0) {
            storyMsgInputView.f171988i.setTextColor(storyMsgInputView.f171996t);
        } else {
            storyMsgInputView.f171988i.setTextColor(storyMsgInputView.f171997u);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
