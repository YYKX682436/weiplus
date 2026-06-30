package vw3;

/* loaded from: classes.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI f441176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f441177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f441178f;

    public x2(com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI, long j17, com.tencent.mm.storage.f9 f9Var) {
        this.f441176d = repairerMsgDebugUI;
        this.f441177e = j17;
        this.f441178f = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI = this.f441176d;
        android.content.Intent intent = new android.content.Intent(repairerMsgDebugUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI.class);
        pf5.j0.a(intent, ix3.p5.class);
        intent.putExtra("Chat_Msg_Id", this.f441177e);
        intent.putExtra("Chat_User", this.f441178f.Q0());
        androidx.appcompat.app.AppCompatActivity context = repairerMsgDebugUI.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
