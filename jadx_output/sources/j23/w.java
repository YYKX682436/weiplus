package j23;

/* loaded from: classes12.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j23.y f297286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j23.y yVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f297286d = yVar;
        this.f297287e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j23.w(this.f297286d, this.f297287e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j23.w wVar = (j23.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        j23.y yVar = this.f297286d;
        t13.j jVar = yVar.f414558d;
        if (jVar != null) {
            java.lang.String str = this.f297287e;
            if (str == null) {
                str = "";
            }
            jVar.a(yVar, str, true);
        }
        return jz5.f0.f302826a;
    }
}
