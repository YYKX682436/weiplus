package xc5;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf3.a f453490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.l f453491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f453492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qf3.a aVar, xc5.l lVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453490d = aVar;
        this.f453491e = lVar;
        this.f453492f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.j(this.f453490d, this.f453491e, this.f453492f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc5.j jVar = (xc5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f453490d.h1(this.f453491e.f453522d, new java.util.ArrayList(this.f453492f));
        return jz5.f0.f302826a;
    }
}
