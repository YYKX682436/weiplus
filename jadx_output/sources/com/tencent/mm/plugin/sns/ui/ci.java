package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class ci implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsEditText f168132d;

    public ci(com.tencent.mm.plugin.sns.ui.SnsEditText snsEditText) {
        this.f168132d = snsEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (charSequence != null) {
            this.f168132d.I = charSequence.length();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.SnsEditText snsEditText = this.f168132d;
        try {
            if (snsEditText.H) {
                if (charSequence != null && charSequence.length() >= Integer.MAX_VALUE) {
                    if (charSequence.length() - snsEditText.I > Integer.MAX_VALUE) {
                        snsEditText.G = charSequence.length() - snsEditText.I;
                    }
                }
                snsEditText.G = 0;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsEditText", e17, "", new java.lang.Object[0]);
        }
    }
}
