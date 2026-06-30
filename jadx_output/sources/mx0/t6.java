package mx0;

/* loaded from: classes5.dex */
public final class t6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332352d = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.t6(this.f332352d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.t6 t6Var = (mx0.t6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.g3 recordPlugin;
        mx0.g3 recordPlugin2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332352d;
        recordPlugin = shootComposingPluginLayout.getRecordPlugin();
        boolean z17 = recordPlugin.f331993g.f69511q;
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingPluginLayout", "CameraStatus trigger CameraGrab ,isRecording:" + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "CameraGrab and StopRecord");
            recordPlugin2 = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin2.getClass();
        }
        return jz5.f0.f302826a;
    }
}
