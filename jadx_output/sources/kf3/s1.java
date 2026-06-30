package kf3;

/* loaded from: classes5.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.t1 f307429d;

    public s1(kf3.t1 t1Var) {
        this.f307429d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kf3.t1 t1Var = this.f307429d;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = t1Var.f307435g.f307451a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.k76), 0).show();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = t1Var.f307435g.f307451a.f148549p;
        if (u3Var != null) {
            u3Var.dismiss();
            t1Var.f307435g.f307451a.f148549p = null;
        }
    }
}
