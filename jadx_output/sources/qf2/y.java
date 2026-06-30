package qf2;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f362649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f362650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xg2.h hVar, kotlin.coroutines.Continuation continuation, km2.q qVar, yz5.a aVar) {
        super(2, continuation);
        this.f362648d = hVar;
        this.f362649e = qVar;
        this.f362650f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.y(this.f362648d, continuation, this.f362649e, this.f362650f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.y yVar = (qf2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.q22 q22Var = (r45.q22) ((xg2.i) this.f362648d).f454393b;
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "apply pk response success apply_id: " + q22Var.getString(1));
        km2.q qVar = this.f362649e;
        if (qVar != null) {
            qVar.f309194y = q22Var.getString(1);
            qVar.z();
            yz5.a aVar2 = this.f362650f;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
