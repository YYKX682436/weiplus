package hr3;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f283785d;

    public m(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI) {
        this.f283785d = addDescriptionUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI.V6(this.f283785d, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
