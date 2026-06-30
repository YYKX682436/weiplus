package ju3;

/* loaded from: classes10.dex */
public final class r1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f302007a;

    public r1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        this.f302007a = recordPluginLayout;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        buttonView.setVisibility(0);
        at0.n recordController = this.f302007a.getRecordController();
        if (recordController != null) {
            recordController.n("cameraeffect.request.hdrchecker", z17);
        }
    }
}
