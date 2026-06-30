package oc2;

/* loaded from: classes8.dex */
public final class h0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f344195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oc2.i0 f344197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cp5 f344198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f344199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f344200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344201g;

    public h0(android.graphics.drawable.BitmapDrawable bitmapDrawable, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, oc2.i0 i0Var, r45.cp5 cp5Var, java.lang.ref.WeakReference weakReference, long j17, java.lang.String str) {
        this.f344195a = bitmapDrawable;
        this.f344196b = renderView;
        this.f344197c = i0Var;
        this.f344198d = cp5Var;
        this.f344199e = weakReference;
        this.f344200f = j17;
        this.f344201g = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f344195a;
        if (bitmapDrawable.getBitmap() == null) {
            return;
        }
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f344196b;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e(renderView.h(), "[asyncLoadIcon] but result is null!");
            return;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapDrawable.getBitmap());
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
        canvas.drawColor(renderView.f105815m, android.graphics.PorterDuff.Mode.CLEAR);
        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(bitmap, rect, rect2, new android.graphics.Paint(3));
        pm0.v.X(new oc2.g0(this.f344197c, this.f344198d, this.f344196b, this.f344195a, this.f344199e, this.f344200f, bitmap, rect, rect2, this.f344201g));
    }
}
