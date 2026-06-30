package u1;

/* loaded from: classes14.dex */
public final class x1 extends u1.p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(u1.c1 layoutNodeWrapper, p1.z modifier) {
        super(layoutNodeWrapper, modifier);
        kotlin.jvm.internal.o.g(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.o.g(modifier, "modifier");
    }

    @Override // u1.p0
    public void a() {
        this.f423657g = true;
        z0.t tVar = this.f423655e;
        ((p1.z) tVar).N().f350925d = this.f423654d;
        ((p1.z) tVar).N().f350926e = true;
    }

    @Override // u1.p0
    public void b() {
        this.f423657g = false;
        ((p1.z) this.f423655e).N().f350926e = false;
    }

    public final boolean c() {
        p1.y N = ((p1.z) this.f423655e).N();
        N.getClass();
        if (!(N instanceof p1.f0)) {
            u1.x1 x1Var = (u1.x1) this.f423656f;
            if (!(x1Var != null ? x1Var.c() : false)) {
                return false;
            }
        }
        return true;
    }
}
