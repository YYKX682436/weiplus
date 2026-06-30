package xs2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f456344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xs2.m mVar) {
        super(0);
        this.f456344d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xs2.m mVar = this.f456344d;
        xs2.o oVar = mVar.f456351f;
        if (oVar != null) {
            ((xs2.e) oVar).n();
        }
        pm0.v.V(200L, new xs2.j(mVar));
        return jz5.f0.f302826a;
    }
}
