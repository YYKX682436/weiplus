package os3;

/* loaded from: classes8.dex */
public class s4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.u4 f348198d;

    public s4(os3.u4 u4Var) {
        this.f348198d = u4Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        os3.u4 u4Var = this.f348198d;
        if (i17 == 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 20);
            db5.e1.p(u4Var.f348219d.getContext(), u4Var.f348219d.getContext().getString(com.tencent.mm.R.string.p5t), 0, u4Var.f348219d.getContext().getString(com.tencent.mm.R.string.hrr), u4Var.f348219d.getContext().getString(com.tencent.mm.R.string.apj), new os3.q4(this), new os3.r4(this));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(u4Var.f348219d, com.tencent.mm.plugin.qqmail.ui.ComposeUI.class);
        intent.putExtra("mailid", u4Var.f348219d.f154927f.f311626a);
        intent.putExtra("subject", u4Var.f348219d.f154927f.f311628c);
        java.lang.String[] mailAddrStringArray = u4Var.f348219d.f154931m.getMailAddrStringArray();
        java.lang.String[] mailAddrStringArray2 = u4Var.f348219d.f154933o.getMailAddrStringArray();
        java.lang.String[] mailAddrStringArray3 = u4Var.f348219d.f154932n.getMailAddrStringArray();
        if (i17 == 0) {
            intent.putExtra("composeType", 2);
            intent.putExtra("toList", mailAddrStringArray);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 16);
        } else if (i17 == 1) {
            intent.putExtra("composeType", 2);
            java.lang.String[] strArr = new java.lang.String[mailAddrStringArray.length + mailAddrStringArray2.length];
            int length = mailAddrStringArray.length;
            int i18 = 0;
            int i19 = 0;
            while (i18 < length) {
                strArr[i19] = mailAddrStringArray[i18];
                i18++;
                i19++;
            }
            int length2 = mailAddrStringArray2.length;
            int i27 = 0;
            while (i27 < length2) {
                strArr[i19] = mailAddrStringArray2[i27];
                i27++;
                i19++;
            }
            intent.putExtra("toList", strArr);
            intent.putExtra("ccList", mailAddrStringArray3);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 17);
        } else {
            if (i17 != 2) {
                return;
            }
            intent.putExtra("mail_content", u4Var.f348219d.f154927f.f311634i);
            intent.putExtra("mail_attach", u4Var.f348219d.f154927f.f311632g);
            intent.putExtra("mail_mode", 21);
            intent.putExtra("composeType", 3);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 18);
        }
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = u4Var.f348219d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(readMailUI, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$7$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        readMailUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(readMailUI, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$7$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
