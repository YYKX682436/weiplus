package fo5;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265067d = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.q(this.f265067d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.q qVar = (fo5.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "findBluetoothDeviceToConnect");
        fo5.r0 r0Var = this.f265067d;
        java.util.Iterator it = r0Var.b().iterator();
        while (it.hasNext()) {
            er4.c cVar = (er4.c) it.next();
            if (cVar.b() == er4.d.BLUETOOTH) {
                r0Var.u();
                int i17 = cVar.b().f256071d;
                r0Var.f265088g.f().getClass();
                ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).qj(i17, true);
            }
        }
        return jz5.f0.f302826a;
    }
}
