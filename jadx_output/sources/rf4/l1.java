package rf4;

/* loaded from: classes5.dex */
public final class l1 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgInputView f395082a;

    public l1(com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView) {
        this.f395082a = storyMsgInputView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        this.f395082a.f171986g.n(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView = this.f395082a;
        android.view.inputmethod.InputConnection inputConnection = storyMsgInputView.f171986g.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        android.view.inputmethod.InputConnection inputConnection2 = storyMsgInputView.f171986g.getInputConnection();
        if (inputConnection2 != null) {
            inputConnection2.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView = this.f395082a;
        if (storyMsgInputView.f171995s) {
            mf4.d.f326160a.a(9);
            android.text.Editable text = storyMsgInputView.f171986g.getText();
            if (text != null) {
                storyMsgInputView.c();
                storyMsgInputView.f171986g.setText((java.lang.CharSequence) null);
                storyMsgInputView.f171985f.setVisibility(8);
                yz5.p commentInputCallback = storyMsgInputView.getCommentInputCallback();
                if (commentInputCallback != null) {
                    commentInputCallback.invoke(text.toString(), java.lang.Boolean.TRUE);
                }
            }
        }
    }
}
