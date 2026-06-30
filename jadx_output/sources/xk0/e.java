package xk0;

/* loaded from: classes10.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f454946a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f454947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f454948c;

    public e(xk0.f fVar, java.util.List list) {
        int size = list.size();
        this.f454948c = size;
        this.f454946a = new float[size];
        this.f454947b = new float[size];
        for (int i17 = 0; i17 < this.f454948c; i17++) {
            this.f454946a[i17] = ((android.graphics.PointF) list.get(i17)).x;
            this.f454947b[i17] = ((android.graphics.PointF) list.get(i17)).y;
        }
    }
}
