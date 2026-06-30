package nl;

/* loaded from: classes13.dex */
public abstract class e implements nl.f {

    /* renamed from: a, reason: collision with root package name */
    public short[][] f338147a = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, 1, 1);

    /* renamed from: b, reason: collision with root package name */
    public int f338148b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f338149c = 1;

    /* renamed from: d, reason: collision with root package name */
    public short[] f338150d = new short[1];

    /* renamed from: e, reason: collision with root package name */
    public int f338151e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f338152f = 32767;

    /* renamed from: g, reason: collision with root package name */
    public final int f338153g = -32768;

    /* renamed from: h, reason: collision with root package name */
    public hl.b f338154h;

    public byte[] a(int i17, int i18) {
        hl.b bVar = this.f338154h;
        byte[] bArr = bVar != null ? bVar.f282016c : null;
        if (bArr == null || bArr.length != i17) {
            bArr = new byte[i17];
        }
        for (int i19 = 0; i19 < i18; i19++) {
            int i27 = i19 * 2;
            short s17 = this.f338150d[i19];
            bArr[i27] = (byte) (s17 & 255);
            bArr[i27 + 1] = (byte) ((s17 & 65280) >> 8);
        }
        return bArr;
    }

    public abstract byte[] b(int i17, int i18, int i19);

    public short c(int i17) {
        int i18 = this.f338152f;
        if (i17 > i18) {
            return (short) i18;
        }
        int i19 = this.f338153g;
        return i17 < i19 ? (short) i19 : (short) i17;
    }
}
