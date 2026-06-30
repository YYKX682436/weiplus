package ku5;

/* loaded from: classes12.dex */
public class x implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f312624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312625b;

    public x(ku5.t0 t0Var, long j17, java.lang.String str) {
        this.f312624a = j17;
        this.f312625b = str;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        wu5.l a17 = nu5.a.a(runnable, this.f312624a, this.f312625b);
        if (runnable instanceof wu5.d) {
            ((wu5.d) runnable).f(a17);
        }
        return a17;
    }
}
