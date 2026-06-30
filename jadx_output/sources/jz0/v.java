package jz0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f302626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, az0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f302625d = maasFakeVideoPlayUIC;
        this.f302626e = a0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz0.v vVar = new jz0.v(this.f302625d, this.f302626e, (kotlin.coroutines.Continuation) obj3);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC = this.f302625d;
        com.tencent.mars.xlog.Log.i(maasFakeVideoPlayUIC.f69818d, "performCreation onCompletion");
        this.f302626e.f15309a.setOnPlaybackMediaTimeDidChange(maasFakeVideoPlayUIC.f69829r);
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC2 = this.f302625d;
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.Q6(maasFakeVideoPlayUIC2, null, null, false, maasFakeVideoPlayUIC2.f69832u, 7, null);
        return jz5.f0.f302826a;
    }
}
