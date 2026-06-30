package ew;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f256977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f256978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.l lVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256977d = lVar;
        this.f256978e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ew.h(this.f256977d, this.f256978e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ew.h hVar = (ew.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f256977d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(this.f256978e)));
        return jz5.f0.f302826a;
    }
}
