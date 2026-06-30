package fn4;

/* loaded from: classes15.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f264535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f264536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f264537g;

    public g1(fn4.i1 i1Var, java.lang.String str, long j17, long j18) {
        this.f264537g = i1Var;
        this.f264534d = str;
        this.f264535e = j17;
        this.f264536f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.i1 i1Var = this.f264537g;
        fn4.c1 c1Var = i1Var.f264557f.f264573b;
        if (c1Var != null) {
            c1Var.f(this.f264534d, this.f264535e, this.f264536f);
        }
        long j17 = this.f264535e;
        long j18 = (100 * j17) / this.f264536f;
        i1Var.f264557f.getClass();
        if (j18 >= 50 || j17 > 5242880) {
            i1Var.a();
        }
    }
}
