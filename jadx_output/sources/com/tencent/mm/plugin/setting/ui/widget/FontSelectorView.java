package com.tencent.mm.plugin.setting.ui.widget;

/* loaded from: classes5.dex */
public class FontSelectorView extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.SoftReference f162033v = null;

    /* renamed from: w, reason: collision with root package name */
    public static int f162034w = 8;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f162035d;

    /* renamed from: e, reason: collision with root package name */
    public int f162036e;

    /* renamed from: f, reason: collision with root package name */
    public int f162037f;

    /* renamed from: g, reason: collision with root package name */
    public int f162038g;

    /* renamed from: h, reason: collision with root package name */
    public int f162039h;

    /* renamed from: i, reason: collision with root package name */
    public float f162040i;

    /* renamed from: m, reason: collision with root package name */
    public float f162041m;

    /* renamed from: n, reason: collision with root package name */
    public int f162042n;

    /* renamed from: o, reason: collision with root package name */
    public int f162043o;

    /* renamed from: p, reason: collision with root package name */
    public int f162044p;

    /* renamed from: q, reason: collision with root package name */
    public int f162045q;

    /* renamed from: r, reason: collision with root package name */
    public int f162046r;

    /* renamed from: s, reason: collision with root package name */
    public w24.b f162047s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f162048t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f162049u;

    public FontSelectorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162035d = new java.util.ArrayList(8);
        this.f162036e = 0;
        this.f162037f = 0;
        this.f162038g = 0;
        this.f162039h = 0;
        this.f162040i = 0.0f;
        this.f162041m = 0.0f;
        this.f162042n = 0;
        this.f162043o = 0;
        this.f162044p = 0;
        this.f162045q = 0;
        this.f162046r = 0;
        this.f162047s = null;
        this.f162048t = false;
        this.f162049u = false;
    }

    public final void a() {
        java.lang.ref.SoftReference softReference = f162033v;
        if (softReference == null || softReference.get() == null) {
            android.content.res.Resources resources = getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481836c60));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/FontSelectorView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/setting/ui/widget/FontSelectorView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            f162033v = new java.lang.ref.SoftReference(decodeResource);
        }
    }

    public final int b(float f17) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        paint.setAntiAlias(true);
        return (int) java.lang.Math.ceil(paint.getFontMetrics().bottom);
    }

    public int getSliderIndex() {
        return this.f162046r;
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
        int i17 = this.f162036e;
        int i18 = this.f162038g;
        canvas.drawLine(i17, i18, width - i17, i18, paint);
        for (int i19 = 0; i19 < f162034w; i19++) {
            int i27 = this.f162036e;
            int i28 = this.f162039h;
            int i29 = this.f162038g;
            canvas.drawLine((i28 * i19) + i27, i29 - b17, i27 + (i28 * i19), i29 + b17, paint);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f162033v.get();
        if (bitmap == null) {
            a();
        }
        canvas.drawBitmap(bitmap, this.f162043o, this.f162044p, (android.graphics.Paint) null);
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.inn);
        getResources().getString(com.tencent.mm.R.string.inm);
        getResources().getString(com.tencent.mm.R.string.ino);
        float e17 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479897ia) * i65.a.y(getContext());
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(e17);
        int measureText = (int) paint2.measureText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        int b18 = b(e17);
        paint2.setColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        paint2.setAntiAlias(true);
        canvas.drawText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, this.f162036e - (measureText / 2), (this.f162038g - b18) - (bitmap.getHeight() / 3), paint2);
        float e18 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479897ia);
        i65.a.x(getContext());
        paint2.setTextSize(e18 * 1.0f);
        canvas.drawText(string, (this.f162036e + (this.f162039h * 1)) - (((int) paint2.measureText(string)) / 2), (this.f162038g - b(r2)) - (bitmap.getHeight() / 3), paint2);
        paint2.setTextSize(com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479897ia) * i65.a.v(getContext()));
        canvas.drawText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (this.f162036e + (this.f162039h * (f162034w - 1))) - (((int) paint2.measureText(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2), (this.f162038g - b(r1)) - (bitmap.getHeight() / 3), paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        a();
        java.util.List list = this.f162035d;
        ((java.util.ArrayList) list).clear();
        setClickable(true);
        this.f162036e = i65.a.b(getContext(), 30);
        this.f162037f = i65.a.b(getContext(), 10);
        int width = getWidth();
        this.f162038g = this.f162037f + (getHeight() / 2);
        f162034w = 8;
        this.f162039h = (width - (this.f162036e * 2)) / (8 - 1);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f162033v.get();
        if (bitmap == null) {
            a();
            bitmap = (android.graphics.Bitmap) f162033v.get();
        }
        for (int i28 = 0; i28 < f162034w; i28++) {
            w24.c cVar = new w24.c(null);
            cVar.f442608a = (this.f162036e + (this.f162039h * i28)) - (bitmap.getWidth() / 2);
            cVar.f442609b = this.f162038g - (bitmap.getHeight() / 2);
            cVar.f442610c = this.f162036e + (this.f162039h * i28) + (bitmap.getWidth() / 2);
            cVar.f442611d = this.f162038g + (bitmap.getHeight() / 2);
            ((java.util.ArrayList) list).add(cVar);
        }
        int i29 = this.f162046r;
        this.f162042n = i29;
        if (this.f162045q >= 0) {
            this.f162043o = ((w24.c) ((java.util.ArrayList) list).get(i29)).f442608a;
        } else if (this.f162043o <= ((w24.c) ((java.util.ArrayList) list).get(i29)).f442610c - (this.f162039h / 2)) {
            this.f162043o = ((w24.c) ((java.util.ArrayList) list).get(this.f162042n)).f442608a;
        } else {
            this.f162043o = ((w24.c) ((java.util.ArrayList) list).get(this.f162042n)).f442610c;
        }
        this.f162044p = ((w24.c) ((java.util.ArrayList) list).get(this.f162042n)).f442609b;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        java.util.List list = this.f162035d;
        int i17 = 0;
        if (action == 0) {
            this.f162040i = motionEvent.getX();
            this.f162041m = motionEvent.getY();
            w24.c cVar = (w24.c) ((java.util.ArrayList) list).get(this.f162042n);
            float f17 = this.f162040i;
            if (f17 >= cVar.f442608a && f17 <= cVar.f442610c) {
                float f18 = this.f162041m;
                if (f18 >= cVar.f442609b && f18 <= cVar.f442611d) {
                    i17 = 1;
                }
            }
            if (i17 != 0) {
                this.f162048t = true;
                return true;
            }
            this.f162049u = true;
            return super.onTouchEvent(motionEvent);
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (!this.f162048t) {
                return super.onTouchEvent(motionEvent);
            }
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f162045q = (int) (x17 - this.f162040i);
            this.f162043o = (int) (x17 - this.f162036e);
            this.f162040i = x17;
            this.f162041m = y17;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            w24.c cVar2 = (w24.c) arrayList.get(0);
            w24.c cVar3 = (w24.c) arrayList.get(f162034w - 1);
            int i18 = this.f162043o;
            int i19 = cVar2.f442608a;
            if (i18 > i19) {
                int i27 = cVar3.f442608a;
                if (i18 < i27) {
                    while (true) {
                        if (i17 >= f162034w) {
                            break;
                        }
                        w24.c cVar4 = (w24.c) arrayList.get(i17);
                        int i28 = this.f162043o;
                        if (i28 < cVar4.f442608a - 5 || i28 > cVar4.f442610c + 5) {
                            i17++;
                        } else {
                            this.f162042n = i17;
                            this.f162046r = i17;
                            w24.b bVar = this.f162047s;
                            if (bVar != null) {
                                ((com.tencent.mm.plugin.setting.ui.setting.wb) bVar).a(i17);
                            }
                        }
                    }
                } else {
                    this.f162043o = i27;
                }
            } else {
                this.f162043o = i19;
            }
            invalidate();
            return true;
        }
        if (!this.f162048t) {
            if (!this.f162049u) {
                return super.onTouchEvent(motionEvent);
            }
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            if (java.lang.Math.abs(x18 - this.f162040i) <= 10.0f && java.lang.Math.abs(y18 - this.f162041m) <= 10.0f) {
                int i29 = 0;
                while (true) {
                    if (i29 >= f162034w) {
                        break;
                    }
                    int i37 = ((w24.c) ((java.util.ArrayList) list).get(i29)).f442608a;
                    if (x18 < i37 - 5 || x18 > r4.f442610c + 5) {
                        i29++;
                    } else {
                        this.f162042n = i29;
                        this.f162046r = i29;
                        this.f162043o = i37;
                        w24.b bVar2 = this.f162047s;
                        if (bVar2 != null) {
                            ((com.tencent.mm.plugin.setting.ui.setting.wb) bVar2).a(i29);
                        }
                    }
                }
            }
            this.f162049u = false;
            invalidate();
            return true;
        }
        int i38 = 0;
        while (true) {
            if (i38 >= f162034w - 1) {
                break;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            w24.c cVar5 = (w24.c) arrayList2.get(i38);
            int i39 = i38 + 1;
            w24.c cVar6 = (w24.c) arrayList2.get(i39);
            int i47 = this.f162043o;
            int i48 = cVar5.f442608a;
            int i49 = this.f162039h / 2;
            if (i47 <= i49 + i48 && i47 >= i48) {
                this.f162042n = i38;
                this.f162043o = i48;
                break;
            }
            int i57 = cVar6.f442608a;
            if (i47 >= i57 - i49 && i47 <= i57) {
                this.f162042n = i39;
                this.f162043o = i57;
                break;
            }
            i38 = i39;
        }
        int i58 = this.f162042n;
        this.f162046r = i58;
        w24.b bVar3 = this.f162047s;
        if (bVar3 != null) {
            ((com.tencent.mm.plugin.setting.ui.setting.wb) bVar3).a(i58);
        }
        invalidate();
        this.f162048t = false;
        return true;
    }

    public void setOnChangeListener(w24.b bVar) {
        this.f162047s = bVar;
    }

    public void setSliderIndex(int i17) {
        int min = java.lang.Math.min(7, java.lang.Math.max(0, i17));
        this.f162046r = min;
        w24.b bVar = this.f162047s;
        if (bVar != null) {
            ((com.tencent.mm.plugin.setting.ui.setting.wb) bVar).a(min);
        }
    }

    public FontSelectorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f162035d = new java.util.ArrayList(8);
        this.f162036e = 0;
        this.f162037f = 0;
        this.f162038g = 0;
        this.f162039h = 0;
        this.f162040i = 0.0f;
        this.f162041m = 0.0f;
        this.f162042n = 0;
        this.f162043o = 0;
        this.f162044p = 0;
        this.f162045q = 0;
        this.f162046r = 0;
        this.f162047s = null;
        this.f162048t = false;
        this.f162049u = false;
    }
}
