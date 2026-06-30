package mn0;

/* loaded from: classes3.dex */
public abstract class a implements com.tencent.rtmp.ITXLivePlayListener {
    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        if (i17 == 2008) {
            com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", "receive EVT_START_VIDEO_DECODER " + bundle);
            jz5.g gVar = ko0.p0.f309896a;
            ko0.t tVar = ko0.t.f309903a;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }
}
