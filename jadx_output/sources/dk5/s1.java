package dk5;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.t1 f234872d;

    public s1(dk5.t1 t1Var) {
        this.f234872d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f234872d.f234898h.f210968u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234872d.f234898h;
        com.tencent.mm.ui.widget.snackbar.j.c(msgRetransmitUI.getString(com.tencent.mm.R.string.fw6), null, msgRetransmitUI, null, null);
        ku5.u0 u0Var = ku5.t0.f312615d;
        dk5.r1 r1Var = new dk5.r1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(r1Var, 2000L, false);
    }
}
