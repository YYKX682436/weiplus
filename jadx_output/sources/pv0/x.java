package pv0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.y f358557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f358558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw0.c f358559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pv0.y yVar, boolean z17, dw0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358557d = yVar;
        this.f358558e = z17;
        this.f358559f = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pv0.x(this.f358557d, this.f358558e, this.f358559f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pv0.x xVar = (pv0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pv0.m mVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pv0.y yVar = this.f358557d;
        if (yVar.f358565s.f358540a.get() <= 0) {
            boolean z17 = this.f358558e;
            dw0.c timbreInfo = this.f358559f;
            if (z17) {
                gw0.e eVar = yVar.f358561o;
                eVar.getClass();
                kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTimbreFailed: timbreID = ");
                com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = timbreInfo.f244086a;
                sb6.append(mJMaterialInfo.f48224b);
                com.tencent.mars.xlog.Log.i("TimbreMaterialViewModel", sb6.toString());
                com.tencent.maas.material.g gVar = mJMaterialInfo.f48223a;
                kotlin.jvm.internal.o.f(gVar, "getMaterialScene(...)");
                fv0.d c17 = fv0.e.c(gVar);
                dw0.d dVar = (dw0.d) eVar.a(c17).f475673a;
                kotlin.jvm.internal.o.g(dVar, "<this>");
                eVar.e(new zu0.k(c17.f266968d, new zu0.h(fv0.e.f(dVar, timbreInfo, zu0.i.f475677g))));
            } else {
                gw0.e eVar2 = yVar.f358561o;
                eVar2.getClass();
                kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
                com.tencent.maas.material.g gVar2 = timbreInfo.f244086a.f48223a;
                kotlin.jvm.internal.o.f(gVar2, "getMaterialScene(...)");
                fv0.d c18 = fv0.e.c(gVar2);
                dw0.d dVar2 = (dw0.d) eVar2.a(c18).f475673a;
                kotlin.jvm.internal.o.g(dVar2, "<this>");
                eVar2.e(new zu0.k(c18.f266968d, new zu0.h(fv0.e.f(dVar2, timbreInfo, zu0.i.f475676f))));
            }
            if (!yVar.m7() && (mVar = (pv0.m) yVar.f69240i) != null) {
                mVar.C();
            }
            if (yVar.f358565s.f358541b) {
                com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(yVar, false, 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
