package db5;

/* loaded from: classes9.dex */
public class g1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMAutoCompleteTextView f228342d;

    public g1(com.tencent.mm.ui.base.MMAutoCompleteTextView mMAutoCompleteTextView) {
        this.f228342d = mMAutoCompleteTextView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27 = com.tencent.mm.ui.base.MMAutoCompleteTextView.f197309e;
        this.f228342d.a();
    }
}
