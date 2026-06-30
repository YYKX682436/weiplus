package p05;

/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f350558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f350559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(int i17, int i18) {
        super(1);
        this.f350558d = i17;
        this.f350559e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        p05.q3 it = (p05.q3) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.f350657b == this.f350558d && it.f350658c == this.f350559e);
    }
}
