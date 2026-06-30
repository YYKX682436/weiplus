package hr3;

/* loaded from: classes11.dex */
public class yh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f284221d;

    public yh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f284221d = sayHiWithSnsPermissionUI3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f284221d;
        if (!sayHiWithSnsPermissionUI3.f7()) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            sayHiWithSnsPermissionUI3.U = bool;
            sayHiWithSnsPermissionUI3.k7(bool.booleanValue());
            sayHiWithSnsPermissionUI3.V6();
        }
        sayHiWithSnsPermissionUI3.l7();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
