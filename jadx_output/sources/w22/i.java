package w22;

/* loaded from: classes10.dex */
public final class i implements r22.e {

    /* renamed from: a, reason: collision with root package name */
    public final r22.f f442544a;

    /* renamed from: b, reason: collision with root package name */
    public final bw3.e f442545b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f442546c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f442547d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f442548e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f442549f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f442550g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f442551h;

    /* renamed from: i, reason: collision with root package name */
    public float f442552i;

    /* renamed from: j, reason: collision with root package name */
    public float f442553j;

    /* renamed from: k, reason: collision with root package name */
    public float f442554k;

    /* renamed from: l, reason: collision with root package name */
    public final float f442555l;

    /* renamed from: m, reason: collision with root package name */
    public final float f442556m;

    /* renamed from: n, reason: collision with root package name */
    public final float f442557n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f442558o;

    /* JADX WARN: Multi-variable type inference failed */
    public i(r22.f view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f442544a = view;
        bw3.e eVar = new bw3.e();
        this.f442545b = eVar;
        this.f442546c = new android.graphics.RectF();
        this.f442547d = new android.graphics.Path();
        this.f442548e = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f442549f = paint;
        this.f442551h = true;
        this.f442552i = 1.0f;
        this.f442553j = 2.0f;
        this.f442554k = 0.25f;
        this.f442558o = new float[2];
        android.content.res.Resources resources = ((android.view.View) view).getContext().getResources();
        eVar.f24927q = this.f442553j;
        eVar.f24928r = this.f442554k;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(resources.getDimension(com.tencent.mm.R.dimen.f480334uv));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f442555l = resources.getDimension(com.tencent.mm.R.dimen.f480334uv);
        this.f442556m = resources.getDimension(com.tencent.mm.R.dimen.f480332ut);
        this.f442557n = resources.getDimension(com.tencent.mm.R.dimen.f480333uu);
    }

    public final void a() {
        bw3.e eVar = this.f442545b;
        eVar.f24917g.reset();
        android.graphics.Matrix matrix = eVar.f24917g;
        android.graphics.Rect rect = this.f442548e;
        matrix.postTranslate((-rect.width()) / 2.0f, (-rect.height()) / 2.0f);
        android.graphics.RectF rectF = this.f442546c;
        if (!rectF.isEmpty() && !rect.isEmpty()) {
            float width = rectF.width() / java.lang.Math.max(rect.width(), rect.height());
            this.f442552i = width;
            float f17 = 0.5f * width;
            float f18 = 2.0f * width;
            this.f442553j = f18;
            float f19 = width * 0.25f;
            this.f442554k = f19;
            eVar.f24927q = f18;
            eVar.f24928r = f19;
            eVar.f24917g.postScale(f17, f17);
        }
        float f27 = 2;
        eVar.f24917g.postTranslate((rectF.left + rectF.right) / f27, (rectF.top + rectF.bottom) / f27);
    }
}
