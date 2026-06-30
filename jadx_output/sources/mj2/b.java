package mj2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj2.e f327010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mj2.e eVar) {
        super(2);
        this.f327010d = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zh2.d dVar;
        ((java.lang.Boolean) obj).booleanValue();
        if (((java.lang.Boolean) obj2).booleanValue() && (dVar = this.f327010d.f327018i) != null) {
            dVar.a();
        }
        return jz5.f0.f302826a;
    }
}
