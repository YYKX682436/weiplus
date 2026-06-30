package eg2;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f252585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252585d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg2.l0(this.f252585d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        eg2.l0 l0Var = (eg2.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveHDRequestHelper", "CGI failed: " + ((xg2.a) ((xg2.b) this.f252585d).f454381b));
        return jz5.f0.f302826a;
    }
}
