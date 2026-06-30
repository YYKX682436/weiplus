package p61;

/* loaded from: classes.dex */
public class n4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352329d;

    public n4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352329d = mobileFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI = this.f352329d;
        com.tencent.mm.ui.MMWizardActivity.X6(mobileFriendUI, new android.content.Intent(mobileFriendUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
