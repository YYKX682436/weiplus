package w82;

/* loaded from: classes12.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443837d;

    public d1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView) {
        this.f443837d = favVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443837d;
        android.widget.ProgressBar progressBar = favVideoView.f101585z;
        if (progressBar != null && progressBar.getVisibility() != 8) {
            favVideoView.f101585z.setVisibility(8);
        }
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = favVideoView.A;
        if (mMPinProgressBtn == null || mMPinProgressBtn.getVisibility() == 8) {
            return;
        }
        favVideoView.A.setVisibility(8);
    }
}
