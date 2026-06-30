package xc5;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf3.a f453461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.l f453462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f453463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qf3.a aVar, xc5.l lVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453461d = aVar;
        this.f453462e = lVar;
        this.f453463f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.h(this.f453461d, this.f453462e, this.f453463f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc5.h hVar = (xc5.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((lf3.c0) this.f453461d).W6(this.f453462e.f453522d, new java.util.ArrayList(this.f453463f));
        return jz5.f0.f302826a;
    }
}
