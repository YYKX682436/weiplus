package id2;

/* loaded from: classes3.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f290759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r45.nw1 nw1Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290759e = nw1Var;
        this.f290760f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.q2(this.f290759e, this.f290760f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.q2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290758d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.i72 i72Var = (r45.i72) this.f290759e.getCustom(44);
            long j17 = i72Var != null ? i72Var.getLong(12) : 0L;
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            this.f290758d = 1;
            obj = ((c61.l7) b6Var).pl(j17, null, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        if (finderObject != null) {
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "Attempting to jump to replay feed");
            i95.m c17 = i95.n0.c(com.tencent.mm.feature.finder.live.v4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            s40.w0.ba((s40.w0) c17, this.f290760f, finderObject, false, null, 12, null);
        } else {
            com.tencent.mars.xlog.Log.w("FinderLivePersonalCente", "Failed to obtain jumpReplayFinderObject");
        }
        return jz5.f0.f302826a;
    }
}
