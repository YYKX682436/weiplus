package np0;

/* loaded from: classes10.dex */
public abstract class a {
    public static long a(java.lang.Object obj) {
        if (obj == null || !(obj instanceof android.graphics.Bitmap)) {
            return 0L;
        }
        return ((android.graphics.Bitmap) obj).getByteCount();
    }
}
