package z83;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI f470759d;

    public y(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI kidsWatchRegRebindUI) {
        this.f470759d = kidsWatchRegRebindUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI.f143166q;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI kidsWatchRegRebindUI = this.f470759d;
        kidsWatchRegRebindUI.getClass();
        android.content.Intent intent = new android.content.Intent(kidsWatchRegRebindUI, (java.lang.Class<?>) com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.class);
        java.lang.String str = kidsWatchRegRebindUI.f143167d;
        if (str == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(kidsWatchRegRebindUI, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "goBackRegUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        kidsWatchRegRebindUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(kidsWatchRegRebindUI, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "goBackRegUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
