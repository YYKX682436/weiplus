package sx5;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f413725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413726e;

    public e0(sx5.a1 a1Var, boolean z17) {
        this.f413726e = a1Var;
        this.f413725d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f413726e;
        android.widget.ImageView imageView = a1Var.f413693y;
        if (imageView != null) {
            if (this.f413725d) {
                imageView.setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_mute_btn_off);
                a1Var.f413693y.setContentDescription(a1Var.p().getString(com.tencent.xwebsdk.R.string.xweb_video_fullscreen_mute_off));
            } else {
                imageView.setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_mute_btn_on);
                a1Var.f413693y.setContentDescription(a1Var.p().getString(com.tencent.xwebsdk.R.string.xweb_video_fullscreen_mute_on));
            }
        }
    }
}
