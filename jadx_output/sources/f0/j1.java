package f0;

/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f258134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(int i17) {
        super(1);
        this.f258134d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f0.g1 it = (f0.g1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Integer.valueOf(it.f258093a - this.f258134d);
    }
}
