package fk1;

/* loaded from: classes4.dex */
public final class m implements com.tencent.mm.pluginsdk.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.CommonVideoView f263279d;

    public m(com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView) {
        this.f263279d = commonVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        this.f263279d.start();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        this.f263279d.stop();
        com.tencent.mars.xlog.Log.e("MicroMsg.WAGameRecordShareUI", "playView error：" + str3 + ",what:" + i17 + ",extra:" + i18 + ", sessionId:" + str + ",mediaId:" + str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public /* bridge */ /* synthetic */ void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f263279d.start();
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "video prepared, sessionId:" + str + ",mediaId:" + str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
