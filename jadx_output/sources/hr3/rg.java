package hr3;

/* loaded from: classes11.dex */
public class rg implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283956d;

    public rg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f283956d = sayHiWithSnsPermissionUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f283956d;
        boolean[] zArr = sayHiWithSnsPermissionUI.A1;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
            sVar.Ab("ie_ver_usr");
        }
        sVar.a6("ie_ver_usr");
        if (!charSequence.equals(sayHiWithSnsPermissionUI.f153814e) && !sayHiWithSnsPermissionUI.F) {
            sayHiWithSnsPermissionUI.f153814e = charSequence.toString();
            sayHiWithSnsPermissionUI.f153815f.setVisibility(0);
            sayHiWithSnsPermissionUI.f153816g.setVisibility(8);
        }
        if (sayHiWithSnsPermissionUI.F) {
            sayHiWithSnsPermissionUI.F = false;
        }
    }
}
