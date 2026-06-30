package cw0;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.NarrationSegment f222605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cw0.l0 l0Var, com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222604d = l0Var;
        this.f222605e = narrationSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw0.a0(this.f222604d, this.f222605e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cw0.a0 a0Var = (cw0.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cw0.l0 l0Var = this.f222604d;
        gx0.sc z76 = l0Var.z7();
        cw0.l0 l0Var2 = this.f222604d;
        cw0.g0 timbrePanelCallback = (cw0.g0) ((jz5.n) l0Var2.A).getValue();
        java.lang.String r17 = i65.a.r(l0Var2.getContext(), com.tencent.mm.R.string.f492499mu4);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        pv0.j jVar = pv0.j.f358532d;
        com.tencent.maas.moviecomposing.segments.NarrationSegment segment = this.f222605e;
        kotlin.jvm.internal.o.g(segment, "segment");
        kotlin.jvm.internal.o.g(timbrePanelCallback, "timbrePanelCallback");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_TIMBRE_ARGS", new pv0.h(segment, timbrePanelCallback, r17, jVar, false, true, false));
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(l0Var, z76, hashMap, null, null, null, 28, null);
        return jz5.f0.f302826a;
    }
}
