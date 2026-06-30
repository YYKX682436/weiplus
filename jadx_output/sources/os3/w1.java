package os3;

/* loaded from: classes8.dex */
public class w1 extends ks3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrListUI f348241a;

    public w1(com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI) {
        this.f348241a = mailAddrListUI;
    }

    @Override // ks3.y
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MailAddrListUI", "sync addr complete");
        com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI = this.f348241a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = mailAddrListUI.f154870d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.util.List e17 = mailAddrListUI.f154873g.e(null);
        mailAddrListUI.f154875i = e17;
        if (e17.size() == 0) {
            mailAddrListUI.f154871e.setText(com.tencent.mm.R.string.ixb);
            mailAddrListUI.f154871e.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mailAddrListUI.getString(com.tencent.mm.R.string.hjk));
        sb6.append(((java.util.HashMap) mailAddrListUI.f154874h.f348078e).size() > 0 ? "(" + ((java.util.HashMap) mailAddrListUI.f154874h.f348078e).size() + ")" : "");
        mailAddrListUI.setMMTitle(sb6.toString());
        java.lang.String[] stringArrayExtra = mailAddrListUI.getIntent().getStringArrayExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA");
        if (stringArrayExtra != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str : stringArrayExtra) {
                java.lang.String[] split = str.split(" ");
                if (split.length == 2) {
                    hashSet.add(split[1]);
                }
            }
            for (ks3.u uVar : mailAddrListUI.f154875i) {
                if (hashSet.contains(uVar.f311751f)) {
                    ((java.util.HashMap) mailAddrListUI.f154874h.f348078e).put(uVar.f311751f, uVar);
                }
            }
        }
        mailAddrListUI.f154874h.notifyDataSetChanged();
    }
}
