package t56;

/* loaded from: classes16.dex */
public class f0 implements r56.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p56.p f415873a;

    public f0(t56.l0 l0Var, p56.p pVar) {
        this.f415873a = pVar;
    }

    @Override // r56.e
    public java.lang.Object call(java.lang.Object obj) {
        try {
            return new p56.h(new t56.e0(this, (t56.k0) obj));
        } catch (java.lang.NullPointerException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            x56.m.a(th6);
            int i17 = p56.h.f352092b;
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th6);
            throw nullPointerException;
        }
    }
}
