package os3;

/* loaded from: classes8.dex */
public class x1 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrListUI f348247d;

    public x1(com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI) {
        this.f348247d = mailAddrListUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI = this.f348247d;
        mailAddrListUI.f154875i = mailAddrListUI.f154873g.e(str.toLowerCase().trim());
        if (mailAddrListUI.f154875i.size() == 0) {
            mailAddrListUI.f154871e.setText(com.tencent.mm.R.string.hjs);
            mailAddrListUI.f154871e.setVisibility(0);
            mailAddrListUI.enableOptionMenu(false);
        } else {
            mailAddrListUI.f154871e.setVisibility(8);
            mailAddrListUI.enableOptionMenu(true);
        }
        mailAddrListUI.f154874h.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
