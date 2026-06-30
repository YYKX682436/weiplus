package ed1;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f251234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.Set set) {
        super(1);
        this.f251234d = set;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f251234d.add(it);
        return jz5.f0.f302826a;
    }
}
