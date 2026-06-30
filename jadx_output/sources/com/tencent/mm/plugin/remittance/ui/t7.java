package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class t7 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f157956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f157957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f157958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f157959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f157960h;

    public t7(com.tencent.mm.ui.widget.MMEditText mMEditText, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, java.util.ArrayList arrayList, com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage) {
        this.f157956d = mMEditText;
        this.f157957e = c0Var;
        this.f157958f = h0Var;
        this.f157959g = arrayList;
        this.f157960h = remittanceRemarkInputHalfPage;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 123) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("userName");
                java.lang.String stringExtra2 = intent.getStringExtra("telNumber");
                java.lang.String stringExtra3 = intent.getStringExtra("proviceFirstStageName");
                java.lang.String stringExtra4 = intent.getStringExtra("addressCitySecondStageName");
                java.lang.String stringExtra5 = intent.getStringExtra("addressCountiesThirdStageName");
                java.lang.String stringExtra6 = intent.getStringExtra("addressDetailInfo");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (!(stringExtra == null || stringExtra.length() == 0)) {
                    sb6.append(stringExtra);
                }
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    sb6.append(stringExtra2);
                }
                if (!(sb6.length() == 0)) {
                    sb6.append(" ");
                }
                if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                    sb6.append(stringExtra3);
                }
                if (!(stringExtra4 == null || stringExtra4.length() == 0)) {
                    sb6.append(stringExtra4);
                }
                if (!(stringExtra5 == null || stringExtra5.length() == 0)) {
                    sb6.append(stringExtra5);
                }
                if (!(stringExtra6 == null || stringExtra6.length() == 0)) {
                    sb6.append(stringExtra6);
                }
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                java.lang.String obj = this.f157956d.getText().toString();
                if (!(obj == null || obj.length() == 0) && !r26.i0.o(obj, ";", false, 2, null)) {
                    this.f157956d.getText().append((java.lang.CharSequence) ";");
                    com.tencent.mm.ui.widget.MMEditText mMEditText = this.f157956d;
                    mMEditText.setSelection(mMEditText.getText().length());
                }
                this.f157957e.f310112d = true;
                this.f157956d.n(sb7.concat(";"));
                this.f157958f.f310123d = ((java.lang.String) this.f157958f.f310123d) + sb7;
                if (this.f157959g.isEmpty() || !kotlin.jvm.internal.o.b(kz5.n0.i0(this.f157959g), "2")) {
                    this.f157959g.add("2");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "cancel select address");
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.remittance.ui.s7 s7Var = new com.tencent.mm.plugin.remittance.ui.s7(this.f157960h);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(s7Var, 100L, false);
        }
    }
}
