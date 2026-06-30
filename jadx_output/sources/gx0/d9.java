package gx0;

/* loaded from: classes5.dex */
public final class d9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f276324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f276325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(gx0.p9 p9Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276324d = p9Var;
        this.f276325e = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.d9(this.f276324d, this.f276325e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.d9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.p9 p9Var = this.f276324d;
        ex0.a0 a0Var = p9Var.u7().f276642r;
        ex0.o o17 = a0Var != null ? a0Var.o() : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        float f17 = this.f276325e;
        if (o17 != null) {
            o17.E(f17);
            p9Var.t7().c7();
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MovieMusicTipUIC", "changeBgmVolume: musicSegmentVM is null, value=" + f17 + " cached in picker, will be applied on commit");
        return f0Var;
    }
}
