package ju3;

/* loaded from: classes10.dex */
public final class s1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f302013a;

    public s1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        this.f302013a = recordPluginLayout;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        buttonView.setVisibility(0);
        com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout = this.f302013a;
        if (((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.f484048cu1)).isChecked() && z17) {
            ((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.f484048cu1)).setChecked(false);
        }
        at0.n recordController = recordPluginLayout.getRecordController();
        if (recordController != null) {
            recordController.n("cameraeffect.request.hdr", z17);
        }
    }
}
