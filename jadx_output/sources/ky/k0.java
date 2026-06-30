package ky;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.h0 f313379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ky.h0 h0Var, int i17, int i18) {
        super(2);
        this.f313379d = h0Var;
        this.f313380e = i17;
        this.f313381f = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f313380e | 1;
        int i18 = this.f313381f;
        ky.l0.a(this.f313379d, (n0.o) obj, i17, i18);
        return jz5.f0.f302826a;
    }
}
