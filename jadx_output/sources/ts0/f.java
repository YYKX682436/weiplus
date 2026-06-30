package ts0;

/* loaded from: classes10.dex */
public final class f implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Integer.valueOf(((android.hardware.Camera.Size) obj2).width), java.lang.Integer.valueOf(((android.hardware.Camera.Size) obj).width));
    }
}
