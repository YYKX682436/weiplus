package ju3;

/* loaded from: classes10.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu3.b f301936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f301937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(mu3.b bVar, boolean z17) {
        super(0);
        this.f301936d = bVar;
        this.f301937e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.l4 l4Var;
        mu3.b bVar = this.f301936d;
        if (bVar != null && (l4Var = bVar.f331398v) != null) {
            l4Var.B(this.f301937e, 100);
        }
        return jz5.f0.f302826a;
    }
}
