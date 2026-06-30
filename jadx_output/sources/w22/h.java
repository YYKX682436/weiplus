package w22;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.i f442543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w22.i iVar) {
        super(2);
        this.f442543d = iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(m17, "m");
        w22.i iVar = this.f442543d;
        iVar.f442545b.f24917g.set(m17);
        java.lang.Object obj3 = iVar.f442544a;
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) obj3).invalidate();
        return jz5.f0.f302826a;
    }
}
