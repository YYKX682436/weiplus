package g0;

/* loaded from: classes14.dex */
public final class r extends g0.b implements t1.d, g0.e {

    /* renamed from: g, reason: collision with root package name */
    public g0.m f267372g;

    /* renamed from: h, reason: collision with root package name */
    public jz5.l f267373h;

    /* renamed from: i, reason: collision with root package name */
    public jz5.l f267374i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g0.e defaultParent) {
        super(defaultParent);
        kotlin.jvm.internal.o.g(defaultParent, "defaultParent");
    }

    public static final java.lang.Object b(g0.r rVar, jz5.l lVar, s1.z zVar, kotlin.coroutines.Continuation continuation) {
        rVar.f267374i = lVar;
        d1.g localRect = (d1.g) lVar.f302833d;
        g0.m mVar = rVar.f267372g;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("responder");
            throw null;
        }
        b0.h hVar = (b0.h) mVar;
        kotlin.jvm.internal.o.g(localRect, "localRect");
        p2.q qVar = hVar.f16308m;
        if (qVar == null) {
            throw new java.lang.IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        java.lang.Object f17 = kotlinx.coroutines.z0.f(new g0.q(rVar, hVar.a(localRect, qVar.f351396a), zVar, localRect, null), continuation);
        return f17 == pz5.a.f359186d ? f17 : jz5.f0.f302826a;
    }

    @Override // g0.e
    public java.lang.Object a(d1.g gVar, s1.z zVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object f17 = kotlinx.coroutines.z0.f(new g0.o(this, zVar, gVar, null), continuation);
        return f17 == pz5.a.f359186d ? f17 : jz5.f0.f302826a;
    }

    @Override // t1.d
    public t1.f getKey() {
        return g0.d.f267341a;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
    }
}
