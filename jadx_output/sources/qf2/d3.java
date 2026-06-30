package qf2;

/* loaded from: classes.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f362334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(xg2.h hVar, kotlin.coroutines.Continuation continuation, az2.f fVar, qf2.q3 q3Var) {
        super(2, continuation);
        this.f362333d = hVar;
        this.f362334e = fVar;
        this.f362335f = q3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.d3(this.f362333d, continuation, this.f362334e, this.f362335f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.d3 d3Var = (qf2.d3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f362333d).f454381b;
        this.f362334e.b();
        com.tencent.mars.xlog.Log.i("FinderLivePayMicControl", "addPayPriceRequest fail : " + aVar2);
        rm0.j jVar = aVar2.f454379a;
        if (jVar != null && (str = jVar.f397426g) != null) {
            if (str.length() > 0) {
                db5.t7.makeText(this.f362335f.O6(), str, 0).show();
            }
        }
        return jz5.f0.f302826a;
    }
}
