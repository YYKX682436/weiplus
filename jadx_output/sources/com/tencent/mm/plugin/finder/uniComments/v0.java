package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes5.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130431d;

    public v0(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130431d = textStatusCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.N;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130431d;
        textStatusCommentFooter.getEditText().requestFocus();
        if (!(textStatusCommentFooter.getContext() instanceof com.tencent.mm.ui.MMActivity)) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) textStatusCommentFooter.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(textStatusCommentFooter.getEditText(), 0);
                return;
            }
            return;
        }
        android.content.Context context = textStatusCommentFooter.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            mMActivity.showVKB();
        }
    }
}
