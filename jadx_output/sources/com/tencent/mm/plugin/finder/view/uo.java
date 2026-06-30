package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class uo implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f133212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.cp f133213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f133214g;

    public uo(android.view.View view, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.finder.view.cp cpVar, android.content.Context context) {
        this.f133211d = view;
        this.f133212e = mMEditText;
        this.f133213f = cpVar;
        this.f133214g = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if ((editable != null ? editable.length() : -1) > 8 && editable != null) {
            editable.delete(editable.length() - 1, editable.length());
        }
        android.view.View view = this.f133211d;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jda);
        if (textView != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f133212e;
            int parseInt = mMEditText.getText().toString().length() == 0 ? -1 : java.lang.Integer.parseInt(mMEditText.getText().toString());
            com.tencent.mm.plugin.finder.view.cp cpVar = this.f133213f;
            android.content.Context context = this.f133214g;
            if (parseInt == -1 || (parseInt <= cpVar.f131796h && parseInt >= 1)) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
                textView.setText(context.getString(com.tencent.mm.R.string.f491401cz5, java.lang.Integer.valueOf(cpVar.f131796h)));
                ((android.widget.Button) view.findViewById(com.tencent.mm.R.id.b2z)).setEnabled(parseInt != -1);
            } else {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.Red_100));
                textView.setText(context.getString(parseInt < 1 ? com.tencent.mm.R.string.cz6 : com.tencent.mm.R.string.f491400cz4, java.lang.Integer.valueOf(cpVar.f131796h)));
                ((android.widget.Button) view.findViewById(com.tencent.mm.R.id.b2z)).setEnabled(false);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
