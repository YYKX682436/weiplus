package mz2;

/* loaded from: classes9.dex */
public class q0 implements mz2.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz2.r0 f333169a;

    public q0(mz2.r0 r0Var, mz2.o0 o0Var) {
        this.f333169a = r0Var;
    }

    @Override // mz2.b2
    public void a(java.lang.String str) {
        this.f333169a.f333176h.post(new mz2.p0(this, str));
    }
}
