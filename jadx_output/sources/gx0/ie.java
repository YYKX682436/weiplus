package gx0;

/* loaded from: classes5.dex */
public final class ie extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f276547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(gx0.bf bfVar, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276546e = bfVar;
        this.f276547f = timeline;
        this.f276548g = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ie(this.f276546e, this.f276547f, this.f276548g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ie) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276545d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf bfVar = this.f276546e;
            this.f276545d = 1;
            if (bfVar.O6(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.f276546e.E = this.f276547f;
                gx0.bf bfVar2 = this.f276546e;
                gx0.fd fdVar = gx0.fd.f276431g;
                bfVar2.f276256w = fdVar;
                bfVar2.f276254u.postValue(fdVar);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.f276546e.B == null) {
            kotlinx.coroutines.l.f(null, new gx0.he(this.f276546e, null), 1, null);
        } else {
            com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f276546e.B;
            if (playbackSession != null) {
                playbackSession.release();
            }
        }
        gx0.bf bfVar3 = this.f276546e;
        gx0.fd fdVar2 = gx0.fd.f276430f;
        bfVar3.f276256w = fdVar2;
        bfVar3.f276254u.postValue(fdVar2);
        this.f276546e.f276257x.postValue(this.f276547f.l());
        gx0.bf bfVar4 = this.f276546e;
        com.tencent.maas.moviecomposing.Timeline timeline = this.f276547f;
        com.tencent.maas.model.time.MJTime mJTime = this.f276548g;
        this.f276545d = 2;
        bfVar4.getClass();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.ne(timeline, mJTime, bfVar4, null), this);
        if (g17 != aVar) {
            g17 = f0Var;
        }
        if (g17 == aVar) {
            return aVar;
        }
        this.f276546e.E = this.f276547f;
        gx0.bf bfVar22 = this.f276546e;
        gx0.fd fdVar3 = gx0.fd.f276431g;
        bfVar22.f276256w = fdVar3;
        bfVar22.f276254u.postValue(fdVar3);
        return f0Var;
    }
}
