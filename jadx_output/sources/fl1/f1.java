package fl1;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.g1 f263760e;

    public f1(fl1.g1 g1Var, int i17) {
        this.f263760e = g1Var;
        this.f263759d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f263760e.setProgress(this.f263759d);
    }
}
