package wo3;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f448212d;

    public r(wo3.c0 c0Var, boolean z17) {
        this.f448212d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new wo3.c(this.f448212d));
    }
}
