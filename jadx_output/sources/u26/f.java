package u26;

/* loaded from: classes14.dex */
public final class f extends kotlinx.coroutines.i {

    /* renamed from: d, reason: collision with root package name */
    public final u26.s0 f424149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.k f424150e;

    public f(u26.k kVar, u26.s0 s0Var) {
        this.f424150e = kVar;
        this.f424149d = s0Var;
    }

    @Override // kotlinx.coroutines.o
    public void a(java.lang.Throwable th6) {
        if (this.f424149d.q()) {
            this.f424150e.getClass();
        }
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "RemoveReceiveOnCancel[" + this.f424149d + ']';
    }
}
