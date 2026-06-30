package cq4;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.PagInputView f221465d;

    public e(com.tencent.mm.plugin.vlog.ui.widget.PagInputView pagInputView) {
        this.f221465d = pagInputView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.widget.PagInputView pagInputView = this.f221465d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) pagInputView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(pagInputView.f176125q, 0);
        }
    }
}
