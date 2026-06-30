package u9;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f425726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425727b;

    /* renamed from: c, reason: collision with root package name */
    public final int f425728c;

    /* renamed from: d, reason: collision with root package name */
    public final int f425729d;

    /* renamed from: e, reason: collision with root package name */
    public final float f425730e;

    public a(java.util.List list, int i17, int i18, int i19, float f17) {
        this.f425726a = list;
        this.f425727b = i17;
        this.f425728c = i18;
        this.f425729d = i19;
        this.f425730e = f17;
    }

    public static u9.a a(t9.p pVar) {
        byte[] bArr;
        int i17;
        int i18;
        float f17;
        try {
            pVar.x(4);
            int m17 = (pVar.m() & 3) + 1;
            if (m17 == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int m18 = pVar.m() & 31;
            int i19 = 0;
            while (true) {
                bArr = t9.e.f416505a;
                if (i19 >= m18) {
                    break;
                }
                int r17 = pVar.r();
                int i27 = pVar.f416541b;
                pVar.x(r17);
                byte[] bArr2 = pVar.f416540a;
                byte[] bArr3 = new byte[r17 + 4];
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, 4);
                java.lang.System.arraycopy(bArr2, i27, bArr3, 4, r17);
                arrayList.add(bArr3);
                i19++;
            }
            int m19 = pVar.m();
            for (int i28 = 0; i28 < m19; i28++) {
                int r18 = pVar.r();
                int i29 = pVar.f416541b;
                pVar.x(r18);
                byte[] bArr4 = pVar.f416540a;
                byte[] bArr5 = new byte[r18 + 4];
                java.lang.System.arraycopy(bArr, 0, bArr5, 0, 4);
                java.lang.System.arraycopy(bArr4, i29, bArr5, 4, r18);
                arrayList.add(bArr5);
            }
            if (m18 > 0) {
                t9.m d17 = t9.n.d((byte[]) arrayList.get(0), m17, ((byte[]) arrayList.get(0)).length);
                int i37 = d17.f416523b;
                int i38 = d17.f416524c;
                f17 = d17.f416525d;
                i17 = i37;
                i18 = i38;
            } else {
                i17 = -1;
                i18 = -1;
                f17 = 1.0f;
            }
            return new u9.a(arrayList, m17, i17, i18, f17);
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            throw new m8.x("Error parsing AVC config", e17);
        }
    }
}
