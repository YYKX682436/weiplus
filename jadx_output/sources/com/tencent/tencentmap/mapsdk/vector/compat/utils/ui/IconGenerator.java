package com.tencent.tencentmap.mapsdk.vector.compat.utils.ui;

/* loaded from: classes13.dex */
public class IconGenerator {
    public static final int SQUARE_TEXT_VIEW_ID = new java.util.concurrent.atomic.AtomicInteger(1).get();
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f215532a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f215533b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.a.k f215534c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f215535d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f215536e;

    /* renamed from: f, reason: collision with root package name */
    public int f215537f;

    /* renamed from: g, reason: collision with root package name */
    public float f215538g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public float f215539h = 1.0f;

    public IconGenerator(android.content.Context context) {
        this.f215532a = context;
        android.view.ViewGroup a17 = a();
        this.f215533b = a17;
        this.f215534c = (com.tencent.tencentmap.mapsdk.vector.compat.utils.a.k) a17.getChildAt(0);
        this.f215536e = this.f215535d;
        setStyle(1);
    }

    public static int a(int i17) {
        return (i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7) ? 1 : 0;
    }

    public float getAnchorU() {
        return a(this.f215538g, this.f215539h);
    }

    public float getAnchorV() {
        return a(this.f215539h, this.f215538g);
    }

    public android.graphics.Bitmap makeIcon(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f215535d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public void setBackground(android.graphics.drawable.Drawable drawable) {
        this.f215533b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.f215533b.setPadding(0, 0, 0, 0);
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        drawable.getPadding(rect);
        this.f215533b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setContentPadding(int i17, int i18, int i19, int i27) {
        this.f215536e.setPadding(i17, i18, i19, i27);
    }

    public void setContentRotation(int i17) {
        this.f215534c.setViewRotation(i17);
    }

    public void setContentView(android.view.View view) {
        this.f215534c.removeAllViews();
        this.f215534c.addView(view);
        this.f215536e = view;
        android.view.View findViewById = this.f215534c.findViewById(SQUARE_TEXT_VIEW_ID);
        this.f215535d = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
    }

    public void setRotation(int i17) {
        this.f215537f = ((i17 + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 90;
    }

    public void setStyle(int i17) {
        setTextAppearance(this.f215532a, a(i17));
        if (i17 == 0) {
            setTextAppearance(android.R.style.TextAppearance.Medium, -8421505, 14.0f, 0);
        } else if (i17 == 1) {
            setTextAppearance(android.R.style.TextAppearance.Medium, -1118482, 14.0f, 0);
        }
    }

    public void setTextAppearance(android.content.Context context, int i17) {
        android.widget.TextView textView = this.f215535d;
        if (textView != null) {
            textView.setTextAppearance(context, i17);
        }
    }

    public final android.view.ViewGroup a() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.f215532a);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.k kVar = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.k(this.f215532a);
        this.f215534c = kVar;
        kVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        this.f215535d = new android.widget.TextView(this.f215532a);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.f215535d.setLayoutParams(layoutParams);
        this.f215535d.setPadding(10, 5, 10, 5);
        this.f215535d.setId(SQUARE_TEXT_VIEW_ID);
        this.f215534c.addView(this.f215535d);
        linearLayout.addView(this.f215534c);
        return linearLayout;
    }

    public void setTextAppearance(int i17, int i18, float f17, int i19) {
        setTextAppearance(this.f215532a, i17);
        this.f215535d.setTextColor(i18);
        this.f215535d.setTextSize(f17);
        android.widget.TextView textView = this.f215535d;
        textView.setTypeface(textView.getTypeface(), i19);
    }

    public android.graphics.Bitmap makeIcon() {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f215533b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f215533b.getMeasuredWidth();
        int measuredHeight = this.f215533b.getMeasuredHeight();
        this.f215533b.layout(0, 0, measuredWidth, measuredHeight);
        int i17 = this.f215537f;
        if (i17 == 1 || i17 == 3) {
            measuredHeight = this.f215533b.getMeasuredWidth();
            measuredWidth = this.f215533b.getMeasuredHeight();
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(measuredWidth, measuredHeight, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        int i18 = this.f215537f;
        if (i18 != 0) {
            if (i18 == 1) {
                canvas.translate(measuredWidth, 0.0f);
                canvas.rotate(90.0f);
            } else if (i18 == 2) {
                canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
            } else {
                canvas.translate(0.0f, measuredHeight);
                canvas.rotate(270.0f);
            }
        }
        this.f215533b.draw(canvas);
        return createBitmap;
    }

    public final float a(float f17, float f18) {
        int i17 = this.f215537f;
        if (i17 == 0) {
            return f17;
        }
        if (i17 == 1) {
            return 1.0f - f18;
        }
        if (i17 == 2) {
            return 1.0f - f17;
        }
        if (i17 == 3) {
            return f18;
        }
        throw new java.lang.IllegalStateException();
    }
}
