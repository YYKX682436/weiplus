package nu0;

/* loaded from: classes5.dex */
public final class e0 implements com.tencent.maas.imagestudio.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.imagestudio.h f339918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f339919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f339920c;

    public e0(com.tencent.maas.imagestudio.h hVar, nu0.q0 q0Var, int i17) {
        this.f339918a = hVar;
        this.f339919b = q0Var;
        this.f339920c = i17;
    }

    @Override // com.tencent.maas.imagestudio.h
    public final void a(java.lang.String str) {
        this.f339918a.a(str);
        if (str == null || str.length() == 0) {
            nu0.q0 q0Var = this.f339919b;
            ((java.util.ArrayList) q0Var.f340077t).remove(this.f339920c);
            nu0.q0.W6(q0Var);
        }
    }
}
