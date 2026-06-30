package e22;

/* loaded from: classes.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f246747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.l lVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f246746d = lVar;
        this.f246747e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e22.w(this.f246746d, this.f246747e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        e22.w wVar = (e22.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.l lVar = this.f246746d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(this.f246747e));
        }
        return jz5.f0.f302826a;
    }
}
