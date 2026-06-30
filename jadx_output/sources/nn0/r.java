package nn0;

/* loaded from: classes10.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final nn0.d0 f338603d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.rtmp.ITXLivePlayListener f338604e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.rtmp.ui.TXCloudVideoView f338605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nn0.s f338606g;

    public r(nn0.s sVar, nn0.d0 d0Var, com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f338606g = sVar;
        this.f338603d = d0Var;
        this.f338604e = iTXLivePlayListener;
        this.f338605f = tXCloudVideoView;
        if (sVar.f338626y != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("fromCustomRender", true);
            sVar.f338626y.onPlayEvent(999999, bundle);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView;
        nn0.c0 c0Var;
        java.lang.String str = this.f338606g.f338608d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mIsSetPlayerViewFirstRenderView callback ");
        nn0.d0 d0Var = this.f338603d;
        sb6.append(d0Var);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.f338604e;
        if (iTXLivePlayListener != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("fromCustomRender", true);
            iTXLivePlayListener.onPlayEvent(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW, bundle);
        }
        if (d0Var == null || (tXCloudVideoView = this.f338605f) == null) {
            return;
        }
        int hashCode = tXCloudVideoView.hashCode();
        int i17 = d0Var.f338559b;
        if (hashCode == i17 && (c0Var = d0Var.f338558a) != null) {
            ((mn0.p) c0Var).f329791a.invoke();
            return;
        }
        com.tencent.mars.xlog.Log.i("ViewChangeFunction", "newViewCode: " + hashCode + " bindViewCode = " + i17);
    }
}
