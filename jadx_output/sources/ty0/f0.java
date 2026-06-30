package ty0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f422829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uz0.c f422830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f422831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0.f1 f1Var, uz0.c cVar, yz5.l lVar, n0.e5 e5Var, n0.e5 e5Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422829d = f1Var;
        this.f422830e = cVar;
        this.f422831f = lVar;
        this.f422832g = e5Var;
        this.f422833h = e5Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ty0.f0(this.f422829d, this.f422830e, this.f422831f, this.f422832g, this.f422833h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ty0.f0 f0Var = (ty0.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        uz0.s d17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.f422829d.a() && (d17 = this.f422830e.d()) != null) {
            java.lang.String musicID = ((com.tencent.maas.model.MJMusicInfo) ty0.z0.h(this.f422832g).get(d17.a())).getMusicID();
            kotlin.jvm.internal.o.f(musicID, "getMusicID(...)");
            this.f422831f.invoke(musicID);
            com.tencent.mars.xlog.Log.i("MusicSelectorExpand", "select to " + ((java.lang.String) this.f422833h.getValue()));
        }
        return jz5.f0.f302826a;
    }
}
