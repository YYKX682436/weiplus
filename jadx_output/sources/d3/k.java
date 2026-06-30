package d3;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f226097a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f226098b;

    public k(java.util.List list, java.util.List list2) {
        int size = list.size();
        this.f226097a = new int[size];
        this.f226098b = new float[size];
        for (int i17 = 0; i17 < size; i17++) {
            this.f226097a[i17] = ((java.lang.Integer) list.get(i17)).intValue();
            this.f226098b[i17] = ((java.lang.Float) list2.get(i17)).floatValue();
        }
    }

    public k(int i17, int i18) {
        this.f226097a = new int[]{i17, i18};
        this.f226098b = new float[]{0.0f, 1.0f};
    }

    public k(int i17, int i18, int i19) {
        this.f226097a = new int[]{i17, i18, i19};
        this.f226098b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
