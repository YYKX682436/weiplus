package cw0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(cw0.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222629d = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw0.f0(this.f222629d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cw0.f0 f0Var = (cw0.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(this.f222629d.A7(), false, 1, null);
        return jz5.f0.f302826a;
    }
}
