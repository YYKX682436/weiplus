package te2;

/* loaded from: classes.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f418218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f418220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f418221g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(xg2.h hVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Integer num, int i18) {
        super(2, continuation);
        this.f418218d = hVar;
        this.f418219e = i17;
        this.f418220f = num;
        this.f418221g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.m1(this.f418218d, continuation, this.f418219e, this.f418220f, this.f418221g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.m1 m1Var = (te2.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f418218d).f454381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("failed syncBGMAction action = ");
        sb6.append(this.f418219e);
        sb6.append(", curSongId:");
        sb6.append(this.f418220f);
        sb6.append("},errCode:");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397425f) : null);
        sb6.append(", cur_volume:");
        sb6.append(this.f418221g);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", sb6.toString());
        return jz5.f0.f302826a;
    }
}
