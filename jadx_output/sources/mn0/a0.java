package mn0;

/* loaded from: classes3.dex */
public abstract class a0 implements com.tencent.rtmp.ITXLivePlayListener {
    public void a(int i17, int i18) {
    }

    public abstract void b();

    public void c() {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        if (i17 == 2009) {
            a(bundle != null ? bundle.getInt("EVT_PARAM1") : 0, bundle != null ? bundle.getInt("EVT_PARAM2") : 0);
        } else if (i17 == 2033) {
            b();
        } else {
            if (i17 != 2103) {
                return;
            }
            c();
        }
    }
}
