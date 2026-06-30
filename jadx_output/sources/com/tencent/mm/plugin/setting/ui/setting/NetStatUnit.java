package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
class NetStatUnit extends android.view.View {

    /* renamed from: f, reason: collision with root package name */
    public static long f160153f;

    /* renamed from: d, reason: collision with root package name */
    public long f160154d;

    /* renamed from: e, reason: collision with root package name */
    public long f160155e;

    public NetStatUnit(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(long j17, long j18) {
        this.f160154d = j17;
        this.f160155e = j18;
        if (j17 > 94371840) {
            this.f160154d = 94371840L;
        }
        if (j18 > 94371840) {
            this.f160155e = 94371840L;
        }
        if (j17 <= j18) {
            j17 = j18;
        }
        long j19 = ((j17 / 1572864) + 1) * 1572864;
        long j27 = 94371840 > j19 ? j19 : 94371840L;
        if (3145728 >= j27) {
            j27 = 3145728;
        }
        if (j27 > f160153f) {
            f160153f = j27;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect();
        getDrawingRect(rect);
        int i17 = rect.left;
        int i18 = rect.bottom;
        android.graphics.Rect rect2 = new android.graphics.Rect(i17, (int) (i18 - ((rect.height() * ((float) this.f160155e)) / ((float) f160153f))), (int) (i17 + (rect.width() * 0.6f)), i18);
        paint.setColor(-7829368);
        canvas.drawRect(rect2, paint);
        float height = (rect.height() * ((float) this.f160154d)) / ((float) f160153f);
        float width = rect.width() * 0.6f;
        int i19 = rect.left;
        int i27 = rect.bottom;
        android.graphics.Rect rect3 = new android.graphics.Rect(i19, (int) (i27 - height), (int) (i19 + width), i27);
        paint.setColor(-16711936);
        canvas.drawRect(rect3, paint);
    }

    public NetStatUnit(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
