package s61;

/* loaded from: classes9.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 f403393d;

    public u0(com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 recoverAccountUI1) {
        this.f403393d = recoverAccountUI1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/RecoverAccountUI1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct import_old_account_contactsstruct = new com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct();
        import_old_account_contactsstruct.f63116d = 3;
        import_old_account_contactsstruct.k();
        gm0.j1.d().g(new r61.d1(this.f403393d.f73172e));
        com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 recoverAccountUI1 = this.f403393d;
        recoverAccountUI1.f73171d = db5.e1.Q(recoverAccountUI1, null, recoverAccountUI1.getString(com.tencent.mm.R.string.f490468vx), false, false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/RecoverAccountUI1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
