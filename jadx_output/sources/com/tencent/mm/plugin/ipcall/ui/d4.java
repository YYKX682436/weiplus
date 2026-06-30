package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class d4 implements com.tencent.mm.ui.widget.dialog.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f142781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f142783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142784d;

    public d4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI, android.widget.EditText editText, java.lang.String str, int i17) {
        this.f142784d = iPCallShareCouponCardUI;
        this.f142781a = editText;
        this.f142782b = str;
        this.f142783c = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k
    public void a(boolean z17) {
        if (z17) {
            android.widget.EditText editText = this.f142781a;
            w11.o0 o0Var = new w11.o0(this.f142783c, editText == null ? this.f142782b : editText.getText().toString());
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f142784d;
            iPCallShareCouponCardUI.f142678o = db5.e1.Q(iPCallShareCouponCardUI, iPCallShareCouponCardUI.getString(com.tencent.mm.R.string.f490573yv), this.f142784d.getString(com.tencent.mm.R.string.f490552yb), true, true, new com.tencent.mm.plugin.ipcall.ui.c4(this, o0Var));
            c01.d9.e().g(o0Var);
        }
    }
}
