package mx0;

/* loaded from: classes5.dex */
public final class u4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f332372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.r3 f332373g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, mx0.r3 r3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332371e = shootComposingPluginLayout;
        this.f332372f = z17;
        this.f332373g = r3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.u4(this.f332371e, this.f332372f, this.f332373g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.u4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.l1 materialImportPreviewUIPlugin;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332370d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332371e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            shootComposingPluginLayout.z0();
            if (!this.f332372f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "reportEnterImportPreviewFailed");
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCAssetGenerate", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 2);
                db5.t7.i(shootComposingPluginLayout.getContext(), j65.q.b(shootComposingPluginLayout.getContext(), com.tencent.mm.R.string.m27), 0);
                shootComposingPluginLayout.g1(false, true);
                return jz5.f0.f302826a;
            }
            shootComposingPluginLayout.U1 = this.f332373g;
            this.f332370d = 1;
            obj = shootComposingPluginLayout.f69557v.X(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        materialImportPreviewUIPlugin = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
        materialImportPreviewUIPlugin.d(booleanValue);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "reportEnterImportPreviewCompleted");
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCAssetGenerate", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0);
        return jz5.f0.f302826a;
    }
}
