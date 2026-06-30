package of1;

/* loaded from: classes8.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344957f;

    public k2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f344957f = m2Var;
        this.f344955d = str;
        this.f344956e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f344957f.f344975e;
        if (nVar != null) {
            nVar.p0(this.f344955d, this.f344956e);
        }
    }
}
