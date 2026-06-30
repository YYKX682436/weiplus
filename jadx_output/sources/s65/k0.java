package s65;

/* loaded from: classes11.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f403487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.m0 f403488e;

    public k0(s65.m0 m0Var, long j17) {
        this.f403488e = m0Var;
        this.f403487d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long max = java.lang.Math.max(0L, this.f403487d);
        s65.m0 m0Var = this.f403488e;
        m0Var.f403495b += max;
        m0Var.a(false);
    }
}
