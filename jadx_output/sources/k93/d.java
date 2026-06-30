package k93;

/* loaded from: classes8.dex */
public class d implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.widget.InputClearablePreference f305886d;

    public d(com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference) {
        this.f305886d = inputClearablePreference;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference = this.f305886d;
        if (editable == null) {
            android.widget.ImageView imageView = inputClearablePreference.T;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        java.lang.String obj = editable.toString();
        inputClearablePreference.M(obj);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(obj);
        android.widget.ImageView imageView2 = inputClearablePreference.T;
        if (imageView2 != null) {
            if (z17) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
        inputClearablePreference.L = obj;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (charSequence != null) {
            charSequence.toString();
            k93.h hVar = this.f305886d.W;
            if (hVar != null) {
                java.lang.String charSequence2 = charSequence.toString();
                com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = ((f93.l1) hVar).f260379a;
                contactLabelEditUI.f143221e = charSequence2;
                contactLabelEditUI.enableOptionMenu(!com.tencent.mm.sdk.platformtools.t8.K0(charSequence2));
                android.widget.TextView textView = contactLabelEditUI.f143232s.U;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            }
        }
    }
}
