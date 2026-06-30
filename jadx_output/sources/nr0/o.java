package nr0;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339097e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        nr0.o oVar = new nr0.o(this.f339097e, continuation);
        oVar.f339096d = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr0.o oVar = (nr0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "resume hash:" + ((kotlinx.coroutines.y0) this.f339096d).hashCode());
        nr0.x xVar = this.f339097e;
        xVar.f339127s = false;
        xVar.f339131w = true;
        return jz5.f0.f302826a;
    }
}
