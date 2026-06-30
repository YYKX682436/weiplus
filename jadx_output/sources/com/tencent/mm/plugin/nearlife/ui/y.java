package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class y implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI f152352d;

    public y(com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI) {
        this.f152352d = nearLifeCreatePoiUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI = this.f152352d;
        if (nearLifeCreatePoiUI.f152271i.getText().toString().trim().length() == 0 || nearLifeCreatePoiUI.f152272m.getText().toString().trim().length() == 0 || nearLifeCreatePoiUI.f152273n.getText().toString().trim().length() == 0) {
            nearLifeCreatePoiUI.enableOptionMenu(0, false);
        } else {
            nearLifeCreatePoiUI.enableOptionMenu(0, true);
        }
    }
}
