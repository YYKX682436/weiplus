package u1;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.o f423629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u1.o oVar) {
        super(0);
        this.f423629d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        u1.o oVar = this.f423629d;
        b1.f fVar = oVar.f423648h;
        if (fVar != null) {
            b1.b params = oVar.f423649i;
            b1.g gVar = (b1.g) fVar;
            kotlin.jvm.internal.o.g(params, "params");
            b1.c cVar = gVar.f16993d;
            cVar.getClass();
            cVar.f16990d = params;
            cVar.f16991e = null;
            gVar.f16994e.invoke(cVar);
            if (cVar.f16991e == null) {
                throw new java.lang.IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        oVar.f423650m = false;
        return jz5.f0.f302826a;
    }
}
