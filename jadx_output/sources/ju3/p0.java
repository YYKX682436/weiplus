package ju3;

/* loaded from: classes10.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f301989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301989d = improveCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.p0(this.f301989d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ju3.p0 p0Var = (ju3.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout = this.f301989d;
        yt3.b recordPlugin = improveCameraKitPluginLayout.getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.reset();
        }
        yt3.b recordPlugin2 = improveCameraKitPluginLayout.getRecordPlugin();
        if (recordPlugin2 != null) {
            recordPlugin2.d();
        }
        android.content.Context context = improveCameraKitPluginLayout.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).Y6(true);
        return jz5.f0.f302826a;
    }
}
