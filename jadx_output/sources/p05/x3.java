package p05;

/* loaded from: classes14.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f350731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(p05.l4 l4Var) {
        super(1);
        this.f350731d = l4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        kotlin.jvm.internal.o.g(it, "it");
        p05.l4 l4Var = this.f350731d;
        os0.a aVar = l4Var.f350605r;
        l4Var.p(it, aVar.f348015x, aVar.f348016y);
        return jz5.f0.f302826a;
    }
}
