package zt5;

/* loaded from: classes15.dex */
public class m implements zt5.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f475607a = false;

    @Override // zt5.n
    public void a() {
        zt5.h.b("Soter.SoterDelegate", "soter: triggered OOM. using default imp, just record the flag", new java.lang.Object[0]);
        this.f475607a = true;
    }

    @Override // zt5.n
    public boolean b() {
        return this.f475607a;
    }

    @Override // zt5.n
    public void reset() {
        this.f475607a = false;
    }
}
