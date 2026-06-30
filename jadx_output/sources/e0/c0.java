package e0;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.s f245516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f245518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0.s sVar, e0.f1 f1Var, int i17) {
        super(2);
        this.f245516d = sVar;
        this.f245517e = f1Var;
        this.f245518f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f245518f | 1;
        e0.g0.b(this.f245516d, this.f245517e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
