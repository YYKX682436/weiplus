package ql2;

/* loaded from: classes10.dex */
public final class a0 extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.d0 f364497d;

    public a0(ql2.d0 d0Var) {
        this.f364497d = d0Var;
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
            ql2.d0 d0Var = this.f364497d;
            com.tencent.rtmp.TXLivePlayer tXLivePlayer = d0Var.f364506h;
            if (tXLivePlayer != null) {
                tXLivePlayer.setSurfaceSize(i18, i19);
            }
            android.graphics.SurfaceTexture surfaceTexture = d0Var.f364507i;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i18, i19);
            }
            d0Var.f364508m.a(i18, i19, 0);
            com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", "PLAY_EVT_CHANGE_RESOLUTION width:" + i18 + " height:" + i19);
        }
    }
}
