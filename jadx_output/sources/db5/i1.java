package db5;

/* loaded from: classes9.dex */
public class i1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f228392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMAutoCompleteTextView f228393e;

    public i1(com.tencent.mm.ui.base.MMAutoCompleteTextView mMAutoCompleteTextView, java.lang.String str) {
        this.f228393e = mMAutoCompleteTextView;
        this.f228392d = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().endsWith(this.f228392d)) {
            this.f228393e.showDropDown();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
