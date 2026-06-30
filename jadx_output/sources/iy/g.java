package iy;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.a f295686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f295688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f.r f295689g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f295690h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ky.a aVar, android.content.Context context, yz5.a aVar2, f.r rVar, yz5.a aVar3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295686d = aVar;
        this.f295687e = context;
        this.f295688f = aVar2;
        this.f295689g = rVar;
        this.f295690h = aVar3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iy.g(this.f295686d, this.f295687e, this.f295688f, this.f295689g, this.f295690h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        iy.g gVar = (iy.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f295686d.a() != ky.m0.f313392d) {
            ly.a aVar2 = ly.a.f322166a;
            android.content.Context context = this.f295687e;
            kotlin.jvm.internal.o.g(context, "context");
            if (b3.l.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
                ly.a.a(aVar2, this.f295687e, 0L, 200, 2, null);
                this.f295688f.invoke();
            } else {
                this.f295689g.a("android.permission.RECORD_AUDIO", null);
            }
        } else {
            this.f295690h.invoke();
        }
        return jz5.f0.f302826a;
    }
}
