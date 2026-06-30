package gl5;

/* loaded from: classes15.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cedit.edit.CustomTextView f272901d;

    public a(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        this.f272901d = customTextView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f272901d;
        ((android.text.Editable) customTextView.getText()).insert(customTextView.getSelectionStart(), editable.toString());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
