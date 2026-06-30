package r01;

/* loaded from: classes8.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j16 f368190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r01.r1 f368192f;

    public q1(r01.r1 r1Var, r45.j16 j16Var, java.lang.String str) {
        this.f368192f = r1Var;
        this.f368190d = j16Var;
        this.f368191e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f368192f.e(this.f368190d, this.f368191e);
        this.f368192f.b(this.f368191e, 12, 0, 0.0f, 0.0f, 0, null, 0, this.f368190d, null);
        r01.q3.Zi().f368222d = "";
    }
}
