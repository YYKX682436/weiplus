package te3;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI f418589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f418590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418589d = magicSnsTimelineDemoUI;
        this.f418590e = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te3.m(this.f418589d, this.f418590e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te3.m mVar = (te3.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI = this.f418589d;
        com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI.T6(magicSnsTimelineDemoUI, magicSnsTimelineDemoUI.f148140i);
        this.f418590e.setValue(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
