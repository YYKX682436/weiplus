package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public class FontChooserView extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.SoftReference f187024v = null;

    /* renamed from: w, reason: collision with root package name */
    public static int f187025w = 8;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f187026d;

    /* renamed from: e, reason: collision with root package name */
    public int f187027e;

    /* renamed from: f, reason: collision with root package name */
    public int f187028f;

    /* renamed from: g, reason: collision with root package name */
    public int f187029g;

    /* renamed from: h, reason: collision with root package name */
    public int f187030h;

    /* renamed from: i, reason: collision with root package name */
    public float f187031i;

    /* renamed from: m, reason: collision with root package name */
    public float f187032m;

    /* renamed from: n, reason: collision with root package name */
    public int f187033n;

    /* renamed from: o, reason: collision with root package name */
    public int f187034o;

    /* renamed from: p, reason: collision with root package name */
    public int f187035p;

    /* renamed from: q, reason: collision with root package name */
    public int f187036q;

    /* renamed from: r, reason: collision with root package name */
    public int f187037r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.w0 f187038s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f187039t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f187040u;

    public FontChooserView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187026d = new java.util.ArrayList(8);
        this.f187027e = 0;
        this.f187028f = 0;
        this.f187029g = 0;
        this.f187030h = 0;
        this.f187031i = 0.0f;
        this.f187032m = 0.0f;
        this.f187033n = 0;
        this.f187034o = 0;
        this.f187035p = 0;
        this.f187036q = 0;
        this.f187037r = 0;
        this.f187038s = null;
        this.f187039t = false;
        this.f187040u = false;
    }

    public final void a() {
        java.lang.ref.SoftReference softReference = f187024v;
        if (softReference == null || softReference.get() == null) {
            android.content.res.Resources resources = getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481836c60));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/FontChooserView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/webview/ui/tools/widget/FontChooserView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            f187024v = new java.lang.ref.SoftReference(decodeResource);
        }
    }

    public final int b(float f17) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        paint.setAntiAlias(true);
        return (int) java.lang.Math.ceil(paint.getFontMetrics().bottom);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        a();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setARGB(255, 152, 152, 152);
        paint.setStrokeWidth(2.0f);
        int width = getWidth();
        int b17 = i65.a.b(getContext(), 5);
        int i17 = this.f187027e;
        int i18 = this.f187029g;
        canvas.drawLine(i17, i18, width - i17, i18, paint);
        for (int i19 = 0; i19 < f187025w; i19++) {
            int i27 = this.f187027e;
            int i28 = this.f187030h;
            int i29 = this.f187029g;
            canvas.drawLine((i28 * i19) + i27, i29 - b17, i27 + (i28 * i19), i29 + b17, paint);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f187024v.get();
        if (bitmap == null) {
            a();
        }
        canvas.drawBitmap(bitmap, this.f187034o, this.f187035p, (android.graphics.Paint) null);
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.l7f);
        getResources().getString(com.tencent.mm.R.string.l7e);
        getResources().getString(com.tencent.mm.R.string.l7g);
        float e17 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479897ia) * i65.a.y(getContext());
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(e17);
        int measureText = (int) paint2.measureText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        int b18 = b(e17);
        paint2.setColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        paint2.setAntiAlias(true);
        canvas.drawText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, this.f187027e - (measureText / 2), (this.f187029g - b18) - (bitmap.getHeight() / 3), paint2);
        float e18 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479897ia);
        i65.a.x(getContext());
        paint2.setTextSize(e18 * 1.0f);
        canvas.drawText(string, (this.f187027e + (this.f187030h * 1)) - (((int) paint2.measureText(string)) / 2), (this.f187029g - b(r2)) - (bitmap.getHeight() / 3), paint2);
        paint2.setTextSize(com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479897ia) * i65.a.v(getContext()));
        canvas.drawText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (this.f187027e + (this.f187030h * (f187025w - 1))) - (((int) paint2.measureText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2), (this.f187029g - b(r1)) - (bitmap.getHeight() / 3), paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        a();
        java.util.List list = this.f187026d;
        ((java.util.ArrayList) list).clear();
        setClickable(true);
        this.f187027e = i65.a.b(getContext(), 30);
        this.f187028f = i65.a.b(getContext(), 10);
        int width = getWidth();
        this.f187029g = this.f187028f + (getHeight() / 2);
        f187025w = 8;
        this.f187030h = (width - (this.f187027e * 2)) / (8 - 1);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f187024v.get();
        if (bitmap == null) {
            a();
            bitmap = (android.graphics.Bitmap) f187024v.get();
        }
        for (int i28 = 0; i28 < f187025w; i28++) {
            com.tencent.mm.plugin.webview.ui.tools.widget.x0 x0Var = new com.tencent.mm.plugin.webview.ui.tools.widget.x0(null);
            x0Var.f187593a = (this.f187027e + (this.f187030h * i28)) - (bitmap.getWidth() / 2);
            x0Var.f187594b = this.f187029g - (bitmap.getHeight() / 2);
            x0Var.f187595c = this.f187027e + (this.f187030h * i28) + (bitmap.getWidth() / 2);
            x0Var.f187596d = this.f187029g + (bitmap.getHeight() / 2);
            ((java.util.ArrayList) list).add(x0Var);
        }
        int i29 = this.f187037r;
        this.f187033n = i29;
        if (this.f187036q >= 0) {
            this.f187034o = ((com.tencent.mm.plugin.webview.ui.tools.widget.x0) ((java.util.ArrayList) list).get(i29)).f187593a;
        } else if (this.f187034o <= ((com.tencent.mm.plugin.webview.ui.tools.widget.x0) ((java.util.ArrayList) list).get(i29)).f187595c - (this.f187030h / 2)) {
            this.f187034o = ((com.tencent.mm.plugin.webview.ui.tools.widget.x0) ((java.util.ArrayList) list).get(this.f187033n)).f187593a;
        } else {
            this.f187034o = ((com.tencent.mm.plugin.webview.ui.tools.widget.x0) ((java.util.ArrayList) list).get(this.f187033n)).f187595c;
        }
        this.f187035p = ((com.tencent.mm.plugin.webview.ui.tools.widget.x0) ((java.util.ArrayList) list).get(this.f187033n)).f187594b;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        java.util.List list = this.f187026d;
        int i17 = 0;
        if (action == 0) {
            this.f187031i = motionEvent.getX();
            this.f187032m = motionEvent.getY();
            com.tencent.mm.plugin.webview.ui.tools.widget.x0 x0Var = (com.tencent.mm.plugin.webview.ui.tools.widget.x0) ((java.util.ArrayList) list).get(this.f187033n);
            float f17 = this.f187031i;
            if (f17 >= x0Var.f187593a && f17 <= x0Var.f187595c) {
                float f18 = this.f187032m;
                if (f18 >= x0Var.f187594b && f18 <= x0Var.f187596d) {
                    i17 = 1;
                }
            }
            if (i17 != 0) {
                this.f187039t = true;
                return true;
            }
            this.f187040u = true;
            return super.onTouchEvent(motionEvent);
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (!this.f187039t) {
                return super.onTouchEvent(motionEvent);
            }
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f187036q = (int) (x17 - this.f187031i);
            this.f187034o = (int) (x17 - this.f187027e);
            this.f187031i = x17;
            this.f187032m = y17;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            com.tencent.mm.plugin.webview.ui.tools.widget.x0 x0Var2 = (com.tencent.mm.plugin.webview.ui.tools.widget.x0) arrayList.get(0);
            com.tencent.mm.plugin.webview.ui.tools.widget.x0 x0Var3 = (com.tencent.mm.plugin.webview.ui.tools.widget.x0) arrayList.get(f187025w - 1);
            int i18 = this.f187034o;
            int i19 = x0Var2.f187593a;
            if (i18 > i19) {
                int i27 = x0Var3.f187593a;
                if (i18 < i27) {
                    while (true) {
                        if (i17 >= f187025w) {
                            break;
                        }
                        com.tencent.mm.plugin.webview.ui.tools.widget.x0 x0Var4 = (com.tencent.mm.plugin.webview.ui.tools.widget.x0) arrayList.get(i17);
                        int i28 = this.f187034o;
                        if (i28 < x0Var4.f187593a - 5 || i28 > x0Var4.f187595c + 5) {
                            i17++;
                        } else {
                            this.f187033n = i17;
                            this.f187037r = i17;
                            com.tencent.mm.plugin.webview.ui.tools.widget.w0 w0Var = this.f187038s;
                            if (w0Var != null) {
                                ((com.tencent.mm.plugin.webview.ui.tools.xc) w0Var).a(i17);
                            }
                        }
                    }
                } else {
                    this.f187034o = i27;
                }
            } else {
                this.f187034o = i19;
            }
            invalidate();
            return true;
        }
        if (!this.f187039t) {
            if (!this.f187040u) {
                return super.onTouchEvent(motionEvent);
            }
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            if (java.lang.Math.abs(x18 - this.f187031i) <= 10.0f && java.lang.Math.abs(y18 - this.f187032m) <= 10.0f) {
                int i29 = 0;
                while (true) {
                    if (i29 >= f187025w) {
                        break;
                    }
                    int i37 = ((com.tencent.mm.plugin.webview.ui.tools.widget.x0) ((java.util.ArrayList) list).get(i29)).f187593a;
                    if (x18 < i37 - 5 || x18 > r4.f187595c + 5) {
                        i29++;
                    } else {
                        this.f187033n = i29;
                        this.f187037r = i29;
                        this.f187034o = i37;
                        com.tencent.mm.plugin.webview.ui.tools.widget.w0 w0Var2 = this.f187038s;
                        if (w0Var2 != null) {
                            ((com.tencent.mm.plugin.webview.ui.tools.xc) w0Var2).a(i29);
                        }
                    }
                }
            }
            this.f187040u = false;
            invalidate();
            return true;
        }
        int i38 = 0;
        while (true) {
            if (i38 >= f187025w - 1) {
                break;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            com.tencent.mm.plugin.webview.ui.tools.widget.x0 x0Var5 = (com.tencent.mm.plugin.webview.ui.tools.widget.x0) arrayList2.get(i38);
            int i39 = i38 + 1;
            com.tencent.mm.plugin.webview.ui.tools.widget.x0 x0Var6 = (com.tencent.mm.plugin.webview.ui.tools.widget.x0) arrayList2.get(i39);
            int i47 = this.f187034o;
            int i48 = x0Var5.f187593a;
            int i49 = this.f187030h / 2;
            if (i47 <= i49 + i48 && i47 >= i48) {
                this.f187033n = i38;
                this.f187034o = i48;
                break;
            }
            int i57 = x0Var6.f187593a;
            if (i47 >= i57 - i49 && i47 <= i57) {
                this.f187033n = i39;
                this.f187034o = i57;
                break;
            }
            i38 = i39;
        }
        int i58 = this.f187033n;
        this.f187037r = i58;
        com.tencent.mm.plugin.webview.ui.tools.widget.w0 w0Var3 = this.f187038s;
        if (w0Var3 != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.xc) w0Var3).a(i58);
        }
        invalidate();
        this.f187039t = false;
        return true;
    }

    public void setOnChangeListener(com.tencent.mm.plugin.webview.ui.tools.widget.w0 w0Var) {
        this.f187038s = w0Var;
    }

    public void setSliderIndex(int i17) {
        this.f187037r = i17;
    }

    public FontChooserView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f187026d = new java.util.ArrayList(8);
        this.f187027e = 0;
        this.f187028f = 0;
        this.f187029g = 0;
        this.f187030h = 0;
        this.f187031i = 0.0f;
        this.f187032m = 0.0f;
        this.f187033n = 0;
        this.f187034o = 0;
        this.f187035p = 0;
        this.f187036q = 0;
        this.f187037r = 0;
        this.f187038s = null;
        this.f187039t = false;
        this.f187040u = false;
    }
}
