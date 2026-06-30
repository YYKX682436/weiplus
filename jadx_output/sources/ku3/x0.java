package ku3;

/* loaded from: classes10.dex */
public final class x0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f312453e;

    public x0(com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.f312452d = professionalCameraKitPluginLayout;
        this.f312453e = recordConfigProvider;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.os.Bundle bundle = ((zt3.c) obj).f475589c;
        if (bundle != null) {
            int i17 = bundle.getInt("PARAM_1_INT");
            int i18 = com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout.f155856x1;
            com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout = this.f312452d;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = this.f312453e;
            professionalCameraKitPluginLayout.L(configProvider, i17);
            lu3.m recorder = professionalCameraKitPluginLayout.getRecorder();
            recorder.getClass();
            kotlin.jvm.internal.o.g(configProvider, "configProvider");
            recorder.f321420p = configProvider;
            recorder.f321427w = recorder.c(true, new lu3.g(true, recorder, null));
        }
    }
}
