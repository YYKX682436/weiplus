package mt0;

/* loaded from: classes4.dex */
public class a extends android.graphics.drawable.Drawable implements com.tencent.mm.memory.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f331185d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.memory.r f331186e;

    public a(java.lang.String str, com.tencent.mm.memory.r rVar) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f331185d = paint;
        this.f331186e = rVar;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(false);
        paint.setColor(-1118482);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.memory.l
    public void a() {
        com.tencent.mm.memory.r rVar = this.f331186e;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // com.tencent.mm.memory.l
    public void b() {
        com.tencent.mm.memory.r rVar = this.f331186e;
        if (rVar != null) {
            rVar.b();
        }
    }

    public com.tencent.mm.memory.r c() {
        com.tencent.mm.memory.r rVar = this.f331186e;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        com.tencent.mm.memory.r rVar = this.f331186e;
        if (rVar == null || rVar.e()) {
            canvas.drawColor(-1118482);
        } else {
            canvas.drawBitmap(rVar.f68970d, (android.graphics.Rect) null, bounds, this.f331185d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        com.tencent.mm.memory.r rVar = this.f331186e;
        if (rVar == null || rVar.e()) {
            return 0;
        }
        return rVar.f68970d.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        com.tencent.mm.memory.r rVar = this.f331186e;
        if (rVar == null || rVar.e()) {
            return 0;
        }
        return rVar.f68970d.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    public java.lang.String toString() {
        return super.toString();
    }
}
