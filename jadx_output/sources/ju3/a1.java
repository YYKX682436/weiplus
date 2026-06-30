package ju3;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout f301861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f301862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout improveShieldCameraKitPluginLayout, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301861d = improveShieldCameraKitPluginLayout;
        this.f301862e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.a1(this.f301861d, this.f301862e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ju3.a1 a1Var = (ju3.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yt3.y3 cameraSwitchPlugin = this.f301861d.getCameraSwitchPlugin();
        boolean z17 = this.f301862e;
        cameraSwitchPlugin.a(z17);
        nu3.i.f340218a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(z17 ? 1 : 2));
        return jz5.f0.f302826a;
    }
}
