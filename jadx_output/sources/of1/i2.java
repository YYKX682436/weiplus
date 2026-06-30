package of1;

/* loaded from: classes8.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344942f;

    public i2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f344942f = m2Var;
        this.f344940d = str;
        this.f344941e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f344942f.f344975e;
        if (nVar != null) {
            nVar.P(this.f344940d, this.f344941e);
        }
    }
}
