package gx4;

/* loaded from: classes8.dex */
public final class b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f277397d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f277398e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Vibrator f277399f;

    public b(android.content.Context context) {
        super(context);
        this.f277399f = (android.os.Vibrator) context.getSystemService("vibrator");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d9s, this);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.agc);
        this.f277397d = imageView;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams();
        int i17 = gx4.e.f277415f;
        layoutParams.height = i17;
        layoutParams.width = i17;
        this.f277397d.setLayoutParams(layoutParams);
        this.f277398e = findViewById(com.tencent.mm.R.id.cgi);
    }

    public final void a(float f17, float f18) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(f17, f18, f17, f18, 1, 1.0f, 1, 1.0f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(50L);
        this.f277397d.startAnimation(scaleAnimation);
    }
}
