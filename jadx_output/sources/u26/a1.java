package u26;

/* loaded from: classes14.dex */
public final class a1 extends u26.z0 {

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f424136i;

    public a1(java.lang.Object obj, kotlinx.coroutines.q qVar, yz5.l lVar) {
        super(obj, qVar);
        this.f424136i = lVar;
    }

    @Override // kotlinx.coroutines.internal.t
    public boolean q() {
        if (!super.q()) {
            return false;
        }
        z();
        return true;
    }

    @Override // u26.w0
    public void z() {
        oz5.l lVar = ((kotlinx.coroutines.r) this.f424203h).f310577e;
        kotlinx.coroutines.internal.v0 a17 = kotlinx.coroutines.internal.d0.a(this.f424136i, this.f424202g, null);
        if (a17 != null) {
            kotlinx.coroutines.u0.a(lVar, a17);
        }
    }
}
