package te2;

/* loaded from: classes3.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f418243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f418245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(xg2.h hVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Integer num, te2.p1 p1Var) {
        super(2, continuation);
        this.f418243d = hVar;
        this.f418244e = i17;
        this.f418245f = num;
        this.f418246g = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.n1(this.f418243d, continuation, this.f418244e, this.f418245f, this.f418246g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.n1 n1Var = (te2.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long j17 = ((r45.ke1) ((xg2.i) this.f418243d).f454393b).getLong(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sucess syncBGMAction action = ");
        sb6.append(this.f418244e);
        sb6.append(", curSongId:");
        sb6.append(this.f418245f);
        sb6.append("}, cur_volume:");
        te2.p1 p1Var = this.f418246g;
        sb6.append(((mm2.c1) p1Var.f418287e.a(mm2.c1.class)).E4);
        sb6.append(", timeStamp:");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", sb6.toString());
        p1Var.f().sendMessage(p1Var.f().obtainMessage(p1Var.f418295p, new java.lang.Long(j17)));
        return jz5.f0.f302826a;
    }
}
