package n81;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f335625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.Set set) {
        super(1);
        this.f335625d = set;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n81.e it = (n81.e) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(!this.f335625d.contains(it.f335614a));
    }
}
