package sm3;

/* loaded from: classes10.dex */
public final class e extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f409851d;

    /* renamed from: e, reason: collision with root package name */
    public final float f409852e;

    /* renamed from: f, reason: collision with root package name */
    public final float f409853f;

    /* renamed from: g, reason: collision with root package name */
    public final float f409854g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f409855h;

    /* renamed from: i, reason: collision with root package name */
    public final int f409856i;

    /* renamed from: m, reason: collision with root package name */
    public long f409857m;

    /* renamed from: n, reason: collision with root package name */
    public long f409858n;

    /* renamed from: o, reason: collision with root package name */
    public sm3.d f409859o;

    public e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479591a1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f409851d = paint;
        this.f409858n = 1000L;
        paint.setColor(-1);
        paint.setTextSize(dimensionPixelSize);
        this.f409852e = paint.measureText("00:00");
        this.f409854g = paint.getFontMetrics().top;
        this.f409853f = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.tencent.mm.R.drawable.f481998ar3);
        kotlin.jvm.internal.o.d(drawable);
        this.f409855h = drawable;
        int b17 = i65.a.b(context, 2);
        this.f409856i = b17;
        drawable.setBounds(0, 0, b17, b17);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        sm3.d dVar = this.f409859o;
        if (dVar == null) {
            return;
        }
        float width = parent.getWidth() / 2;
        float f17 = this.f409852e;
        int b17 = a06.d.b((width + f17) / dVar.f409847c);
        long b18 = this.f409857m - a06.d.b((parent.getWidth() / 2) / dVar.f409847c);
        long j17 = this.f409857m;
        long j18 = b17;
        long j19 = j17 - j18;
        if (j19 < 0) {
            j19 = 0;
        }
        long j27 = j17 + j18;
        long j28 = this.f409858n;
        if (j27 > j28) {
            j27 = j28;
        }
        long j29 = dVar.f409846b;
        long j37 = j19 / j29;
        long j38 = j27 / j29;
        if (j37 > j38) {
            return;
        }
        while (true) {
            long j39 = dVar.f409846b * j37;
            float f18 = ((float) (j39 - b18)) * dVar.f409847c;
            if (j37 % 2 == 1) {
                int i17 = (int) f18;
                int i18 = this.f409856i;
                int i19 = i17 - (i18 / 2);
                float f19 = this.f409853f;
                int i27 = (((int) f19) - i18) / 2;
                int i28 = i17 + (i18 / 2);
                int i29 = (((int) f19) + i18) / 2;
                android.graphics.drawable.Drawable drawable = this.f409855h;
                drawable.setBounds(i19, i27, i28, i29);
                drawable.draw(c17);
            } else {
                c17.drawText(y46.b.a(j39, "mm:ss", true), f18 - (f17 / 2), -this.f409854g, this.f409851d);
            }
            if (j37 == j38) {
                return;
            } else {
                j37++;
            }
        }
    }
}
