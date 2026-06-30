package yx;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f467077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f467079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f467080g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z0.t tVar, yz5.l lVar, int i17, int i18) {
        super(2);
        this.f467077d = tVar;
        this.f467078e = lVar;
        this.f467079f = i17;
        this.f467080g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f467079f | 1;
        yx.q0.b(this.f467077d, this.f467078e, (n0.o) obj, i17, this.f467080g);
        return jz5.f0.f302826a;
    }
}
