package mx0;

/* loaded from: classes5.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f332261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332260e = shootComposingPluginLayout;
        this.f332261f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.q6(this.f332260e, this.f332261f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.q6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.r1 micMutePlugin;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332259d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            micMutePlugin = this.f332260e.getMicMutePlugin();
            this.f332259d = 1;
            micMutePlugin.getClass();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new mx0.q1(micMutePlugin, this.f332261f, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
