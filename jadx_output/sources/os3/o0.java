package os3;

/* loaded from: classes8.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348162d;

    public o0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348162d = composeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348162d;
        android.content.Intent intent = new android.content.Intent(composeUI, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.MailAddrListUI.class);
        intent.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", composeUI.f154841o.getMailAddrStringArray());
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
        composeUI.startActivityForResult(intent, 2);
        composeUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477784bd);
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
