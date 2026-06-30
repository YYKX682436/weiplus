package ju3;

/* loaded from: classes.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f302038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302038d = improveCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.x0(this.f302038d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ju3.x0 x0Var = (ju3.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.view.View cameraView = this.f302038d.getCameraView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(cameraView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout$takePictureAndJump$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cameraView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(cameraView, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout$takePictureAndJump$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
