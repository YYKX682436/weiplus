package of1;

/* loaded from: classes8.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344935f;

    public h2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f344935f = m2Var;
        this.f344933d = str;
        this.f344934e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f344935f.f344975e;
        if (nVar != null) {
            nVar.Q(this.f344933d, this.f344934e);
        }
    }
}
