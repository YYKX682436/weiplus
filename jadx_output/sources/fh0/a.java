package fh0;

/* loaded from: classes5.dex */
public final class a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f262508d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f262509e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f262510f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f262511g;

    /* renamed from: h, reason: collision with root package name */
    public long f262512h;

    /* renamed from: i, reason: collision with root package name */
    public float f262513i;

    /* renamed from: m, reason: collision with root package name */
    public float f262514m;

    /* renamed from: n, reason: collision with root package name */
    public float f262515n;

    /* renamed from: o, reason: collision with root package name */
    public float f262516o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f262517p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f262508d = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = 200;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = -2;
        layoutParams.height = -2;
        this.f262509e = layoutParams;
        float f17 = context.getResources().getDisplayMetrics().density;
        int i17 = (int) (8.0f * f17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(-872415232);
        gradientDrawable.setCornerRadius(f17 * 6.0f);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(i17, i17, i17, i17);
        linearLayout.setBackground(gradientDrawable);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText("Stream Monitor");
        textView.setTextColor(-1);
        textView.setTextSize(2, 10.0f);
        textView.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.MONOSPACE, 1));
        linearLayout.addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 9.0f);
        textView2.setTypeface(android.graphics.Typeface.MONOSPACE);
        textView2.setText("waiting...");
        this.f262510f = textView2;
        linearLayout.addView(textView2);
        android.widget.ScrollView scrollView = new android.widget.ScrollView(context);
        scrollView.addView(linearLayout, new android.widget.FrameLayout.LayoutParams((int) (getScreenWidth() * 0.6f), -2));
        addView(scrollView, new android.widget.FrameLayout.LayoutParams(-2, -2));
    }

    private final int getScreenWidth() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.f262508d.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f262517p = false;
            this.f262513i = event.getRawX();
            this.f262514m = event.getRawY();
            this.f262515n = event.getRawX();
            this.f262516o = event.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = event.getRawX() - this.f262513i;
                float rawY = event.getRawY() - this.f262514m;
                if ((rawX * rawX) + (rawY * rawY) > 100.0f) {
                    this.f262517p = true;
                }
                android.view.WindowManager.LayoutParams layoutParams = this.f262509e;
                layoutParams.x += (int) (event.getRawX() - this.f262515n);
                layoutParams.y += (int) (event.getRawY() - this.f262516o);
                this.f262515n = event.getRawX();
                this.f262516o = event.getRawY();
                this.f262508d.updateViewLayout(this, layoutParams);
            }
        } else if (!this.f262517p) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f262512h < 300) {
                yz5.a aVar = this.f262511g;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f262512h = 0L;
            } else {
                this.f262512h = currentTimeMillis;
            }
        }
        return true;
    }

    public final yz5.a getOnDoubleTap() {
        return this.f262511g;
    }

    public final void setOnDoubleTap(yz5.a aVar) {
        this.f262511g = aVar;
    }
}
