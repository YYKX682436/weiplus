package rp2;

/* loaded from: classes3.dex */
public final class b extends mn0.a {
    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        if (i17 == 2001) {
            com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_CONNECT_SUCC");
            return;
        }
        if (i17 != 2009) {
            if (i17 == 2033) {
                com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW");
                return;
            } else if (i17 == 2003) {
                com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_RCV_FIRST_I_FRAME");
                return;
            } else {
                if (i17 != 2004) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_PLAY_BEGIN");
                return;
            }
        }
        int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_CHANGE_RESOLUTION videoWidth=" + i18 + " videoHeight=" + i19 + " videoRatioWH=" + ((i18 * 1.0f) / i19));
    }
}
