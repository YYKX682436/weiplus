package hr3;

/* loaded from: classes11.dex */
public class mh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283812d;

    public mh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f283812d = sayHiWithSnsPermissionUI3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283812d;
        sayHiWithSnsPermissionUI3.U = bool;
        sayHiWithSnsPermissionUI3.k7(bool.booleanValue());
        sayHiWithSnsPermissionUI3.l7();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
