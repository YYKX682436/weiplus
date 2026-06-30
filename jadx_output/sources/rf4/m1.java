package rf4;

/* loaded from: classes5.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgInputView f395085d;

    public m1(com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView) {
        this.f395085d = storyMsgInputView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.StoryMsgInputView storyMsgInputView = this.f395085d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) storyMsgInputView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(storyMsgInputView.f171986g, 0);
        }
    }
}
