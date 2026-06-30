package ku3;

/* loaded from: classes10.dex */
public final class y0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f312463e;

    public y0(com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.f312462d = professionalCameraKitPluginLayout;
        this.f312463e = recordConfigProvider;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((zt3.b) obj).f475585a == 1) {
            com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout = this.f312462d;
            professionalCameraKitPluginLayout.getKitContext().S6(7, new ku3.x0(professionalCameraKitPluginLayout, this.f312463e));
        }
    }
}
