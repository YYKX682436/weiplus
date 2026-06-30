package ju3;

/* loaded from: classes10.dex */
public final class q1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f301999a;

    public q1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        this.f301999a = recordPluginLayout;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        buttonView.setVisibility(0);
        com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout = this.f301999a;
        if (((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.gxj)).isChecked() && z17) {
            ((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.gxj)).setChecked(false);
        }
        at0.n recordController = recordPluginLayout.getRecordController();
        if (recordController != null) {
            recordController.n("cameraeffect.request.denois", z17);
        }
    }
}
