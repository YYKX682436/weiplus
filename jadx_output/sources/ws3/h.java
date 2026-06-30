package ws3;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView f449178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws3.j f449179e;

    public h(ws3.j jVar, com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView instantAutoCompleteTextView) {
        this.f449179e = jVar;
        this.f449178d = instantAutoCompleteTextView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            int color = view.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2);
            com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView instantAutoCompleteTextView = this.f449178d;
            instantAutoCompleteTextView.setHintTextColor(color);
            ws3.j jVar = this.f449179e;
            vs3.a aVar = jVar.f449182b;
            if (aVar != null && aVar.f439878d == 2 && !jVar.f449185e) {
                android.widget.EditText editText = jVar.f449183c.f155164f;
                if (editText != null) {
                    editText.setText("");
                }
                jVar.f449182b = null;
            } else if (jVar.f449185e) {
                jVar.f449185e = false;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(instantAutoCompleteTextView.getText().toString())) {
                instantAutoCompleteTextView.showDropDown();
            }
        }
    }
}
