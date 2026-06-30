package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class p1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText f191050d;

    public p1(com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText) {
        this.f191050d = mMPhoneNumberEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString());
        com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText = this.f191050d;
        if (K0) {
            mMPhoneNumberEditText.f189780g = true;
        } else {
            mMPhoneNumberEditText.f189780g = false;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.pluginsdk.ui.h2 h2Var;
        com.tencent.mm.pluginsdk.ui.h2 h2Var2;
        com.tencent.mm.pluginsdk.ui.h2 h2Var3;
        int i27 = com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText.f189776m;
        com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText = this.f191050d;
        mMPhoneNumberEditText.b();
        if (charSequence.toString().equals("") && !mMPhoneNumberEditText.f189780g) {
            if (mMPhoneNumberEditText.f189778e == null || !mMPhoneNumberEditText.isFocused()) {
                return;
            }
            com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) mMPhoneNumberEditText.f189778e;
            if (profileEditPhoneNumberView.f189807h.getChildCount() - 1 == 1 || (h2Var3 = profileEditPhoneNumberView.f189809m) == null) {
                return;
            }
            h2Var3.onChange();
            return;
        }
        if (charSequence.toString().equals("") || !mMPhoneNumberEditText.f189780g) {
            if (mMPhoneNumberEditText.f189778e == null || !mMPhoneNumberEditText.isFocused() || (h2Var = ((com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) mMPhoneNumberEditText.f189778e).f189809m) == null) {
                return;
            }
            h2Var.onChange();
            return;
        }
        if (mMPhoneNumberEditText.f189778e == null || !mMPhoneNumberEditText.isFocused() || (h2Var2 = ((com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) mMPhoneNumberEditText.f189778e).f189809m) == null) {
            return;
        }
        h2Var2.onChange();
    }
}
