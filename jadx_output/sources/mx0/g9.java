package mx0;

/* loaded from: classes5.dex */
public final class g9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f332013g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332011e = shootComposingPluginLayout;
        this.f332012f = i17;
        this.f332013g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.g9(this.f332011e, this.f332012f, this.f332013g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.g9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332010d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332011e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            mx0.d9 d9Var = new mx0.d9(shootComposingPluginLayout, null);
            this.f332010d = 1;
            if (kotlinx.coroutines.l.g(g3Var, d9Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
        int i18 = this.f332012f;
        boolean z17 = this.f332013g;
        com.tencent.maas.camerafun.MJAuditCaptureSettings a17 = ts2.a.a(ts2.a.f421620a, shootComposingPluginLayout.R, false, 2, null);
        kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.y5(b8Var, new mx0.f9(shootComposingPluginLayout), z17, i18, a17, null), 3, null);
        return jz5.f0.f302826a;
    }
}
