package sx5;

/* loaded from: classes13.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f413723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413724e;

    public d0(sx5.a1 a1Var, boolean z17) {
        this.f413724e = a1Var;
        this.f413723d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f413724e;
        android.widget.ImageView imageView = a1Var.A;
        if (imageView != null) {
            if (this.f413723d) {
                imageView.setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_play_btn_play);
                a1Var.A.setContentDescription(a1Var.p().getString(com.tencent.xwebsdk.R.string.xweb_video_fullscreen_play));
            } else {
                imageView.setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_play_btn_pause);
                a1Var.A.setContentDescription(a1Var.p().getString(com.tencent.xwebsdk.R.string.xweb_video_fullscreen_pause));
            }
        }
    }
}
