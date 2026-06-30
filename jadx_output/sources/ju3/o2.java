package ju3;

/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout f301987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout) {
        super(1);
        this.f301987d = webviewScreenShotPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel it = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.f155662f;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 8);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("image_path", str);
        intent.putExtra("Retr_Msg_Type", 0);
        j45.l.v(this.f301987d.getContext(), ".ui.transmit.SelectConversationUI", intent, 4);
        return jz5.f0.f302826a;
    }
}
