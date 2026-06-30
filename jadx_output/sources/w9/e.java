package w9;

/* loaded from: classes13.dex */
public class e extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.Property f444041a = new w9.e();

    public e() {
        super(java.lang.Integer.class, "drawableAlphaCompat");
        new java.util.WeakHashMap();
    }

    @Override // android.util.Property
    public java.lang.Object get(java.lang.Object obj) {
        return java.lang.Integer.valueOf(((android.graphics.drawable.Drawable) obj).getAlpha());
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        ((android.graphics.drawable.Drawable) obj).setAlpha(((java.lang.Integer) obj2).intValue());
    }
}
