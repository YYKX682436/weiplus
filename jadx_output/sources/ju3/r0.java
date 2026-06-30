package ju3;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f302006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302006d = improveCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.r0(this.f302006d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", "record error");
        com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout = this.f302006d;
        return db5.e1.E(improveCameraKitPluginLayout.getContext(), i65.a.r(improveCameraKitPluginLayout.getContext(), com.tencent.mm.R.string.f492773ht1), "", i65.a.r(improveCameraKitPluginLayout.getContext(), com.tencent.mm.R.string.f492772ht0), false, new ju3.q0(improveCameraKitPluginLayout));
    }
}
