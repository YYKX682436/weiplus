package ku3;

/* loaded from: classes.dex */
public final class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312227d;

    public f1(com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout) {
        this.f312227d = professionalCameraKitPluginLayout;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.content.Context context = this.f312227d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }
}
