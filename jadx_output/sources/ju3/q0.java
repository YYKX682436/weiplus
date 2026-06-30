package ju3;

/* loaded from: classes.dex */
public final class q0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f301998d;

    public q0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
        this.f301998d = improveCameraKitPluginLayout;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.content.Context context = this.f301998d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }
}
