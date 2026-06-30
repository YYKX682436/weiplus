package ry4;

/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ry4.d1 d1Var) {
        super(2);
        this.f401683d = d1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem item = (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(item, "item");
        ry4.d1 d1Var = this.f401683d;
        androidx.appcompat.app.AppCompatActivity context = d1Var.getActivity();
        java.lang.String username = d1Var.f401608d;
        boolean z17 = d1Var.f401615n;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        intent.putExtra("extra_username", username);
        intent.putExtra("extra_edit_item", item);
        intent.putExtra("extra_edit_position", intValue);
        intent.putExtra("extra_read_only", z17);
        pf5.j0.a(intent, ry4.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandEditUI", "startForEdit", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandItem;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandEditUI", "startForEdit", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandItem;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        return jz5.f0.f302826a;
    }
}
