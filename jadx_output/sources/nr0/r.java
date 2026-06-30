package nr0;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339103e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.r(this.f339103e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339102d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        nr0.x xVar = this.f339103e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xVar.f339123o = rs0.g.n(rs0.i.f399296a, null, null, 1, 1, null, 16, null);
            zr0.p pVar = xVar.f339122n;
            pVar.f475166f = xVar.f339123o;
            this.f339102d = 1;
            pVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraRenderPipeline", "setUpInGLEnv");
            pVar.f475167g = new os0.f(0, 0, 0, 0, 2, 2);
            pVar.f475168h = new os0.c(0, 0, 0, 0, 2, 2);
            pVar.f475169i = new os0.e(0, 0, 0, 0, 0, 0, 48, null);
            nr0.c cVar = pVar.f475170m;
            if (cVar == null || (obj2 = cVar.a(this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.coroutines.Continuation continuation = xVar.f339125q;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        }
        xVar.f339125q = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "gl env set up finish,thread-id:[" + android.os.Process.myTid() + "] name:" + java.lang.Thread.currentThread().getName());
        return f0Var;
    }
}
