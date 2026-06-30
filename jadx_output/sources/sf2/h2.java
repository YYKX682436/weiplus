package sf2;

/* loaded from: classes.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407158d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.h2(this.f407158d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.h2 h2Var = (sf2.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("FinderLiveRequestSongController", "FinderLiveKtvGetSongSungListRequest fail: " + ((xg2.a) ((xg2.b) this.f407158d).f454381b));
        return jz5.f0.f302826a;
    }
}
