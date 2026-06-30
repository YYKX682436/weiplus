package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class g1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144820d;

    public g1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144820d = x1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144820d;
        x1Var.K = charSequence2;
        x1Var.f144926p.b();
        x1Var.B.setVisibility(8);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(x1Var.K)) {
            x1Var.E1.setVisibility(0);
            x1Var.w(true);
            return;
        }
        x1Var.E1.setVisibility(8);
        x1Var.f144932t.c();
        x1Var.f144932t.notifyDataSetChanged();
        x1Var.f144926p.removeFooterView(x1Var.f144929q);
        x1Var.q();
        x1Var.s(false);
        android.view.View view = x1Var.f144933u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$23", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$23", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
