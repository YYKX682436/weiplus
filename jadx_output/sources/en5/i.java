package en5;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, int i17) {
        super(2);
        this.f255432d = str;
        this.f255433e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f255433e | 1;
        en5.l.b(this.f255432d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
