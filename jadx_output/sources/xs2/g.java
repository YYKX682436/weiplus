package xs2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f456329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xs2.m mVar) {
        super(0);
        this.f456329d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xs2.o oVar = this.f456329d.f456351f;
        if (oVar != null) {
            xs2.e eVar = (xs2.e) oVar;
            if (eVar.f456319f) {
                java.lang.String j17 = eVar.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resume: ");
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) eVar.f456315b.a(mm2.c1.class)).f328846n;
                sb6.append(finderObject != null ? cm2.a.f43328a.x(finderObject, -1) : null);
                com.tencent.mars.xlog.Log.i(j17, sb6.toString());
                if (!eVar.i().isPlaying()) {
                    eVar.i().f438852d.resume();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
