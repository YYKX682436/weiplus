package jg3;

/* loaded from: classes12.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f299648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.d f299649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg3.f f299650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f299651g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg3.e f299652h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, gg3.d dVar, gg3.f fVar, gg3.c cVar, gg3.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299648d = str;
        this.f299649e = dVar;
        this.f299650f = fVar;
        this.f299651g = cVar;
        this.f299652h = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jg3.a(this.f299648d, this.f299649e, this.f299650f, this.f299651g, this.f299652h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jg3.a aVar = (jg3.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ui listener, id: ");
        sb6.append(this.f299648d);
        sb6.append(" , state: ");
        gg3.d dVar = this.f299649e;
        sb6.append(dVar.name());
        com.tencent.mars.xlog.Log.e("MediaGallery.ScopeVideoStateManager", sb6.toString());
        this.f299650f.E(this.f299651g, dVar, this.f299652h);
        return jz5.f0.f302826a;
    }
}
