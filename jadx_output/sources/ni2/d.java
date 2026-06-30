package ni2;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f337267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.g f337268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xg2.h hVar, kotlin.coroutines.Continuation continuation, ni2.g gVar) {
        super(2, continuation);
        this.f337267d = hVar;
        this.f337268e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.d(this.f337267d, continuation, this.f337268e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ni2.d dVar = (ni2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLivePayMicLisence", "saveLicenseState success: 1");
        ae2.in inVar = ae2.in.f3688a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveConfig", "set LIVE_PAY_MIC_LICENSE value:1");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_KNOW_LICENSE_PAY_MIC_INT_SYNC, 1);
        ni2.g gVar = this.f337268e;
        gVar.a();
        gVar.f337298h.invoke();
        return jz5.f0.f302826a;
    }
}
