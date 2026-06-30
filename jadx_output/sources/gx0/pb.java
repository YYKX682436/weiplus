package gx0;

/* loaded from: classes5.dex */
public final class pb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276839d;

    /* renamed from: e, reason: collision with root package name */
    public int f276840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.q f276841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276842g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(ex0.q qVar, gx0.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276841f = qVar;
        this.f276842g = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.pb(this.f276841f, this.f276842g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime k17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276840e;
        gx0.ac acVar = this.f276842g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ex0.q qVar = this.f276841f;
            k17 = qVar.k();
            acVar.c8().o7(qVar.l(), true);
            gx0.bf c86 = acVar.c8();
            this.f276839d = k17;
            this.f276840e = 1;
            if (gx0.bf.d7(c86, null, k17, false, this, 5, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            k17 = (com.tencent.maas.model.time.MJTime) this.f276839d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.maas.model.time.MJTime mJTime = k17;
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(acVar.A7(), mJTime, false, 2, null);
        gx0.bf c87 = acVar.c8();
        this.f276839d = null;
        this.f276840e = 2;
        if (gx0.bf.r7(c87, false, mJTime, 1, false, null, this, 25, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
