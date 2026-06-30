package d6;

/* loaded from: classes10.dex */
public final class a implements d6.h {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f226633c;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f226633c = context;
    }

    @Override // d6.h
    public java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        android.util.DisplayMetrics displayMetrics = this.f226633c.getResources().getDisplayMetrics();
        return new coil.size.PixelSize(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof d6.a) {
                if (kotlin.jvm.internal.o.b(this.f226633c, ((d6.a) obj).f226633c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f226633c.hashCode();
    }

    public java.lang.String toString() {
        return "DisplaySizeResolver(context=" + this.f226633c + ')';
    }
}
