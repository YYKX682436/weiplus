package vo4;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f438627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vo4.i iVar) {
        super(1);
        this.f438627d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yz5.l lVar = this.f438627d.f438639j;
        if (lVar != null) {
            lVar.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
