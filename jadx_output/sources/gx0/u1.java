package gx0;

/* loaded from: classes5.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f277013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(gx0.u2 u2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277013e = u2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.u1(this.f277013e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277012d;
        gx0.u2 u2Var = this.f277013e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf R7 = u2Var.R7();
            this.f277012d = 1;
            if (gx0.bf.d7(R7, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
        if (n76 != null) {
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(n76, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
