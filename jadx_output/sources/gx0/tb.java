package gx0;

/* loaded from: classes5.dex */
public final class tb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cx0.f f276989f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(gx0.ac acVar, cx0.f fVar, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276988e = acVar;
        this.f276989f = fVar;
        this.f276990g = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.tb(this.f276988e, this.f276989f, this.f276990g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.tb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276987d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            gx0.sb sbVar = new gx0.sb(this.f276990g, null);
            this.f276987d = 1;
            if (kotlinx.coroutines.l.g(p0Var, sbVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gx0.ac acVar = this.f276988e;
        acVar.c8().n7();
        acVar.A7().a();
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(acVar.A7(), this.f276989f.f224520c, false, 2, null);
        acVar.R7();
        acVar.i8();
        return jz5.f0.f302826a;
    }
}
