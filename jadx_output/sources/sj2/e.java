package sj2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj2.f f408383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f408384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sj2.f fVar, boolean z17) {
        super(0);
        this.f408383d = fVar;
        this.f408384e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f408384e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        sj2.f fVar = this.f408383d;
        fVar.P = valueOf;
        fg2.o0 o0Var = fVar.N;
        if (z17) {
            o0Var.f262189l.setVisibility(0);
            if (!o0Var.f262189l.f()) {
                o0Var.f262189l.g();
            }
        } else {
            o0Var.f262189l.setVisibility(4);
            o0Var.f262189l.n();
        }
        return jz5.f0.f302826a;
    }
}
