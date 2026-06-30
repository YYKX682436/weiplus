package yx;

/* loaded from: classes14.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy.m f467016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.y f467017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ay.v f467018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f467019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f467020h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(jy.m mVar, xx.y yVar, ay.v vVar, int i17, int i18) {
        super(2);
        this.f467016d = mVar;
        this.f467017e = yVar;
        this.f467018f = vVar;
        this.f467019g = i17;
        this.f467020h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        yx.q0.d(this.f467016d, this.f467017e, this.f467018f, (n0.o) obj, this.f467019g | 1, this.f467020h);
        return jz5.f0.f302826a;
    }
}
