package yw0;

/* loaded from: classes5.dex */
public final class b extends yw0.s {

    /* renamed from: b, reason: collision with root package name */
    public final int f466524b;

    /* renamed from: c, reason: collision with root package name */
    public final int f466525c;

    /* renamed from: d, reason: collision with root package name */
    public float f466526d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f466527e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f466528f;

    /* renamed from: g, reason: collision with root package name */
    public float f466529g;

    /* renamed from: h, reason: collision with root package name */
    public float f466530h;

    /* renamed from: i, reason: collision with root package name */
    public yw0.a f466531i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f466532j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Paint f466533k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f466534l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, yw0.r action) {
        super(action);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(action, "action");
        this.f466524b = j65.q.a(context).getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        this.f466525c = j65.q.a(context).getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        int dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj);
        int color = j65.q.a(context).getColor(com.tencent.mm.R.color.f479429ad5, null);
        this.f466526d = 0.5625f;
        this.f466527e = new android.graphics.RectF();
        this.f466528f = new android.graphics.RectF();
        this.f466531i = yw0.a.f466522e;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(color);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f466532j = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(j65.q.a(context).getColor(com.tencent.mm.R.color.afm, null));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f466533k = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(j65.q.a(context).getColor(com.tencent.mm.R.color.ac8, null));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint3.setStrokeWidth(dimensionPixelSize);
        this.f466534l = paint3;
    }

    @Override // yw0.s
    public void a() {
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.f466531i == yw0.a.f466522e) {
            return;
        }
        android.graphics.RectF rectF = this.f466528f;
        float f17 = rectF.left;
        float f18 = this.f466530h + 0.0f;
        android.graphics.Paint paint = this.f466532j;
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.drawRect(rectF.left, 0.0f, rectF.right, rectF.top, paint);
        canvas.drawRect(rectF.left, rectF.bottom, rectF.right, this.f466530h + 0.0f, paint);
        canvas.drawRect(rectF.right, 0.0f, this.f466529g + 0.0f, this.f466530h + 0.0f, paint);
        float f19 = this.f466529g;
        android.graphics.RectF rectF2 = this.f466527e;
        float f27 = rectF2.top;
        android.graphics.Paint paint2 = this.f466533k;
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.drawRect(0.0f, rectF2.top, rectF2.left, rectF2.bottom, paint2);
        canvas.drawRect(0.0f, rectF2.bottom, this.f466529g, this.f466530h, paint2);
        canvas.drawRect(rectF2.right, rectF2.top, this.f466529g, rectF2.bottom, paint2);
        canvas.drawRect(rectF2, this.f466534l);
    }

    @Override // yw0.s
    public void c(boolean z17, int i17, int i18, int i19, int i27) {
        this.f466529g = i19 - i17;
        this.f466530h = i27 - i18;
    }
}
