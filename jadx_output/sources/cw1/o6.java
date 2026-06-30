package cw1;

/* loaded from: classes12.dex */
public class o6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f223206d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f223207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI f223208f;

    public o6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI cleanNewUI, long j17, int i17) {
        this.f223208f = cleanNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f223206d) {
            return;
        }
        int i17 = this.f223207e + 1;
        this.f223207e = i17;
        this.f223208f.N.b(0, (int) ((1.0d - java.lang.Math.exp((i17 * (-2.3d)) / 50)) * 100.0d), 100);
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(this, 200L, false);
    }
}
