package ql2;

/* loaded from: classes10.dex */
public final class n extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.r f364534d;

    public n(ql2.r rVar) {
        this.f364534d = rVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        if (i17 == 2009) {
            int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
            int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
            ql2.r rVar = this.f364534d;
            com.tencent.rtmp.TXLivePlayer tXLivePlayer = rVar.f364546i;
            if (tXLivePlayer != null) {
                tXLivePlayer.setSurfaceSize(i18, i19);
            }
            android.graphics.SurfaceTexture surfaceTexture = rVar.f364547m;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i18, i19);
            }
            rVar.f364550p.a(i18, i19, 0);
            com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", "PLAY_EVT_CHANGE_RESOLUTION width:" + i18 + " height:" + i19);
        }
    }
}
