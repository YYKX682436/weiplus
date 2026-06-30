package s65;

/* loaded from: classes11.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f403490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.m0 f403491e;

    public l0(s65.m0 m0Var, long j17) {
        this.f403491e = m0Var;
        this.f403490d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long max = java.lang.Math.max(0L, this.f403490d);
        s65.m0 m0Var = this.f403491e;
        m0Var.f403496c += max;
        m0Var.a(false);
    }
}
