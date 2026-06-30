package fr5;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f265900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f265901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f265902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zq5.l f265903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f265904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zq5.l f265905i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f265906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f265907n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f265908o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j17, boolean z17, boolean z18, zq5.l lVar, boolean z19, zq5.l lVar2, boolean z27, boolean z28, boolean z29) {
        super(0);
        this.f265900d = j17;
        this.f265901e = z17;
        this.f265902f = z18;
        this.f265903g = lVar;
        this.f265904h = z19;
        this.f265905i = lVar2;
        this.f265906m = z27;
        this.f265907n = z28;
        this.f265908o = z29;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "ZoomableEngine. onEnd. velocity=" + zq5.m.e(this.f265900d) + ", longPressExecuted=" + this.f265901e + ", doubleTapExecuted=" + this.f265902f + ", doubleTapPressPoint=" + this.f265903g + ", oneFingerScaleExecuted=" + this.f265904h + ", twoFingerScaleCentroid=" + this.f265905i + ", supportOneFingerScale=" + this.f265906m + ", supportTwoFingerScale=" + this.f265907n + ", supportDrag=" + this.f265908o;
    }
}
