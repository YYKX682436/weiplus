package qm5;

/* loaded from: classes14.dex */
public class n {

    /* renamed from: q, reason: collision with root package name */
    public boolean f364857q = false;

    /* renamed from: a, reason: collision with root package name */
    public int f364841a = 35;

    /* renamed from: e, reason: collision with root package name */
    public float f364845e = 1.2f;

    /* renamed from: f, reason: collision with root package name */
    public float f364846f = 1.2f;

    /* renamed from: d, reason: collision with root package name */
    public int f364844d = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f364842b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f364843c = 6;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364849i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f364850j = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f364847g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f364848h = 0;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f364853m = new float[6];

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f364854n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final int[] f364855o = new int[10];

    /* renamed from: p, reason: collision with root package name */
    public final int[] f364856p = new int[10];

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer f364851k = java.nio.ByteBuffer.allocate(6125);

    /* renamed from: l, reason: collision with root package name */
    public java.nio.ByteBuffer f364852l = java.nio.ByteBuffer.allocate(6125);

    public final int a(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        int i19 = byteBuffer.get(i18) & 255;
        int i27 = byteBuffer.get(i18 - 1) & 255;
        int i28 = byteBuffer.get(i18 - 2) & 255;
        int i29 = byteBuffer.get(i18 + 1) & 255;
        int i37 = byteBuffer.get(i18 + 2) & 255;
        int i38 = i18 - i17;
        int i39 = byteBuffer.get(i38) & 255;
        int i47 = i17 * 2;
        int i48 = i18 - i47;
        int i49 = byteBuffer.get(i48) & 255;
        int i57 = i18 + i17;
        int i58 = byteBuffer.get(i57) & 255;
        int i59 = i18 + i47;
        int i66 = byteBuffer.get(i59) & 255;
        int i67 = byteBuffer.get(i38 - 1) & 255;
        int i68 = byteBuffer.get(i48 - 2) & 255;
        int i69 = byteBuffer.get(i57 + 1) & 255;
        int i76 = byteBuffer.get(i59 + 2) & 255;
        int i77 = byteBuffer.get(i38 + 1) & 255;
        int i78 = byteBuffer.get(i48 + 2) & 255;
        int i79 = byteBuffer.get(i57 - 1) & 255;
        int i86 = byteBuffer.get(i59 - 2) & 255;
        int i87 = i19 * 4;
        int i88 = (i87 - i27) - i28;
        int i89 = (i87 - i39) - i49;
        return java.lang.Math.abs((i88 - i29) - i37) + java.lang.Math.abs((i89 - i58) - i66) + java.lang.Math.abs((((i87 - i67) - i68) - i69) - i76) + java.lang.Math.abs((((i87 - i77) - i78) - i79) - i86) + java.lang.Math.abs((i89 - i29) - i37) + java.lang.Math.abs((i88 - i58) - i66) + java.lang.Math.abs((i88 - i39) - i49) + java.lang.Math.abs((((i87 - i58) - i66) - i29) - i37);
    }

    public final float b(float f17, float f18) {
        float f19 = 0.0f;
        if (f18 >= 80.0f && f18 >= 120.0f) {
            f19 = 0.5f;
        }
        return (f17 < 0.8f ? 4.0f : f17 < 1.5f ? 3.6f : f17 < 2.4f ? 3.2f : 2.8f) - f19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0111, code lost:
    
        if (r13 < r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0474  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(byte[] r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qm5.n.c(byte[], int, int):int");
    }
}
