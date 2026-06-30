package hr3;

/* loaded from: classes11.dex */
public class zh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f284246d;

    public zh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f284246d = sayHiWithSnsPermissionUI3;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f284246d;
        boolean[] zArr = sayHiWithSnsPermissionUI3.F1;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
            sVar.Ab("ie_ver_usr");
        }
        sVar.a6("ie_ver_usr");
        if (!charSequence.equals(sayHiWithSnsPermissionUI3.f153843e) && !sayHiWithSnsPermissionUI3.f153841J) {
            sayHiWithSnsPermissionUI3.f153843e = charSequence.toString();
            sayHiWithSnsPermissionUI3.f153844f.setVisibility(0);
            sayHiWithSnsPermissionUI3.f153845g.setVisibility(8);
        }
        if (sayHiWithSnsPermissionUI3.f153841J) {
            sayHiWithSnsPermissionUI3.f153841J = false;
        }
    }
}
