package com.tencent.mm.plugin.multitalk.ui.widget.projector.bubble;

/* loaded from: classes4.dex */
public class BubbleView extends android.widget.RelativeLayout implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f150382d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f150383e;

    /* renamed from: f, reason: collision with root package name */
    public vj3.a f150384f;

    /* renamed from: g, reason: collision with root package name */
    public float f150385g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f150386h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f150387i;

    /* renamed from: m, reason: collision with root package name */
    public int f150388m;

    /* renamed from: n, reason: collision with root package name */
    public float f150389n;

    /* renamed from: o, reason: collision with root package name */
    public float f150390o;

    /* renamed from: p, reason: collision with root package name */
    public float f150391p;

    /* renamed from: q, reason: collision with root package name */
    public int f150392q;

    public BubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150389n = 0.0f;
        this.f150390o = 0.0f;
        this.f150391p = 0.0f;
        this.f150392q = -1;
        a(context, attributeSet, 0);
    }

    private void setCurDirection(int i17) {
        if (i17 == 1) {
            this.f150384f = vj3.a.LEFT;
            return;
        }
        if (i17 == 2) {
            this.f150384f = vj3.a.TOP;
        } else if (i17 == 3) {
            this.f150384f = vj3.a.RIGHT;
        } else {
            if (i17 != 4) {
                return;
            }
            this.f150384f = vj3.a.BOTTOM;
        }
    }

    private void setRelativePosition(float f17) {
        if (f17 < 0.2f) {
            this.f150385g = 0.2f;
        } else if (f17 > 0.8f) {
            this.f150385g = 0.8f;
        } else {
            this.f150385g = f17;
        }
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        int i18;
        this.f150383e = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xi3.a.f454732a);
        float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f150388m = obtainStyledAttributes.getColor(4, 0);
        this.f150389n = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f150390o = obtainStyledAttributes.getDimension(0, 0.0f);
        int color = obtainStyledAttributes.getColor(7, 0);
        float dimension2 = obtainStyledAttributes.getDimension(8, 0.0f);
        java.lang.String string = obtainStyledAttributes.getString(6);
        this.f150392q = obtainStyledAttributes.getResourceId(1, -1);
        setCurDirection(obtainStyledAttributes.getInt(3, 3));
        setRelativePosition(obtainStyledAttributes.getFraction(12, 1, 1, 0.3f));
        setCurThemeStyle(color);
        this.f150391p = obtainStyledAttributes.getDimension(10, 0.0f);
        obtainStyledAttributes.recycle();
        int i19 = this.f150388m;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.f150383e);
        this.f150386h = relativeLayout;
        relativeLayout.setId(android.view.View.generateViewId());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, (int) this.f150391p);
        this.f150386h.setBackground(new vj3.b(i19, dimension));
        android.widget.TextView textView = new android.widget.TextView(this.f150383e);
        this.f150382d = textView;
        textView.setId(android.view.View.generateViewId());
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17);
        int i27 = sj3.i1.f408558c;
        layoutParams2.setMarginStart(i27);
        layoutParams2.setMarginEnd(i27);
        layoutParams2.topMargin = i27;
        layoutParams2.bottomMargin = i27;
        this.f150382d.setLayoutParams(layoutParams2);
        this.f150382d.setTextColor(color);
        this.f150382d.setTextSize(com.tencent.mm.ui.zk.b(this.f150383e, (int) dimension2));
        this.f150382d.setText(string);
        this.f150386h.addView(this.f150382d);
        android.widget.ImageView imageView = new android.widget.ImageView(this.f150383e);
        this.f150387i = imageView;
        imageView.setId(android.view.View.generateViewId());
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams((int) this.f150389n, (int) this.f150390o);
        int ordinal = this.f150384f.ordinal();
        if (ordinal == 0) {
            layoutParams.addRule(17, this.f150387i.getId());
            i18 = 90;
        } else if (ordinal == 1) {
            layoutParams.addRule(3, this.f150387i.getId());
            i18 = 180;
        } else if (ordinal != 3) {
            layoutParams3.addRule(17, this.f150386h.getId());
            i18 = 270;
        } else {
            layoutParams3.addRule(3, this.f150386h.getId());
            i18 = 0;
        }
        android.content.Context context2 = this.f150383e;
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context2, this.f150392q, context2.getResources().getColor(com.tencent.mm.R.color.f478553an));
        int i28 = (int) this.f150389n;
        int i29 = (int) this.f150390o;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i29));
        arrayList.add(java.lang.Integer.valueOf(i28));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/bubble/BubbleView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;FF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/projector/bubble/BubbleView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;FF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        e17.setBounds(0, 0, i28, i29);
        e17.draw(canvas);
        this.f150387i.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.w0(createBitmap, i18)));
        addView(this.f150387i, layoutParams3);
        addView(this.f150386h, layoutParams);
        this.f150386h.post(this);
        setClickable(true);
    }

    public float getRelative() {
        return this.f150385g;
    }

    @Override // java.lang.Runnable
    public void run() {
        int width = this.f150386h.getWidth();
        int height = this.f150386h.getHeight();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f150387i.getLayoutParams();
        int ordinal = this.f150384f.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            layoutParams.setMargins((int) ((width * this.f150385g) - (this.f150387i.getWidth() / 2)), 0, 0, 0);
        } else {
            layoutParams.setMargins(0, (int) ((height * this.f150385g) - (this.f150387i.getHeight() / 2)), 0, 0);
        }
        this.f150387i.setLayoutParams(layoutParams);
    }

    public void setCurThemeStyle(int i17) {
    }

    public BubbleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150389n = 0.0f;
        this.f150390o = 0.0f;
        this.f150391p = 0.0f;
        this.f150392q = -1;
        a(context, attributeSet, i17);
    }
}
