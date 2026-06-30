package ku5;

/* loaded from: classes12.dex */
public class d0 implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f312562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312563b;

    public d0(ku5.t0 t0Var, long j17, java.lang.String str) {
        this.f312562a = j17;
        this.f312563b = str;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        java.util.concurrent.Callable callable = (java.util.concurrent.Callable) obj;
        wu5.l b17 = nu5.a.b(callable, this.f312562a, this.f312563b);
        if (callable instanceof wu5.d) {
            ((wu5.d) callable).f(b17);
        }
        return b17;
    }
}
