package nr0;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339086d = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.i(this.f339086d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zr0.p pVar = this.f339086d.f339122n;
        pVar.getClass();
        try {
            rs0.g gVar = rs0.i.f399296a;
            is0.c cVar = pVar.f475171n;
            if (cVar == null) {
                return null;
            }
            return gVar.v(cVar.f294395e, cVar.f294400m, cVar.f294401n);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Camera.CameraRenderPipeline", e17, "getCurrentFrame error", new java.lang.Object[0]);
            return null;
        }
    }
}
