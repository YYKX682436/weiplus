package vw3;

/* loaded from: classes.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI f440889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f440890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f440891f;

    public b3(com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI, long j17, com.tencent.mm.storage.f9 f9Var) {
        this.f440889d = repairerMsgDebugUI;
        this.f440890e = j17;
        this.f440891f = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI = this.f440889d;
        android.content.Intent intent = new android.content.Intent(repairerMsgDebugUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI.class);
        pf5.j0.a(intent, ix3.c1.class);
        intent.putExtra("Chat_Msg_Id", this.f440890e);
        intent.putExtra("Chat_User", this.f440891f.Q0());
        androidx.appcompat.app.AppCompatActivity context = repairerMsgDebugUI.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$14", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$14", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
