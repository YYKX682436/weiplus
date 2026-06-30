package sx5;

/* loaded from: classes13.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f413742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f413743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413744f;

    public j0(sx5.a1 a1Var, double d17, double d18) {
        this.f413744f = a1Var;
        this.f413742d = d17;
        this.f413743e = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f413744f.u((int) this.f413742d, (int) this.f413743e);
    }
}
