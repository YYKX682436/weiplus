package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class u3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f129898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f129899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f129900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f129901h;

    public u3(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, int i17, android.widget.EditText editText, yz5.l lVar, android.widget.TextView textView) {
        this.f129897d = finderCreateContactUI;
        this.f129898e = i17;
        this.f129899f = editText;
        this.f129900g = lVar;
        this.f129901h = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        java.lang.String obj;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129897d;
        int i17 = this.f129898e == 1 ? finderCreateContactUI.f128548x0 : finderCreateContactUI.f128551y0;
        android.widget.EditText editText = this.f129899f;
        ck5.f b17 = ck5.f.b(editText);
        b17.f42561f = 1;
        b17.f42560e = i17;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.finder.ui.t3(this.f129901h, i17, finderCreateContactUI));
        android.text.Editable text = editText.getText();
        if (text == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
            str = "";
        }
        this.f129900g.invoke(str);
        editText.setTextColor(i65.a.d(finderCreateContactUI, com.tencent.mm.R.color.a0c));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
