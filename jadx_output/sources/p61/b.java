package p61;

/* loaded from: classes3.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI f352215d;

    public b(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI bindGoogleContactIntroUI) {
        this.f352215d = bindGoogleContactIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI bindGoogleContactIntroUI = this.f352215d;
        android.content.Intent intent = new android.content.Intent(bindGoogleContactIntroUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.class);
        intent.putExtra("enter_scene", bindGoogleContactIntroUI.f72925o);
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI bindGoogleContactIntroUI2 = this.f352215d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(bindGoogleContactIntroUI2, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bindGoogleContactIntroUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(bindGoogleContactIntroUI2, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
