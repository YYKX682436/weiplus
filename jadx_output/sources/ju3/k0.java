package ju3;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f301962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f301963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f301964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(jz5.l lVar, com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301963e = lVar;
        this.f301964f = improveCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.k0(this.f301963e, this.f301964f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f301962d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout = this.f301964f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.os.Bundle bundle = (android.os.Bundle) this.f301963e.f302834e;
            boolean z17 = bundle != null ? bundle.getBoolean("camera_boolean") : false;
            improveCameraKitPluginLayout.getCameraSwitchPlugin().a(z17);
            nu3.i.f340218a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(z17 ? 1 : 2));
            yt3.b recordPlugin = improveCameraKitPluginLayout.getRecordPlugin();
            if ((recordPlugin == null || recordPlugin.c()) ? false : true) {
                improveCameraKitPluginLayout.getSwitchFlashPlugin().f465345d.setVisibility(z17 ? 4 : 0);
                if (z17) {
                    yt3.a4 switchFlashPlugin = improveCameraKitPluginLayout.getSwitchFlashPlugin();
                    this.f301962d = 1;
                    switchFlashPlugin.getClass();
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new yt3.z3(switchFlashPlugin, false, null), this);
                    if (g17 != aVar) {
                        g17 = f0Var;
                    }
                    if (g17 == aVar) {
                        return aVar;
                    }
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        improveCameraKitPluginLayout.getCameraUsage().e(false);
        return f0Var;
    }
}
