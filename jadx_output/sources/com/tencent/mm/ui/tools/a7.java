package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class a7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMTextInputUI f210273d;

    public a7(com.tencent.mm.ui.tools.MMTextInputUI mMTextInputUI) {
        this.f210273d = mMTextInputUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.tencent.mm.ui.tools.MMTextInputUI mMTextInputUI = this.f210273d;
        if (!mMTextInputUI.f210082i) {
            if (obj.trim().length() > 0) {
                mMTextInputUI.enableOptionMenu(true);
            } else {
                mMTextInputUI.enableOptionMenu(false);
            }
        }
        if (mMTextInputUI.f210079f > 0) {
            mMTextInputUI.f210081h = 0;
            for (int i17 = 0; i17 < obj.length(); i17++) {
                if (com.tencent.mm.sdk.platformtools.t8.z0(obj.charAt(i17))) {
                    mMTextInputUI.f210081h += 2;
                } else {
                    mMTextInputUI.f210081h++;
                }
            }
            int i18 = mMTextInputUI.f210081h;
            if (i18 >= mMTextInputUI.f210080g && i18 <= mMTextInputUI.f210079f) {
                mMTextInputUI.enableOptionMenu(true);
                mMTextInputUI.f210078e.setVisibility(0);
                mMTextInputUI.f210078e.setTextColor(mMTextInputUI.getResources().getColor(com.tencent.mm.R.color.a8m));
                mMTextInputUI.f210078e.setText(mMTextInputUI.getString(com.tencent.mm.R.string.jue, java.lang.Integer.valueOf((mMTextInputUI.f210079f - mMTextInputUI.f210081h) >> 1)));
                return;
            }
            if (i18 <= mMTextInputUI.f210079f) {
                mMTextInputUI.enableOptionMenu(mMTextInputUI.f210082i || i18 > 0);
                mMTextInputUI.f210078e.setVisibility(8);
            } else {
                mMTextInputUI.enableOptionMenu(false);
                mMTextInputUI.f210078e.setVisibility(0);
                mMTextInputUI.f210078e.setTextColor(mMTextInputUI.getResources().getColor(com.tencent.mm.R.color.a8n));
                mMTextInputUI.f210078e.setText(mMTextInputUI.getString(com.tencent.mm.R.string.juf, java.lang.Integer.valueOf(((mMTextInputUI.f210081h - mMTextInputUI.f210079f) >> 1) + 1)));
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
