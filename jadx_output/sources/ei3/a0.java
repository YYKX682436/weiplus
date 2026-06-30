package ei3;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f252991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f252992e;

    public a0(ei3.k0 k0Var, java.lang.Runnable runnable) {
        this.f252992e = k0Var;
        this.f252991d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.k0.z(this.f252992e, this.f252991d);
    }
}
