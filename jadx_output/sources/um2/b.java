package um2;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f428719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428719d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.b(this.f428719d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        um2.b bVar = (um2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("Finder.FinderLiveVisitorEndUIC", "requestLiveInfoForCoLiveInvitee failed: " + ((xg2.a) ((xg2.b) this.f428719d).f454381b).f454379a);
        return jz5.f0.f302826a;
    }
}
