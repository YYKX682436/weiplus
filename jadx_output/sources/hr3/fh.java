package hr3;

/* loaded from: classes11.dex */
public class fh implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f283564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr3.gh f283565b;

    public fh(hr3.gh ghVar, java.lang.CharSequence charSequence) {
        this.f283565b = ghVar;
        this.f283564a = charSequence;
    }

    @Override // uc0.p
    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        hr3.gh ghVar = this.f283565b;
        if (!K0) {
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = ghVar.f283599e;
            sayHiWithSnsPermissionUI.f153839z[3] = 1;
            sayHiWithSnsPermissionUI.E = true;
        }
        ghVar.f283599e.f153817h.setText(((java.lang.Object) this.f283564a) + str);
        ghVar.f283599e.f153817h.clearFocus();
        android.view.View view = ghVar.f283599e.f153818i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
