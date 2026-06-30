package yg;

/* loaded from: classes7.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f462047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i17) {
        super(1);
        this.f462047d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gh.x it = (gh.x) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ae.a aVar = ((ae.o) it).f3363a;
        if (((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F()).H0() || ((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F()).isRunning()) {
            aVar.L0(this.f462047d);
        }
        return jz5.f0.f302826a;
    }
}
