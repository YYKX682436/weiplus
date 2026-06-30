package v22;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f432862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v22.z zVar) {
        super(1);
        this.f432862d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        byte[] it = (byte[]) obj;
        kotlin.jvm.internal.o.g(it, "it");
        v22.z zVar = this.f432862d;
        v22.a0 a0Var = zVar.f432877h;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("videoDecoder");
            throw null;
        }
        a0Var.b(false);
        v22.f fVar = zVar.f432881l;
        if (fVar != null) {
            fVar.f432810b.post(new v22.d(fVar, it, -1L));
        }
        return jz5.f0.f302826a;
    }
}
