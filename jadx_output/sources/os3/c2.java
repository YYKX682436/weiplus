package os3;

/* loaded from: classes8.dex */
public class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrListUI f348053d;

    public c2(com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI) {
        this.f348053d = mailAddrListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI = this.f348053d;
        os3.f2 f2Var = mailAddrListUI.f154874h;
        f2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) f2Var.f348078e;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((ks3.u) hashMap.get((java.lang.String) it.next()));
        }
        com.tencent.mm.plugin.qqmail.ui.ComposeUI.f154830p1 = arrayList;
        mailAddrListUI.setResult(-1);
        mailAddrListUI.finish();
        return true;
    }
}
