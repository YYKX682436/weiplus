package tf3;

/* loaded from: classes12.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.k f418942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.l f418943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.g f418944g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f418945h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, sf3.k kVar, sf3.l lVar, sf3.g gVar, mf3.k kVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418941d = str;
        this.f418942e = kVar;
        this.f418943f = lVar;
        this.f418944g = gVar;
        this.f418945h = kVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tf3.a(this.f418941d, this.f418942e, this.f418943f, this.f418944g, this.f418945h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        tf3.a aVar = (tf3.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ui listener, id: ");
        sb6.append(this.f418941d);
        sb6.append(" , state: ");
        sf3.k kVar = this.f418942e;
        sb6.append(kVar.name());
        com.tencent.mars.xlog.Log.e("MediaGallery.ScopeImageStateManager", sb6.toString());
        this.f418943f.f(kVar, this.f418944g, this.f418945h.getLevel());
        return jz5.f0.f302826a;
    }
}
