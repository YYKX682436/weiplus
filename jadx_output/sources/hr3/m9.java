package hr3;

/* loaded from: classes8.dex */
public class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference f283798d;

    public m9(com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference) {
        this.f283798d = normalProfileHeaderPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = this.f283798d;
        intent.putExtra("finder_username", normalProfileHeaderPreference.Z.getUsername());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(normalProfileHeaderPreference.f197770d, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
