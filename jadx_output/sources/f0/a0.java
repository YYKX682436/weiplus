package f0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.b0 f257996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f257997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f257998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0.b0 b0Var, int i17, int i18) {
        super(2);
        this.f257996d = b0Var;
        this.f257997e = i17;
        this.f257998f = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f257998f | 1;
        this.f257996d.a(this.f257997e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
