package d41;

/* loaded from: classes11.dex */
public final class j implements com.tencent.mm.app.t2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceControlMgr", "onAppBackground, destroying OVC session");
        com.tencent.wechat.aff.ovc.g.f217477b.b();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
