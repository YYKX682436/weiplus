package we1;

/* loaded from: classes13.dex */
public class a implements we1.h {

    /* renamed from: k, reason: collision with root package name */
    public static int f445193k;

    /* renamed from: l, reason: collision with root package name */
    public static int f445194l;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f445195a;

    /* renamed from: b, reason: collision with root package name */
    public int f445196b;

    /* renamed from: c, reason: collision with root package name */
    public int f445197c;

    /* renamed from: d, reason: collision with root package name */
    public android.text.StaticLayout f445198d;

    /* renamed from: e, reason: collision with root package name */
    public int f445199e;

    /* renamed from: f, reason: collision with root package name */
    public int f445200f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f445201g;

    /* renamed from: h, reason: collision with root package name */
    public final int f445202h;

    /* renamed from: i, reason: collision with root package name */
    public int f445203i;

    /* renamed from: j, reason: collision with root package name */
    public final float f445204j;

    public a(android.content.Context context, android.text.SpannableString spannableString, int i17, int i18, float f17, int i19) {
        this.f445203i = -1;
        this.f445195a = context;
        if (i18 > 0) {
            this.f445201g = i65.a.b(context, i18);
        } else {
            this.f445201g = i65.a.b(context, 18);
        }
        this.f445203i = i17;
        this.f445204j = f17;
        this.f445202h = i19;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(this.f445203i);
        textPaint.setTextSize(this.f445201g);
        android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        java.lang.Math.ceil(fontMetrics.descent - fontMetrics.top);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannableString, textPaint, ((int) android.text.Layout.getDesiredWidth(spannableString, 0, spannableString.length(), textPaint)) + 1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f445198d = staticLayout;
        this.f445199e = staticLayout.getWidth();
    }

    public void a(android.graphics.Canvas canvas, boolean z17) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (width != f445193k || height != f445194l) {
            f445193k = width;
            f445194l = height;
        }
        canvas.save();
        canvas.translate(this.f445196b, this.f445197c);
        this.f445198d.draw(canvas);
        canvas.restore();
        if (z17) {
            return;
        }
        this.f445196b = (int) (this.f445196b - (3 * this.f445204j));
    }

    public boolean b(we1.h hVar) {
        int i17 = ((we1.a) hVar).f445199e;
        we1.a aVar = (we1.a) hVar;
        if (i17 + aVar.f445196b > f445193k) {
            return true;
        }
        if (this.f445200f < 0) {
            this.f445200f = i65.a.b(this.f445195a, 20);
        }
        float f17 = aVar.f445204j;
        float f18 = this.f445204j;
        if (f17 >= f18) {
            return f17 == f18 && ((float) (f445193k - (aVar.f445196b + aVar.f445199e))) < ((float) this.f445200f);
        }
        float f19 = 3;
        return ((double) (((((float) (aVar.f445196b + aVar.f445199e)) / (f17 * f19)) * f18) * f19)) > ((double) f445193k) - (((double) this.f445200f) * 1.5d);
    }
}
