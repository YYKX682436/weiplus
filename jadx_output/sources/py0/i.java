package py0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ py0.y f358991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz0.l f358992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(py0.y yVar, dz0.l lVar) {
        super(2);
        this.f358991d = yVar;
        this.f358992e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.l.d(this.f358991d.getMainScope(), null, null, new py0.h(this.f358992e, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), null), 3, null);
        return jz5.f0.f302826a;
    }
}
