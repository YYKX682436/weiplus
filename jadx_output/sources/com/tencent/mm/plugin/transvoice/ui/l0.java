package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class l0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175442d;

    public l0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175442d = v0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175442d;
        if (!v0Var.f175481h && v0Var.P) {
            v0Var.f175481h = true;
            v0Var.f175479f.f175399w = 1;
        }
        android.widget.Button button = v0Var.f175493v;
        if (button != null) {
            button.setEnabled(true ^ com.tencent.mm.sdk.platformtools.t8.J0(editable));
        }
        android.widget.ImageView imageView = v0Var.f175485o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(com.tencent.mm.sdk.platformtools.t8.J0(editable) ? 4 : 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
