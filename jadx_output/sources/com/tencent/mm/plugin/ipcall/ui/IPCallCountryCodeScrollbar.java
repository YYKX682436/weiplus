package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes5.dex */
public class IPCallCountryCodeScrollbar extends android.view.View {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f142566r = {androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "U", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "X", "Y", "Z"};

    /* renamed from: d, reason: collision with root package name */
    public float f142567d;

    /* renamed from: e, reason: collision with root package name */
    public int f142568e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f142569f;

    /* renamed from: g, reason: collision with root package name */
    public int f142570g;

    /* renamed from: h, reason: collision with root package name */
    public float f142571h;

    /* renamed from: i, reason: collision with root package name */
    public float f142572i;

    /* renamed from: m, reason: collision with root package name */
    public float f142573m;

    /* renamed from: n, reason: collision with root package name */
    public db5.d5 f142574n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f142575o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.j1 f142576p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Paint f142577q;

    public IPCallCountryCodeScrollbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f142572i = 0.0f;
        this.f142569f = new java.lang.String[]{"↑"};
        this.f142567d = 1.3f;
        this.f142568e = 79;
        setFocusable(true);
        setFocusableInTouchMode(true);
        com.tencent.mm.sdk.platformtools.j.d(context, 3.0f);
        android.view.View inflate = android.view.View.inflate(context, getToastLayoutId(), null);
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, this.f142568e);
        this.f142574n = new db5.d5(inflate, d17, d17);
        this.f142575o = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mvd);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f142577q = paint;
        paint.setAntiAlias(true);
        this.f142577q.setColor(-11119018);
        this.f142577q.setTextAlign(android.graphics.Paint.Align.CENTER);
    }

    public int getToastLayoutId() {
        return com.tencent.mm.R.layout.cna;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f17 = measuredHeight;
        this.f142571h = f17 / (this.f142569f.length * this.f142567d);
        float dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479897ia);
        if (this.f142571h > dimensionPixelSize) {
            this.f142571h = dimensionPixelSize;
        }
        this.f142577q.setTextSize(this.f142571h);
        float f18 = this.f142572i;
        float f19 = this.f142571h;
        if (f18 != f19) {
            this.f142572i = f19;
            post(new com.tencent.mm.plugin.ipcall.ui.i1(this, measuredWidth, measuredHeight));
        }
        float f27 = this.f142571h;
        int i17 = 0;
        if (f27 == dimensionPixelSize) {
            float length = (f17 - ((this.f142569f.length * f27) * this.f142567d)) / 2.0f;
            while (true) {
                java.lang.String[] strArr = this.f142569f;
                if (i17 >= strArr.length) {
                    return;
                }
                float f28 = this.f142571h;
                canvas.drawText(strArr[i17], measuredWidth / 2.0f, length + f28 + (i17 * f28 * this.f142567d), this.f142577q);
                i17++;
            }
        } else {
            while (true) {
                java.lang.String[] strArr2 = this.f142569f;
                if (i17 >= strArr2.length) {
                    return;
                }
                float f29 = this.f142571h;
                canvas.drawText(strArr2[i17], measuredWidth / 2.0f, f29 + (i17 * f29 * this.f142567d), this.f142577q);
                i17++;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            float y17 = motionEvent.getY();
            this.f142573m = y17;
            if (y17 < 0.0f) {
                this.f142573m = 0.0f;
            }
            if (this.f142573m > getMeasuredHeight()) {
                this.f142573m = getMeasuredHeight();
            }
            setBackgroundDrawable(i65.a.i(getContext(), com.tencent.mm.R.drawable.aye));
            float f17 = this.f142573m;
            float f18 = this.f142571h * this.f142567d;
            float measuredHeight = getMeasuredHeight();
            java.lang.String[] strArr = this.f142569f;
            int length = (int) ((f17 - ((measuredHeight - (strArr.length * f18)) / 2.0f)) / f18);
            if (length < 0) {
                length = 0;
            }
            if (length >= strArr.length) {
                length = strArr.length - 1;
            }
            this.f142570g = length;
            if (length == -1) {
                this.f142575o.setText(com.tencent.mm.R.string.ibx);
            } else {
                this.f142575o.setText(strArr[length]);
            }
            this.f142574n.showAtLocation(this, 17, 0, 0);
            com.tencent.mm.plugin.ipcall.ui.j1 j1Var = this.f142576p;
            if (j1Var != null) {
                int i17 = this.f142570g;
                if (i17 == -1) {
                    ((com.tencent.mm.plugin.ipcall.ui.m1) j1Var).a(i65.a.r(getContext(), com.tencent.mm.R.string.ibx));
                } else {
                    ((com.tencent.mm.plugin.ipcall.ui.m1) j1Var).a(this.f142569f[i17]);
                }
            }
            invalidate();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            setBackgroundResource(0);
            this.f142574n.dismiss();
        }
        return true;
    }

    public void setOnScrollBarTouchListener(com.tencent.mm.plugin.ipcall.ui.j1 j1Var) {
        this.f142576p = j1Var;
    }
}
