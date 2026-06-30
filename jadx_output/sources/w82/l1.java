package w82;

/* loaded from: classes12.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f443909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443911f;

    public l1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView, long j17, long j18) {
        this.f443911f = favVideoView;
        this.f443909d = j17;
        this.f443910e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443911f;
        android.widget.ProgressBar progressBar = favVideoView.f101585z;
        if (progressBar != null && progressBar.getVisibility() != 8) {
            favVideoView.f101585z.setVisibility(8);
        }
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = favVideoView.A;
        if (mMPinProgressBtn != null) {
            if (mMPinProgressBtn.getVisibility() != 0) {
                favVideoView.A.setVisibility(0);
            }
            java.lang.String str = favVideoView.f101566d;
            long j17 = this.f443909d;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            long j18 = this.f443910e;
            com.tencent.mars.xlog.Log.i(str, "download video update progress offset:%d  total: %d", valueOf, java.lang.Long.valueOf(j18));
            if (j18 > 2147483647L) {
                j18 /= 1024;
                j17 /= 1024;
            }
            if (favVideoView.A.getMax() != j18 && j18 > 0) {
                favVideoView.A.setMax((int) j18);
            }
            favVideoView.A.setProgress((int) j17);
        }
    }
}
