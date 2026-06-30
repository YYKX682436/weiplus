package sx5;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public sx5.c f413714a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f413715b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f413716c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f413717d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f413718e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f413719f;

    /* renamed from: g, reason: collision with root package name */
    public float f413720g;

    /* renamed from: h, reason: collision with root package name */
    public float f413721h;

    /* renamed from: i, reason: collision with root package name */
    public float f413722i;

    public d(android.view.View view) {
        this.f413715b = (android.widget.ImageView) view.findViewById(com.tencent.xwebsdk.R.id.player_progress_bar_front);
        this.f413717d = (android.widget.ImageView) view.findViewById(com.tencent.xwebsdk.R.id.player_progress_bar_middle);
        this.f413716c = (android.widget.ImageView) view.findViewById(com.tencent.xwebsdk.R.id.player_progress_bar_background);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.xwebsdk.R.id.player_progress_point);
        this.f413718e = imageView;
        imageView.setOnTouchListener(new sx5.b(this));
    }

    public void a(float f17, boolean z17) {
        android.widget.ImageView imageView;
        if ((!this.f413719f || z17) && (imageView = this.f413718e) != null) {
            android.widget.ImageView imageView2 = this.f413716c;
            if (imageView2.getWidth() == 0) {
                return;
            }
            if (f17 < 0.0f) {
                f17 = 0.0f;
            } else if (f17 > 100.0f) {
                f17 = 100.0f;
            }
            this.f413722i = f17;
            android.widget.ImageView imageView3 = this.f413715b;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView3.getLayoutParams();
            float f18 = f17 / 100.0f;
            layoutParams.width = (int) (imageView2.getWidth() * f18);
            imageView3.setLayoutParams(layoutParams);
            imageView3.requestLayout();
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.leftMargin = f17 <= 0.0f ? 0 : f17 >= 100.0f ? imageView2.getWidth() - (((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / 2) : (int) (f18 * (r0 - (((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / 2)));
            imageView.setLayoutParams(layoutParams2);
            imageView.requestLayout();
        }
    }
}
