package dk5;

/* loaded from: classes9.dex */
public class h5 implements dk5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234658a;

    public h5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f234658a = sendAppMessageWrapperUI;
    }

    @Override // dk5.h2
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234658a;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "thumb img CDN upload fail!");
            com.tencent.mm.pluginsdk.model.app.m5.c(sendAppMessageWrapperUI, com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), -1), true, false);
            sendAppMessageWrapperUI.finish();
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("music_mv_cover_url", str);
            int i17 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
            sendAppMessageWrapperUI.d7(true, true, bundle);
        }
    }
}
