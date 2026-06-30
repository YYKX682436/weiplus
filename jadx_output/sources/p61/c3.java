package p61;

/* loaded from: classes4.dex */
public class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindQQUI f352228d;

    public c3(com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI) {
        this.f352228d = bindQQUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindQQUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI = this.f352228d;
        com.tencent.mm.ui.MMWizardActivity.X6(bindQQUI, new android.content.Intent(bindQQUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.class));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindQQUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
