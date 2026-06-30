package zw1;

/* loaded from: classes9.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.y2 f476843d;

    public x2(zw1.y2 y2Var) {
        this.f476843d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zw1.y2 y2Var = this.f476843d;
        y2Var.f476858d.hideVKB();
        y2Var.f476858d.showNormalStWcKb();
    }
}
