package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class q1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText f191082d;

    public q1(com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText) {
        this.f191082d = mMPhoneNumberEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText = this.f191082d;
        android.view.View.OnFocusChangeListener onFocusChangeListener = mMPhoneNumberEditText.f189782i;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        mMPhoneNumberEditText.b();
    }
}
