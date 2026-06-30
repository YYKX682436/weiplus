package hr3;

/* loaded from: classes11.dex */
public class li implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f283783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr3.mi f283784b;

    public li(hr3.mi miVar, java.lang.CharSequence charSequence) {
        this.f283784b = miVar;
        this.f283783a = charSequence;
    }

    @Override // uc0.p
    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        hr3.mi miVar = this.f283784b;
        if (!K0) {
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = miVar.f283814e;
            sayHiWithSnsPermissionUI3.E[3] = 1;
            sayHiWithSnsPermissionUI3.getClass();
        }
        miVar.f283814e.f153846h.setText(((java.lang.Object) this.f283783a) + str);
        miVar.f283814e.f153846h.clearFocus();
        android.view.View view = miVar.f283814e.f153847i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
