package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText f190833d;

    public f2(com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView, com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText) {
        this.f190833d = mMPhoneNumberEditText;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText = this.f190833d;
        mMPhoneNumberEditText.setSelection(mMPhoneNumberEditText.getText().length());
        ((android.view.inputmethod.InputMethodManager) mMPhoneNumberEditText.getContext().getSystemService("input_method")).showSoftInput(mMPhoneNumberEditText, 0);
    }
}
