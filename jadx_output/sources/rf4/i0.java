package rf4;

/* loaded from: classes5.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395070d;

    public i0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView) {
        this.f395070d = storyCommentInputView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView = this.f395070d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) storyCommentInputView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(storyCommentInputView.f171937g, 0);
        }
    }
}
