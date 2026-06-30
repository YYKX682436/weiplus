package vw3;

/* loaded from: classes.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI f440938d;

    public e2(com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI) {
        this.f440938d = repairerLoginAndRegUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI.g;
        com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI = this.f440938d;
        repairerLoginAndRegUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(repairerLoginAndRegUI.getContext(), "com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg");
        intent.putExtra("ticket", "");
        intent.putExtra("moble", repairerLoginAndRegUI.U6().f441131b);
        intent.putExtra("regsession_id", "");
        intent.putExtra("reg_3d_app_ticket", "");
        intent.putExtra("reg_3d_app_type", "");
        intent.putExtra("next_controll", "");
        intent.putExtra(dm.i4.COL_USERNAME, repairerLoginAndRegUI.U6().f441137h);
        intent.putExtra("password", "");
        intent.putExtra("nickname", repairerLoginAndRegUI.U6().f441137h);
        intent.putExtra("avatar_url", repairerLoginAndRegUI.U6().f441136g);
        intent.putExtra("mobile_check_type", 0);
        intent.putExtra("kintent_nickname", true);
        intent.putExtra("kintent_hasavatar", repairerLoginAndRegUI.U6().f441137h);
        intent.putExtra("kintent_password", "");
        intent.putExtra("key_reg_style", repairerLoginAndRegUI.U6().f441139j);
        intent.putExtra("need_do_post_check", false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerLoginAndRegUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI", "goToOldPhoneReg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerLoginAndRegUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerLoginAndRegUI, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI", "goToOldPhoneReg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
