package db5;

/* loaded from: classes11.dex */
public final class o3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditText f228455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228456e;

    public o3(com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText, android.content.Context context) {
        this.f228455d = mMLimitedClearEditText;
        this.f228456e = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int g17 = com.tencent.mm.ui.tools.v4.g(java.lang.String.valueOf(editable));
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f228455d;
        int textLimitLength = mMLimitedClearEditText.getTextLimitLength() - mMLimitedClearEditText.getLeftLengthToShowRemainTips();
        if (com.tencent.mars.xlog.Log.isDebug()) {
            mMLimitedClearEditText.getTextLimitLength();
            mMLimitedClearEditText.getLeftLengthToShowRemainTips();
        }
        if (mMLimitedClearEditText.getTextLimitLength() <= 0) {
            return;
        }
        int textLimitLength2 = mMLimitedClearEditText.getTextLimitLength();
        android.content.Context context = this.f228456e;
        if (g17 > textLimitLength2) {
            mMLimitedClearEditText.f197454g.setText(mMLimitedClearEditText.getResources().getString(com.tencent.mm.R.string.f27new, java.lang.Integer.valueOf(g17 - mMLimitedClearEditText.getTextLimitLength())));
            mMLimitedClearEditText.f197454g.setTextColor(i65.a.d(context, com.tencent.mm.R.color.Red_100));
            mMLimitedClearEditText.f197454g.setVisibility(0);
        } else if (mMLimitedClearEditText.getTextLimitLength() == g17) {
            mMLimitedClearEditText.f197454g.setText(mMLimitedClearEditText.getResources().getString(com.tencent.mm.R.string.nex));
            mMLimitedClearEditText.f197454g.setTextColor(i65.a.d(context, com.tencent.mm.R.color.FG_2));
            mMLimitedClearEditText.f197454g.setVisibility(0);
        } else if (g17 >= textLimitLength) {
            mMLimitedClearEditText.f197454g.setText(mMLimitedClearEditText.getResources().getString(com.tencent.mm.R.string.ney, java.lang.Integer.valueOf(mMLimitedClearEditText.getTextLimitLength() - g17)));
            mMLimitedClearEditText.f197454g.setTextColor(i65.a.d(context, com.tencent.mm.R.color.FG_2));
            mMLimitedClearEditText.f197454g.setVisibility(0);
        } else {
            mMLimitedClearEditText.f197454g.setVisibility(8);
        }
        if (mMLimitedClearEditText.f197454g.getVisibility() == 0) {
            android.widget.TextView textView = mMLimitedClearEditText.f197454g;
            textView.announceForAccessibility(textView.getText());
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText.a(mMLimitedClearEditText);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f228455d.setEdited(true);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
