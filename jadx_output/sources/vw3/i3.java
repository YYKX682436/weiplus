package vw3;

/* loaded from: classes.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI f440987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f440988e;

    public i3(com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI, com.tencent.mm.storage.f9 f9Var) {
        this.f440987d = repairerMsgDebugUI;
        this.f440988e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent((android.content.Context) this.f440987d, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI.class);
        com.tencent.mm.storage.f9 f9Var = this.f440988e;
        intent.putExtra("xmlContent", f9Var != null ? f9Var.U1() : null);
        intent.putExtra("msgId", f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        intent.putExtra("fromUsername", f9Var != null ? f9Var.Q0() : null);
        intent.putExtra("toUsername", f9Var != null ? f9Var.Q0() : null);
        com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI = this.f440987d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerMsgDebugUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerMsgDebugUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerMsgDebugUI, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
