package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class fb implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f190322d;

    public fb(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f190322d = ibVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190322d;
        if (ibVar.T.size() < 2 || ((ibVar.f190411n.getText() != null && ibVar.f190411n.getText().length() > 0) || (ibVar.f190411n.getHint() != null && ibVar.f190411n.getHint().length() > 0))) {
            ibVar.f190407h.setVisibility(8);
        } else {
            ibVar.f190407h.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
