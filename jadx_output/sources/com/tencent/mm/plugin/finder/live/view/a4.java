package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class a4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.c4 f116175d;

    public a4(com.tencent.mm.plugin.finder.live.view.c4 c4Var) {
        this.f116175d = c4Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.widget.TextView textView;
        boolean z17 = java.lang.String.valueOf(editable).length() == 0;
        com.tencent.mm.plugin.finder.live.view.c4 c4Var = this.f116175d;
        if (!z17 && (textView = c4Var.L) != null) {
            textView.setVisibility(4);
        }
        c4Var.e0();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
