package fe2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f261509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe2.h f261510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.ArrayList arrayList, fe2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f261509d = arrayList;
        this.f261510e = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fe2.f(this.f261509d, this.f261510e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fe2.f fVar = (fe2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = (java.lang.String) kz5.n0.i0(this.f261509d);
        kotlin.jvm.internal.o.d(str);
        fe2.h hVar = this.f261510e;
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) hVar.P0(mm2.e0.class)).f328970m.getValue();
        if (kotlin.jvm.internal.o.b(qm1Var != null ? qm1Var.getString(1) : null, str)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxGroupHintPlugin", "share to same group, do nothing");
        } else {
            com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
            if (xVar.g(str) || xVar.h(str)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxGroupHintPlugin", "share to invalid group, do nothing");
            } else {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new fe2.g(hVar, str, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
