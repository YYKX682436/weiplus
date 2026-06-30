package com.tencent.mm.plugin.mmsight.ui.progressbar;

/* loaded from: classes13.dex */
public class MMSightProgressBar extends android.view.View {

    /* renamed from: h, reason: collision with root package name */
    public static final int f149387h = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final int f149388i = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 5);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f149389d;

    /* renamed from: e, reason: collision with root package name */
    public int f149390e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f149391f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f149392g;

    static {
        android.graphics.Color.parseColor("#F5B3B2");
        android.graphics.Color.parseColor("#EB6866");
        android.graphics.Color.parseColor("#E64340");
    }

    public MMSightProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149389d = new java.util.ArrayList(5);
        this.f149390e = 0;
        this.f149392g = null;
        a();
    }

    public final void a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f149391f = paint;
        paint.setColor(-65536);
        this.f149391f.setAntiAlias(true);
        this.f149392g = new ii3.a(this, android.os.Looper.getMainLooper());
        com.tencent.wcdb.support.Log.i("MicroMsg.MMSightProgressBar", "init, pointRadius: %s, pointDistance: %s", java.lang.Integer.valueOf(f149387h), java.lang.Integer.valueOf(f149388i));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        int i17;
        int i18;
        super.onDraw(canvas);
        java.util.List list = this.f149389d;
        int save = canvas.save();
        java.util.ArrayList<ii3.c> arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        this.f149390e = size;
        int i19 = size % 2;
        int i27 = f149388i;
        int i28 = f149387h;
        if (i19 == 0) {
            f17 = i27 / 2.0f;
            i17 = size / 2;
            i18 = (i17 - 1) * i27;
        } else {
            f17 = i28 / 2.0f;
            i17 = size / 2;
            i18 = i17 * i27;
        }
        float f18 = -(f17 + i18 + (i17 * i28));
        com.tencent.wcdb.support.Log.d("MicroMsg.MMSightProgressBar", "draw, translateX: %s, currentPointCount: %s", java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(this.f149390e));
        canvas.translate(f18, 0.0f);
        for (ii3.c cVar : arrayList) {
            android.graphics.Paint paint = this.f149391f;
            cVar.getClass();
            paint.setColor(0);
            cVar.getClass();
            cVar.getClass();
            cVar.f291627a = 0 + (((i28 * 2) + i27) * 0);
            cVar.getClass();
            cVar.f291628b = 0;
            com.tencent.wcdb.support.Log.d("MicroMsg.MMSightProgressPoint", "draw, index: %s, pointX: %s", 0, java.lang.Float.valueOf(cVar.f291627a));
            canvas.drawCircle(cVar.f291627a, cVar.f291628b, i28, paint);
            paint.setShader(null);
        }
        canvas.restoreToCount(save);
    }

    public void setProgressCallback(ii3.b bVar) {
    }

    public MMSightProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149389d = new java.util.ArrayList(5);
        this.f149390e = 0;
        this.f149392g = null;
        a();
    }
}
