package sf2;

/* loaded from: classes.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, java.lang.String str2) {
        super(2, continuation);
        this.f407038d = hVar;
        this.f407039e = str;
        this.f407040f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.a3(this.f407038d, continuation, this.f407039e, this.f407040f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.a3 a3Var = (sf2.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("FinderLiveRequestSongController", "FinderLiveKtvSearchMusicSmartBoxRequest fail: content " + this.f407039e + ", ID " + this.f407040f + ", " + ((xg2.a) ((xg2.b) this.f407038d).f454381b));
        return jz5.f0.f302826a;
    }
}
