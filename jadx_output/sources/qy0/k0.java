package qy0;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f367608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(yz5.a aVar, yz5.a aVar2, int i17) {
        super(2);
        this.f367606d = aVar;
        this.f367607e = aVar2;
        this.f367608f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f367608f | 1;
        qy0.a1.c(this.f367606d, this.f367607e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
