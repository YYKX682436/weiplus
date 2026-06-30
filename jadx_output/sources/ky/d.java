package ky;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.a f313338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ky.a aVar, int i17, int i18) {
        super(2);
        this.f313338d = aVar;
        this.f313339e = i17;
        this.f313340f = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f313339e | 1;
        int i18 = this.f313340f;
        ky.i.a(this.f313338d, (n0.o) obj, i17, i18);
        return jz5.f0.f302826a;
    }
}
