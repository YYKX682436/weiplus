package sf2;

/* loaded from: classes.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, java.lang.String str2) {
        super(2, continuation);
        this.f407356d = hVar;
        this.f407357e = str;
        this.f407358f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.x2(this.f407356d, continuation, this.f407357e, this.f407358f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.x2 x2Var = (sf2.x2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("FinderLiveRequestSongController", "FinderLiveKtvSearchMusicRequest fail: realKey " + this.f407357e + ", ID " + this.f407358f + ", " + ((xg2.a) ((xg2.b) this.f407356d).f454381b));
        return jz5.f0.f302826a;
    }
}
