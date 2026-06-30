package rl1;

/* loaded from: classes13.dex */
public class f extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final int f397167p = android.graphics.Color.parseColor("#000000");

    /* renamed from: q, reason: collision with root package name */
    public static final int f397168q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f397169d;

    /* renamed from: e, reason: collision with root package name */
    public int f397170e;

    /* renamed from: f, reason: collision with root package name */
    public int f397171f;

    /* renamed from: g, reason: collision with root package name */
    public int f397172g;

    /* renamed from: h, reason: collision with root package name */
    public int f397173h;

    /* renamed from: i, reason: collision with root package name */
    public int f397174i;

    /* renamed from: m, reason: collision with root package name */
    public int f397175m;

    /* renamed from: n, reason: collision with root package name */
    public float f397176n;

    /* renamed from: o, reason: collision with root package name */
    public float f397177o;

    static {
        android.graphics.Color.parseColor("#000000");
        f397168q = android.graphics.Color.parseColor("#000000");
    }

    public f(android.content.Context context) {
        super(context);
        this.f397170e = 0;
        this.f397171f = 0;
        this.f397176n = 0.0f;
        this.f397177o = 0.0f;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        this.f397169d = new android.widget.TextView(context);
        this.f397169d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        addView(this.f397169d);
    }

    public void a() {
        setText("");
        setTextSize(12);
        setTextColor(f397167p);
        setTextPadding(0);
        setGravity("center");
        int i17 = f397168q;
        b(0, 0, i17, i17);
    }

    public void b(int i17, int i18, int i19, int i27) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(i17);
        gradientDrawable.setStroke(i18, i19);
        gradientDrawable.setColor(i27);
        this.f397169d.setBackgroundDrawable(gradientDrawable);
    }

    public float getAnchorX() {
        return this.f397176n;
    }

    public float getAnchorY() {
        return this.f397177o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) getChildAt(0).getLayoutParams();
        int i28 = this.f397170e;
        if (i28 >= 0 && this.f397171f >= 0) {
            layoutParams.gravity = 85;
        } else if (i28 >= 0 && this.f397171f <= 0) {
            layoutParams.gravity = 53;
        } else if (i28 <= 0 && this.f397171f >= 0) {
            layoutParams.gravity = 83;
        } else if (i28 <= 0 && this.f397171f <= 0) {
            layoutParams.gravity = 51;
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f397172g = getMeasuredWidth();
        this.f397173h = getMeasuredHeight();
        int i19 = this.f397172g;
        int i27 = -i19;
        int i28 = this.f397170e;
        if (i27 < i28 && i28 < 0) {
            this.f397174i = i19;
            this.f397176n = java.lang.Math.abs(i28) / (this.f397172g * 1.0f);
        } else if (i28 >= 0) {
            this.f397174i = i19 + java.lang.Math.abs(i28);
            this.f397176n = 0.0f;
        } else {
            this.f397174i = java.lang.Math.abs(i28);
            this.f397176n = 1.0f;
        }
        int i29 = this.f397173h;
        int i37 = -i29;
        int i38 = this.f397171f;
        if (i37 < i38 && i38 < 0) {
            this.f397175m = i29;
            this.f397177o = java.lang.Math.abs(i38) / (this.f397173h * 1.0f);
        } else if (i38 >= 0) {
            this.f397175m = i29 + java.lang.Math.abs(i38);
            this.f397177o = 0.0f;
        } else {
            this.f397175m = java.lang.Math.abs(i38);
            this.f397177o = 1.0f;
        }
        setMeasuredDimension(this.f397174i, this.f397175m);
    }

    public void setGravity(java.lang.String str) {
        this.f397169d.setGravity(17);
    }

    public void setText(java.lang.String str) {
        this.f397169d.setText(str);
    }

    public void setTextColor(int i17) {
        this.f397169d.setTextColor(i17);
    }

    public void setTextPadding(int i17) {
        this.f397169d.setPadding(i17, i17, i17, i17);
    }

    public void setTextSize(int i17) {
        this.f397169d.setTextSize(i17);
    }

    public void setX(int i17) {
        this.f397170e = i17;
    }

    public void setY(int i17) {
        this.f397171f = i17;
    }
}
