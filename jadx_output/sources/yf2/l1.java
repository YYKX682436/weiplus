package yf2;

/* loaded from: classes3.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f461742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f461743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(yf2.m1 m1Var, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461742d = m1Var;
        this.f461743e = viewGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.l1(this.f461742d, this.f461743e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yf2.l1 l1Var = (yf2.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yf2.m1 m1Var = this.f461742d;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.c1) m1Var.business(mm2.c1.class)).H4;
        android.view.ViewGroup viewGroup = this.f461743e;
        kotlin.jvm.internal.o.e(viewGroup, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        liveMutableData.observe((com.tencent.mm.plugin.finder.live.view.k0) viewGroup, new yf2.k1(m1Var));
        return jz5.f0.f302826a;
    }
}
