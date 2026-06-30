package kf3;

/* loaded from: classes5.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.m1 f307392d;

    public l1(kf3.m1 m1Var) {
        this.f307392d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kf3.m1 m1Var = this.f307392d;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.U6(m1Var.f307398f, m1Var.f307396d, m1Var.f307397e);
    }
}
