package zw1;

/* loaded from: classes9.dex */
public class d0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI f476601d;

    public d0(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f476601d = collectCreateQRCodeNewUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        double F = com.tencent.mm.sdk.platformtools.t8.F(editable.toString(), 0.0d);
        com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = this.f476601d;
        if (!collectCreateQRCodeNewUI.f96377d.n() || F < 0.01d) {
            collectCreateQRCodeNewUI.f96381h.e(false);
        } else {
            collectCreateQRCodeNewUI.f96381h.e(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
