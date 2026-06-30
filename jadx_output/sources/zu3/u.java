package zu3;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.v f475832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zu3.v vVar) {
        super(2);
        this.f475832d = vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(m17, "m");
        zu3.v vVar = this.f475832d;
        vVar.getTouchTracker().f24917g.set(m17);
        vVar.postInvalidate();
        return jz5.f0.f302826a;
    }
}
