package ws3;

/* loaded from: classes9.dex */
public class k implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f449186d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.form.MallFormView f449187e;

    public k(com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView) {
        this.f449187e = mallFormView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView = this.f449187e;
        if (mallFormView.b() != this.f449186d) {
            ws3.q qVar = mallFormView.f155167i;
            if (qVar != null) {
                boolean b17 = mallFormView.b();
                com.tencent.mm.plugin.recharge.ui.h0 h0Var = (com.tencent.mm.plugin.recharge.ui.h0) qVar;
                com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = h0Var.f155189a;
                if (b17) {
                    phoneRechargeUI.hideVKB();
                    java.lang.String a17 = vs3.b.a(phoneRechargeUI.f155104g.getText());
                    if (a17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "null phone, return");
                    } else {
                        s75.d.f404635a.a(new com.tencent.mm.plugin.recharge.ui.e0(h0Var, a17), "search_matched_mobile", true);
                        if (phoneRechargeUI.L) {
                            phoneRechargeUI.L = false;
                        } else {
                            phoneRechargeUI.L = true;
                        }
                    }
                } else {
                    phoneRechargeUI.f155104g.getTipsTv().setText("");
                    phoneRechargeUI.f155104g.getTipsTv().setTextColor(phoneRechargeUI.getResources().getColor(com.tencent.mm.R.color.a0c));
                    phoneRechargeUI.f155119y = "";
                    phoneRechargeUI.Z6();
                    phoneRechargeUI.a7(false, false);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(phoneRechargeUI.f155104g.getText())) {
                        ((android.widget.AutoCompleteTextView) phoneRechargeUI.f155104g.getContentEditText()).showDropDown();
                    }
                }
            }
            this.f449186d = mallFormView.b();
        }
        mallFormView.c();
    }
}
