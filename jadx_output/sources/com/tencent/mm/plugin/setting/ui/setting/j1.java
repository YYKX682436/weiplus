package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class j1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f161174d = 60;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI f161176f;

    public j1(com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI editSignatureUI, java.lang.String str) {
        this.f161176f = editSignatureUI;
        this.f161175e = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean z17 = !editable.toString().equals(this.f161175e);
        com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI editSignatureUI = this.f161176f;
        editSignatureUI.enableOptionMenu(z17);
        int b17 = com.tencent.mm.ui.tools.v4.b(60, editable.toString());
        this.f161174d = b17;
        if (b17 < 0) {
            this.f161174d = 0;
        }
        android.widget.TextView textView = editSignatureUI.f160140e;
        if (textView != null) {
            textView.setText("" + (this.f161174d / 2));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
