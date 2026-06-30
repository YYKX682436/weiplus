package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class gh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ih f208700d;

    public gh(com.tencent.mm.ui.ih ihVar) {
        this.f208700d = ihVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.ih ihVar = this.f208700d;
        if (editable == null || editable.length() <= 0) {
            ihVar.f208927e.setVisibility(8);
        } else {
            ihVar.f208927e.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
