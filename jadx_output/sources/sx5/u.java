package sx5;

/* loaded from: classes13.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f413757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413758e;

    public u(sx5.a1 a1Var, java.lang.Runnable runnable) {
        this.f413758e = a1Var;
        this.f413757d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f413758e.D1) {
            this.f413757d.run();
        }
    }
}
