package ku3;

/* loaded from: classes10.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f312404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(jz5.l lVar, com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312404d = lVar;
        this.f312405e = professionalCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.s0(this.f312404d, this.f312405e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f312404d.f302834e;
        if (bundle == null) {
            return null;
        }
        float f17 = bundle.getFloat("camera_float_1");
        ku3.s sVar = this.f312405e.I;
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitIndicatorPlugin", "updateCurrentIndicator >> " + f17);
        sVar.f312403z = ((float) a06.d.b(f17 * 10.0f)) / 10.0f;
        if (sVar.b().getVisibility() == 0) {
            if (sVar.c().getVisibility() == 0) {
                java.lang.Object value = ((jz5.n) sVar.f312388h).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((android.widget.TextView) value).setText(sVar.e());
            } else if (sVar.d().getVisibility() == 0) {
                sVar.o();
            }
        }
        return jz5.f0.f302826a;
    }
}
