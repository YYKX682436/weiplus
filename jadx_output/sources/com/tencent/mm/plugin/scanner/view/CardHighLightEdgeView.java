package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class CardHighLightEdgeView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public boolean[] f159861d;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f159862e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f159863f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f159864g;

    /* renamed from: h, reason: collision with root package name */
    public int f159865h;

    /* renamed from: i, reason: collision with root package name */
    public long f159866i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f159867m;

    public CardHighLightEdgeView(android.content.Context context) {
        super(context);
        this.f159861d = new boolean[4];
        this.f159862e = new boolean[4];
        this.f159867m = new com.tencent.mm.plugin.scanner.view.a(this);
        a();
    }

    public final void a() {
        this.f159865h = bp.b.decodeResource(getResources(), com.tencent.mm.R.drawable.ceu, null).getWidth() / 4;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f159864g = paint;
        paint.setColor(508256);
        this.f159864g.setAlpha(255);
        this.f159864g.setStrokeWidth(this.f159865h);
        this.f159864g.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Rect rect = this.f159863f;
        if (rect != null) {
            if (this.f159861d[0]) {
                int i17 = rect.left;
                int i18 = this.f159865h;
                canvas.drawLine((i18 / 2) + i17, rect.top, i17 + (i18 / 2), rect.bottom, this.f159864g);
            }
            if (this.f159861d[1]) {
                int i19 = this.f159863f.right;
                int i27 = this.f159865h;
                canvas.drawLine(i19 - (i27 / 2), r0.top, i19 - (i27 / 2), r0.bottom, this.f159864g);
            }
            if (this.f159861d[2]) {
                android.graphics.Rect rect2 = this.f159863f;
                float f17 = rect2.left;
                int i28 = rect2.top;
                int i29 = this.f159865h;
                canvas.drawLine(f17, (i29 / 2) + i28, rect2.right, i28 + (i29 / 2), this.f159864g);
            }
            if (this.f159861d[3]) {
                android.graphics.Rect rect3 = this.f159863f;
                float f18 = rect3.left;
                int i37 = rect3.bottom;
                int i38 = this.f159865h;
                canvas.drawLine(f18, i37 - (i38 / 2), rect3.right, i37 - (i38 / 2), this.f159864g);
            }
        }
    }

    public void setCardRect(android.graphics.Rect rect) {
        this.f159863f = new android.graphics.Rect(rect);
    }

    public void setHighLightEdges(boolean[] zArr) {
        if (zArr.length == 4) {
            boolean z17 = false;
            boolean z18 = zArr[0];
            boolean z19 = zArr[1];
            boolean z27 = zArr[2];
            boolean z28 = zArr[3];
            int i17 = 0;
            while (true) {
                if (i17 >= 4) {
                    z17 = true;
                    break;
                } else if (this.f159861d[i17]) {
                    break;
                } else {
                    i17++;
                }
            }
            long currentTimeMillis = !z17 ? 600 - (java.lang.System.currentTimeMillis() - this.f159866i) : 0L;
            this.f159862e = java.util.Arrays.copyOf(zArr, 4);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f159867m;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessageDelayed(1, currentTimeMillis > 0 ? currentTimeMillis : 0L);
        }
    }

    public CardHighLightEdgeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159861d = new boolean[4];
        this.f159862e = new boolean[4];
        this.f159867m = new com.tencent.mm.plugin.scanner.view.a(this);
        a();
    }

    public CardHighLightEdgeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159861d = new boolean[4];
        this.f159862e = new boolean[4];
        this.f159867m = new com.tencent.mm.plugin.scanner.view.a(this);
        a();
    }
}
