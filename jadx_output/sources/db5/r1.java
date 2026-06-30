package db5;

/* loaded from: classes5.dex */
public class r1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMClearEditText f228489d;

    public r1(com.tencent.mm.ui.base.MMClearEditText mMClearEditText) {
        this.f228489d = mMClearEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27 = com.tencent.mm.ui.base.MMClearEditText.f197324i;
        this.f228489d.b();
    }
}
