package w82;

/* loaded from: classes12.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443913d;

    public m1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView) {
        this.f443913d = favVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443913d;
        android.widget.ProgressBar progressBar = favVideoView.f101585z;
        if (progressBar != null && progressBar.getVisibility() != 0) {
            favVideoView.f101585z.setVisibility(0);
        }
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = favVideoView.A;
        if (mMPinProgressBtn == null || mMPinProgressBtn.getVisibility() == 8) {
            return;
        }
        favVideoView.A.setVisibility(8);
    }
}
