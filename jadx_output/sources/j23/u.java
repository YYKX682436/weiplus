package j23;

/* loaded from: classes12.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t13.j f297281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j23.y f297282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t13.j jVar, j23.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f297281d = jVar;
        this.f297282e = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j23.u(this.f297281d, this.f297282e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j23.u uVar = (j23.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t13.j jVar = this.f297281d;
        if (jVar != null) {
            j23.y yVar = this.f297282e;
            java.lang.String str = yVar.f297294m;
            if (str == null) {
                str = "";
            }
            jVar.a(yVar, str, true);
        }
        return jz5.f0.f302826a;
    }
}
