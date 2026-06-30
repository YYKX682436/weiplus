package mw4;

/* loaded from: classes7.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f331793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mw4.w f331794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlin.jvm.internal.h0 h0Var, mw4.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331793d = h0Var;
        this.f331794e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mw4.t(this.f331793d, this.f331794e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mw4.t tVar = (mw4.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f331793d.f310123d = this.f331794e.c().f181916a.getUrl();
        return jz5.f0.f302826a;
    }
}
