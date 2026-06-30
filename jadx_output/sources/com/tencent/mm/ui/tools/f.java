package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class f implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ActionBarSearchView f210384d;

    public f(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        this.f210384d = actionBarSearchView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.widget.EditText editText;
        java.lang.String str;
        java.lang.String str2;
        int i27 = com.tencent.mm.ui.tools.ActionBarSearchView.f209960u;
        com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView = this.f210384d;
        actionBarSearchView.m();
        com.tencent.mm.ui.tools.vd vdVar = actionBarSearchView.f209966i;
        if (vdVar.f210858e && (editText = (android.widget.EditText) vdVar.f210855b.get()) != null && (((charSequence != null && charSequence.toString() != null && charSequence.toString().length() != 0) || ((str = vdVar.f210857d) != null && str.length() != 0)) && ((str2 = vdVar.f210857d) == null || charSequence == null || !str2.equals(charSequence.toString())))) {
            java.lang.String charSequence2 = charSequence != null ? charSequence.toString() : "";
            vdVar.f210857d = charSequence2;
            vdVar.f210854a = com.tencent.mm.ui.tools.vd.a(charSequence2, vdVar.f210856c);
            com.tencent.mm.ui.tools.vd.b(editText, vdVar.f210856c);
        }
        com.tencent.mm.ui.tools.q qVar = actionBarSearchView.f209968n;
        if (qVar != null) {
            qVar.L(charSequence != null ? charSequence.toString() : "");
        }
    }
}
