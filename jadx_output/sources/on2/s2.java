package on2;

/* loaded from: classes3.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(java.lang.String str) {
        super(1);
        this.f347009d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        km2.z item = (km2.z) obj;
        kotlin.jvm.internal.o.g(item, "item");
        r45.cz1 cz1Var = item.f309232d;
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(cz1Var != null ? cz1Var.getString(0) : null, this.f347009d));
    }
}
