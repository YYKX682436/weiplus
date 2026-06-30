package ku3;

/* loaded from: classes10.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f312366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(jz5.l lVar, com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312366d = lVar;
        this.f312367e = professionalCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.q0(this.f312366d, this.f312367e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.q0 q0Var = (ku3.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f312366d.f302834e;
        boolean z17 = bundle != null ? bundle.getBoolean("camera_boolean") : false;
        int i17 = com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout.f155856x1;
        com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout = this.f312367e;
        professionalCameraKitPluginLayout.getCameraSwitchPlugin().a(z17);
        nu3.i.f340218a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(z17 ? 1 : 2));
        if (z17) {
            professionalCameraKitPluginLayout.I.setVisibility(4);
        }
        if (professionalCameraKitPluginLayout.getKitContext().O6(1)) {
            zt3.a.V6(professionalCameraKitPluginLayout.getKitContext(), 1, false, null, !z17, false, 20, null);
        } else {
            zt3.a.V6(professionalCameraKitPluginLayout.getKitContext(), 1, false, null, !z17, false, 4, null);
        }
        zt3.a kitContext = professionalCameraKitPluginLayout.getKitContext();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("KEY_CAMERA_KIT_CONTEXT_INT", 0);
        kitContext.f475582m.postValue(new zt3.b(2, bundle2));
        if (professionalCameraKitPluginLayout.getKitContext().N6(10) == 0) {
            zt3.a.U6(professionalCameraKitPluginLayout.getKitContext(), 10, 4, null, 4, null);
        }
        professionalCameraKitPluginLayout.getKitContext().getClass();
        return jz5.f0.f302826a;
    }
}
