package sf2;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407254d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.r(this.f407254d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.r rVar = (sf2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "searchAddPanelKtvMusic fail: " + ((xg2.a) ((xg2.b) this.f407254d).f454381b));
        return jz5.f0.f302826a;
    }
}
