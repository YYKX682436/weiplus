package u4;

/* loaded from: classes13.dex */
public final class a extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f424437a;

    public a(java.lang.Class cls, java.lang.String str) {
        super(cls, str);
        this.f424437a = new android.graphics.Rect();
    }

    @Override // android.util.Property
    public java.lang.Object get(java.lang.Object obj) {
        ((android.graphics.drawable.Drawable) obj).copyBounds(this.f424437a);
        return new android.graphics.PointF(r0.left, r0.top);
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        android.graphics.Rect rect = this.f424437a;
        drawable.copyBounds(rect);
        rect.offsetTo(java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
