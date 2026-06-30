package vf3;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vf3.e f436394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vf3.g f436395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f436396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf3.g f436397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vf3.f f436398i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, vf3.e eVar, vf3.g gVar, gg3.c cVar, sf3.g gVar2, vf3.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436393d = str;
        this.f436394e = eVar;
        this.f436395f = gVar;
        this.f436396g = cVar;
        this.f436397h = gVar2;
        this.f436398i = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vf3.h(this.f436393d, this.f436394e, this.f436395f, this.f436396g, this.f436397h, this.f436398i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vf3.h hVar = (vf3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ui listener, id: ");
        sb6.append(this.f436393d);
        sb6.append(" , state: ");
        vf3.e eVar = this.f436394e;
        sb6.append(eVar.name());
        com.tencent.mars.xlog.Log.e("MediaGallery.ScopeLiveStateManager", sb6.toString());
        this.f436395f.A(this.f436396g, this.f436397h, eVar, this.f436398i);
        return jz5.f0.f302826a;
    }
}
