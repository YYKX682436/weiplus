package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.EditHintView f214105d;

    public a(com.tencent.mm.wallet_core.ui.EditHintView editHintView) {
        this.f214105d = editHintView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.wallet_core.ui.EditHintView editHintView = this.f214105d;
        if (editHintView.a() != editHintView.f214083t) {
            editHintView.getClass();
        }
        editHintView.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.wallet_core.ui.EditHintView editHintView = this.f214105d;
        if (editHintView.f214089z == 4 && editHintView.a()) {
            editHintView.f214089z = 0;
            editHintView.f214073g.ClearInput();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
