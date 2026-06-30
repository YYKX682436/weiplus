package nn0;

/* loaded from: classes10.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.h f338561d;

    public f(nn0.h hVar) {
        this.f338561d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nn0.h hVar = this.f338561d;
        if (hVar.I != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("fromCustomRender", true);
            hVar.I.onPlayEvent(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW, bundle);
        }
    }
}
