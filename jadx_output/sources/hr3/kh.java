package hr3;

/* loaded from: classes11.dex */
public class kh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283728d;

    public kh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f283728d = sayHiWithSnsPermissionUI3;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.view.View view;
        int f17 = com.tencent.mm.ui.tools.v4.f(editable.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283728d;
        if (f17 >= 64 && (view = sayHiWithSnsPermissionUI3.f153850n) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$12", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$12", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (sayHiWithSnsPermissionUI3.f153846h.c()) {
            sayHiWithSnsPermissionUI3.U6();
        } else {
            sayHiWithSnsPermissionUI3.V6();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
