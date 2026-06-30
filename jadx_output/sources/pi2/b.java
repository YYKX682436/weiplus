package pi2;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f354763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f354764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.a aVar) {
        super(2, continuation);
        this.f354763d = hVar;
        this.f354764e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi2.b(this.f354763d, continuation, this.f354764e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pi2.b bVar = (pi2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveMicPayExchang", "checkSaveLicenseState success: 1");
        ae2.in inVar = ae2.in.f3688a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveConfig", "set LIVE_PAY_MIC_VISITOR_LICENSE value:1");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_KNOW_LICENSE_PAY_VISITOR_MIC_INT_SYNC, 1);
        this.f354764e.invoke();
        return jz5.f0.f302826a;
    }
}
