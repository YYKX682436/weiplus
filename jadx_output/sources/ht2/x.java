package ht2;

/* loaded from: classes5.dex */
public final class x implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f284927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f284928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f284929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284931e;

    public x(android.graphics.drawable.BitmapDrawable bitmapDrawable, boolean z17, int i17, ht2.y0 y0Var, yz5.a aVar) {
        this.f284927a = bitmapDrawable;
        this.f284928b = z17;
        this.f284929c = i17;
        this.f284930d = y0Var;
        this.f284931e = aVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "[getIconSpan] successfully load resource=[" + bitmap.getWidth() + ':' + bitmap.getHeight() + ']');
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f284927a;
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapDrawable.getBitmap());
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
        if (this.f284928b) {
            canvas.drawBitmap(bitmap, rect, rect2, new android.graphics.Paint(3));
        } else {
            android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.CLEAR;
            int i17 = this.f284929c;
            canvas.drawColor(i17, mode);
            canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
            canvas.drawBitmap(bitmap, rect, rect2, new android.graphics.Paint(3));
            this.f284930d.cj(bitmapDrawable, i17);
        }
        pm0.v.X(new ht2.w(bitmapDrawable, this.f284931e));
    }
}
