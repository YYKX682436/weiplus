package ku5;

/* loaded from: classes12.dex */
public class i0 implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f312588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312589b;

    public i0(ku5.t0 t0Var, long j17, java.lang.String str) {
        this.f312588a = j17;
        this.f312589b = str;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        java.util.concurrent.Callable callable = (java.util.concurrent.Callable) obj;
        wu5.l b17 = nu5.a.b(callable, this.f312588a, this.f312589b);
        if (callable instanceof wu5.d) {
            ((wu5.d) callable).f(b17);
        }
        return b17;
    }
}
