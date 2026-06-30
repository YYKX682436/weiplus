package e0;

/* loaded from: classes14.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.r f245531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f245532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f245533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f245534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.compose.foundation.lazy.layout.r rVar, long j17, int i17, int i18) {
        super(3);
        this.f245531d = rVar;
        this.f245532e = j17;
        this.f245533f = i17;
        this.f245534g = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        yz5.l placement = (yz5.l) obj3;
        kotlin.jvm.internal.o.g(placement, "placement");
        int i17 = intValue + this.f245533f;
        long j17 = this.f245532e;
        return ((androidx.compose.foundation.lazy.layout.s) this.f245531d).W(p2.d.e(j17, i17), p2.d.d(j17, intValue2 + this.f245534g), kz5.q0.f314001d, placement);
    }
}
