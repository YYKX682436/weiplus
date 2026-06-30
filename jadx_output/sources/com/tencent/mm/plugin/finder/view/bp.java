package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class bp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f131736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.cp f131737e;

    public bp(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.finder.view.cp cpVar) {
        this.f131736d = mMEditText;
        this.f131737e = cpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f131736d;
        mMEditText.requestFocus();
        mMEditText.setSelection(mMEditText.getText().length());
        android.view.ViewGroup viewGroup = this.f131737e.f131794f;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            java.lang.Object systemService = mMActivity.getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(mMEditText, 0);
        }
    }
}
