package kf3;

/* loaded from: classes5.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.t1 f307423d;

    public r1(kf3.t1 t1Var) {
        this.f307423d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kf3.t1 t1Var = this.f307423d;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.U6(t1Var.f307435g.f307451a, t1Var.f307432d, t1Var.f307434f);
    }
}
