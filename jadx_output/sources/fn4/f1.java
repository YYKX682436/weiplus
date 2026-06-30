package fn4;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f264506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f264507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f264508g;

    public f1(fn4.i1 i1Var, java.lang.String str, long j17, long j18) {
        this.f264508g = i1Var;
        this.f264505d = str;
        this.f264506e = j17;
        this.f264507f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.c1 c1Var = this.f264508g.f264557f.f264573b;
        if (c1Var != null) {
            c1Var.onDataAvailable(this.f264505d, this.f264506e, this.f264507f);
        }
    }
}
