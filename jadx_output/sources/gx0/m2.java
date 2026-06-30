package gx0;

/* loaded from: classes5.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx0.f f276694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(cx0.f fVar, gx0.u2 u2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276694d = fVar;
        this.f276695e = u2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.m2(this.f276694d, this.f276695e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cx0.f fVar = this.f276694d;
        java.lang.String str = fVar.f224519b;
        gx0.u2 u2Var = this.f276695e;
        u2Var.R7().n7();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (n76 == null) {
            return f0Var;
        }
        n76.a();
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(n76, fVar.f224520c, false, 2, null);
        ow0.q0.f(u2Var, n76);
        ow0.q0.h(u2Var);
        return f0Var;
    }
}
