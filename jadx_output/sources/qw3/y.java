package qw3;

/* loaded from: classes9.dex */
public class y implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f367223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f367224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367225f;

    public y(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f367225f = bankRemitBankcardInputUI;
        this.f367223d = editText;
        this.f367224e = editText2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = editable.length();
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367225f;
        if (length == 0) {
            bankRemitBankcardInputUI.f156478e.getInfoIv().setIconContentDescription(bankRemitBankcardInputUI.getString(com.tencent.mm.R.string.aew));
        }
        bankRemitBankcardInputUI.f156479f.setContentEnabled(true);
        bankRemitBankcardInputUI.f156477J = false;
        bankRemitBankcardInputUI.f156480g.setClickable(true);
        if (!bankRemitBankcardInputUI.H || bankRemitBankcardInputUI.f156486p == null) {
            bankRemitBankcardInputUI.H = true;
        } else {
            bankRemitBankcardInputUI.f156487q.getFilter().filter(editable.toString(), bankRemitBankcardInputUI.f156488r);
        }
        if (bankRemitBankcardInputUI.I) {
            bankRemitBankcardInputUI.f156479f.d();
            bankRemitBankcardInputUI.f156480g.d();
            bankRemitBankcardInputUI.f156482i.setImageBitmap(null);
            bankRemitBankcardInputUI.f156481h.d();
            bankRemitBankcardInputUI.f156481h.setVisibility(8);
            bankRemitBankcardInputUI.Z6();
            bankRemitBankcardInputUI.f156496z = "";
            bankRemitBankcardInputUI.A = "";
            bankRemitBankcardInputUI.f156494x = "";
            bankRemitBankcardInputUI.F = null;
            bankRemitBankcardInputUI.E = null;
        }
        bankRemitBankcardInputUI.e7();
        bankRemitBankcardInputUI.I = false;
        if (bankRemitBankcardInputUI.R) {
            int inputLength = bankRemitBankcardInputUI.f156478e.getInputLength();
            int i17 = bankRemitBankcardInputUI.f156492v;
            if (inputLength <= i17) {
                bankRemitBankcardInputUI.f156478e.setMaxInputLength(i17);
                bankRemitBankcardInputUI.f156478e.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(bankRemitBankcardInputUI.f156492v)});
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.widget.EditText editText;
        if (charSequence != null && charSequence.toString().substring(i17, i19 + i17).equals("\n")) {
            android.widget.EditText editText2 = this.f367223d;
            if (editText2 != null) {
                editText2.setText(charSequence.toString().replaceFirst("\n", ""));
            }
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367225f;
            android.widget.ListView listView = bankRemitBankcardInputUI.f156486p;
            if (listView != null) {
                listView.setVisibility(8);
            }
            if (bankRemitBankcardInputUI.f156477J || (editText = this.f367224e) == null) {
                return;
            }
            editText.requestFocus();
        }
    }
}
