package hr3;

/* loaded from: classes11.dex */
public class v implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f284092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr3.w f284093b;

    public v(hr3.w wVar, java.lang.CharSequence charSequence) {
        this.f284093b = wVar;
        this.f284092a = charSequence;
    }

    @Override // uc0.p
    public void a(java.lang.String str) {
        hr3.w wVar = this.f284093b;
        wVar.f284123e.f153646y[1] = 1;
        if (!x51.t1.b(str)) {
            wVar.f284123e.f153646y[2] = 1;
        }
        wVar.f284123e.f153629e.setText(((java.lang.Object) this.f284092a) + str);
        wVar.f284123e.f153629e.clearFocus();
        android.view.View view = wVar.f284123e.f153633i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
