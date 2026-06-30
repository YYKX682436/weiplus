package hp0;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f282909a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f282910b;

    /* renamed from: c, reason: collision with root package name */
    public int f282911c;

    public e(int i17, int i18, java.lang.Object obj) {
        this.f282909a = i18;
        this.f282910b = obj;
    }

    public final boolean a() {
        java.lang.Object obj = this.f282910b;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof android.graphics.Bitmap)) {
            return true;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
        return !((android.graphics.Bitmap) obj).isRecycled();
    }
}
