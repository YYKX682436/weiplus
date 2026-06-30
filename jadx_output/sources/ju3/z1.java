package ju3;

/* loaded from: classes10.dex */
public final class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f302044d;

    public z1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        this.f302044d = recordPluginLayout;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.f155834x;
        this.f302044d.y(false);
    }
}
