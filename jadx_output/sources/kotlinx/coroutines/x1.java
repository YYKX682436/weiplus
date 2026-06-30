package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class x1 extends kotlinx.coroutines.z1 {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.q f310697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.b2 f310698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(kotlinx.coroutines.b2 b2Var, long j17, kotlinx.coroutines.q qVar) {
        super(j17);
        this.f310698g = b2Var;
        this.f310697f = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((kotlinx.coroutines.r) this.f310697f).u(this.f310698g, jz5.f0.f302826a);
    }

    @Override // kotlinx.coroutines.z1
    public java.lang.String toString() {
        return super.toString() + this.f310697f;
    }
}
