package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132418d;

    public j6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132418d = finderCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.view.FinderCommentFooter.N1;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132418d;
        finderCommentFooter.getEditText().requestFocus();
        if (!(finderCommentFooter.getContext() instanceof com.tencent.mm.ui.MMActivity)) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) finderCommentFooter.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(finderCommentFooter.getEditText(), 0);
                return;
            }
            return;
        }
        android.content.Context context = finderCommentFooter.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            mMActivity.showVKB();
        }
    }
}
