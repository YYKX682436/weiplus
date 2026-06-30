package ei3;

/* loaded from: classes10.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f252995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f252996e;

    public b0(ei3.k0 k0Var, java.lang.Runnable runnable) {
        this.f252996e = k0Var;
        this.f252995d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.k0.z(this.f252996e, this.f252995d);
    }
}
