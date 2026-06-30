package um5;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public int f429141b;

    /* renamed from: c, reason: collision with root package name */
    public int f429142c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f429143d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f429140a = "BitmapEffector@" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final um5.p f429144e = new um5.p();

    public final void a(yz5.l callback) {
        int i17;
        kotlin.jvm.internal.o.g(callback, "callback");
        int i18 = this.f429141b;
        if (i18 <= 0 || (i17 = this.f429142c) <= 0) {
            xm5.b.f(this.f429140a, "size error [" + this.f429141b + ", " + this.f429142c + ']', new java.lang.Object[0]);
            callback.invoke(this.f429143d);
            return;
        }
        boolean z17 = tq5.k.f421272a;
        um5.p pVar = this.f429144e;
        if (z17) {
            pVar.j(i18, i17);
            pVar.d();
            pVar.i(new um5.b(callback));
        } else {
            callback.invoke(null);
        }
        pVar.f(new um5.c(this));
    }

    public final void b(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        xm5.b.c(this.f429140a, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new java.lang.Object[0]);
        this.f429143d = bitmap;
        this.f429144e.l(bitmap);
    }
}
