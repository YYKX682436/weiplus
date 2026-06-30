package s1;

/* loaded from: classes14.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f401984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f401985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f401987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(z0.t tVar, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f401984d = tVar;
        this.f401985e = pVar;
        this.f401986f = i17;
        this.f401987g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f401986f | 1;
        s1.f2.b(this.f401984d, this.f401985e, (n0.o) obj, i17, this.f401987g);
        return jz5.f0.f302826a;
    }
}
