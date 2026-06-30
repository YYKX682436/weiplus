package x51;

/* loaded from: classes16.dex */
public class b0 implements p5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x51.d0 f451974a;

    public b0(x51.d0 d0Var) {
        this.f451974a = d0Var;
    }

    @Override // p5.h
    public java.lang.Object a(p5.m mVar) {
        java.lang.Object obj;
        synchronized (mVar.f351985a) {
            obj = mVar.f351987c;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            return (java.lang.String) this.f451974a.f451984a.call();
        }
        return null;
    }
}
