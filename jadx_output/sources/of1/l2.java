package of1;

/* loaded from: classes8.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344963f;

    public l2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f344963f = m2Var;
        this.f344961d = str;
        this.f344962e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f344963f.f344975e;
        if (nVar != null) {
            nVar.o0(this.f344961d, this.f344962e);
        }
    }
}
