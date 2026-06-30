package go0;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f273743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(go0.f0 f0Var, boolean z17) {
        super(0);
        this.f273742d = f0Var;
        this.f273743e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f1 f1Var = this.f273742d.f273767p;
        if (f1Var != null) {
            f1Var.m(this.f273743e);
        }
        return jz5.f0.f302826a;
    }
}
