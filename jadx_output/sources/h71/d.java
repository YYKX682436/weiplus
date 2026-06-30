package h71;

/* loaded from: classes15.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI f279383a;

    public d(com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f279383a = mySafeDeviceDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI = this.f279383a;
        android.app.ProgressDialog progressDialog = mySafeDeviceDetailUI.f73206q;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        mySafeDeviceDetailUI.f73206q = null;
        if (fVar.b()) {
            mySafeDeviceDetailUI.X6();
        } else {
            mySafeDeviceDetailUI.f73201i = !mySafeDeviceDetailUI.f73201i;
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) mySafeDeviceDetailUI.getPreferenceScreen()).h("detail_device_autologin_switch");
            kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17;
            mySafeDeviceDetailUI.getDefaultSharedPreferences().edit().putBoolean(checkBoxPreference.f197780q, mySafeDeviceDetailUI.f73201i).commit();
            checkBoxPreference.S(mySafeDeviceDetailUI.f73201i);
            if (fVar.f70616b == 6) {
                dp.a.makeText(mySafeDeviceDetailUI.getContext(), mySafeDeviceDetailUI.getContext().getString(com.tencent.mm.R.string.pho), 0).show();
            } else {
                dp.a.makeText(mySafeDeviceDetailUI.getContext(), mySafeDeviceDetailUI.getContext().getString(com.tencent.mm.R.string.phn), 0).show();
            }
        }
        return java.lang.Boolean.valueOf(e71.k.wi().update(mySafeDeviceDetailUI.V6(), new java.lang.String[0]));
    }
}
