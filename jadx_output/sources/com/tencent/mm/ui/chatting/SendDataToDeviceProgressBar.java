package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class SendDataToDeviceProgressBar extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f198305d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f198306e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f198307f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f198308g;

    /* renamed from: h, reason: collision with root package name */
    public final int f198309h;

    /* renamed from: i, reason: collision with root package name */
    public final int f198310i;

    /* renamed from: m, reason: collision with root package name */
    public int f198311m;

    /* renamed from: n, reason: collision with root package name */
    public int f198312n;

    /* renamed from: o, reason: collision with root package name */
    public final int f198313o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f198314p;

    public SendDataToDeviceProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getProgress() {
        return (int) ((this.f198308g / 360.0f) * 100.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        this.f198307f.setColor(this.f198306e.getResources().getColor(com.tencent.mm.R.color.a1z));
        this.f198307f.setStrokeWidth(this.f198313o);
        if (this.f198311m == -1) {
            this.f198311m = (width * 2) - this.f198309h;
        }
        if (this.f198312n == -1) {
            this.f198312n = this.f198311m;
        }
        android.graphics.RectF rectF = new android.graphics.RectF(this.f198309h, this.f198310i, this.f198311m, this.f198312n);
        canvas.drawArc(rectF, 270.0f, this.f198308g, false, this.f198307f);
        int i17 = this.f198308g + 270;
        if (i17 > 360) {
            i17 += org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
        }
        this.f198307f.setColor(this.f198306e.getResources().getColor(com.tencent.mm.R.color.a1x));
        canvas.drawArc(rectF, i17, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 - this.f198308g, false, this.f198307f);
    }

    public void setProgress(int i17) {
        if (i17 >= 100) {
            i17 = 100;
        }
        this.f198308g = (int) ((i17 / 100.0f) * 360.0f);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f198305d;
        java.lang.Runnable runnable = this.f198314p;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 0);
    }

    public SendDataToDeviceProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f198308g = 2;
        this.f198309h = -1;
        this.f198310i = -1;
        this.f198311m = -1;
        this.f198312n = -1;
        this.f198313o = -1;
        this.f198314p = new com.tencent.mm.ui.chatting.rc(this);
        setImageResource(com.tencent.mm.R.drawable.avs);
        this.f198306e = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f198307f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a9n);
        this.f198309h = dimensionPixelSize;
        this.f198310i = dimensionPixelSize;
        this.f198313o = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a9o);
        this.f198305d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }
}
