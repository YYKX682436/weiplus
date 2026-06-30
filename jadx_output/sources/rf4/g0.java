package rf4;

/* loaded from: classes5.dex */
public final class g0 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395052a;

    public g0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView) {
        this.f395052a = storyCommentInputView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        this.f395052a.f171937g.n(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395052a;
        android.view.inputmethod.InputConnection inputConnection = storyCommentInputView.f171937g.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        android.view.inputmethod.InputConnection inputConnection2 = storyCommentInputView.f171937g.getInputConnection();
        if (inputConnection2 != null) {
            inputConnection2.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395052a;
        if (storyCommentInputView.f171950w) {
            mf4.d.f326160a.a(9);
            android.text.Editable text = storyCommentInputView.f171937g.getText();
            if (text != null) {
                com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.a(storyCommentInputView);
                storyCommentInputView.f171937g.setText((java.lang.CharSequence) null);
                storyCommentInputView.f171936f.setVisibility(8);
                android.view.View view = storyCommentInputView.f171945r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$initSmileyPanel$1", "performSend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$initSmileyPanel$1", "performSend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yz5.p commentInputCallback = storyCommentInputView.getCommentInputCallback();
                if (commentInputCallback != null) {
                    commentInputCallback.invoke(text.toString(), java.lang.Boolean.TRUE);
                }
            }
        }
    }
}
