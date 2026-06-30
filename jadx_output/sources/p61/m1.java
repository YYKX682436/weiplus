package p61;

/* loaded from: classes5.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI f352313d;

    public m1(com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI bindMContactStatusUI) {
        this.f352313d = bindMContactStatusUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.g7();
        com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI bindMContactStatusUI = this.f352313d;
        android.content.Intent intent = bindMContactStatusUI.getIntent();
        int i17 = com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI.f72979i;
        if (!intent.getBooleanExtra("intent_back_launcherui", false)) {
            bindMContactStatusUI.W6(1);
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent2, bindMContactStatusUI);
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
