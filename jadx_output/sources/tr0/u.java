package tr0;

/* loaded from: classes10.dex */
public final class u implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f421365d;

    public u(float f17) {
        this.f421365d = f17;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.hardware.Camera.Size size = (android.hardware.Camera.Size) obj;
        android.hardware.Camera.Size size2 = (android.hardware.Camera.Size) obj2;
        float max = (java.lang.Math.max(size.width, size.height) * 1.0f) / java.lang.Math.min(size.width, size.height);
        float max2 = (java.lang.Math.max(size2.width, size2.height) * 1.0f) / java.lang.Math.min(size2.width, size2.height);
        float f17 = this.f421365d;
        float abs = java.lang.Math.abs(f17 - max) - java.lang.Math.abs(f17 - max2);
        if (abs > 0.0f) {
            return 1;
        }
        return abs < 0.0f ? -1 : 0;
    }
}
