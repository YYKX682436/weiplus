package kf3;

/* loaded from: classes5.dex */
public class u1 implements t21.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307451a;

    public u1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI) {
        this.f307451a = massSendMsgUI;
    }

    @Override // t21.k0
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        if (i17 >= 0 || i17 == -50002) {
            s75.d.b(new kf3.t1(this, str, str3, i18), "MassSend_Remux");
            return;
        }
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307451a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.f493445k75), 0).show();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = massSendMsgUI.f148549p;
        if (u3Var != null) {
            u3Var.dismiss();
            massSendMsgUI.f148549p = null;
        }
    }
}
