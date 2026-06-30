package of1;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344948f;

    public j2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f344948f = m2Var;
        this.f344946d = str;
        this.f344947e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f344948f.f344975e;
        if (nVar != null) {
            nVar.s0(this.f344946d, this.f344947e);
        }
    }
}
