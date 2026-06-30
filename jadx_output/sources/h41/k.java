package h41;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f278818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h41.x f278819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f278820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f278821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h41.x xVar, boolean z17, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278819e = xVar;
        this.f278820f = z17;
        this.f278821g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.k(this.f278819e, this.f278820f, this.f278821g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278818d;
        h41.x xVar = this.f278819e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h41.j jVar = xVar.f278885b;
            this.f278818d = 1;
            if (jVar.a(this.f278820f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.wechat.aff.ovc.a aVar2 = xVar.f278884a;
        if (aVar2 != null) {
            aVar2.Y(this.f278821g);
        }
        return jz5.f0.f302826a;
    }
}
