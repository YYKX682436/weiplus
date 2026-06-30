package s8;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f404706a = new t9.p(8);

    /* renamed from: b, reason: collision with root package name */
    public int f404707b;

    public final long a(q8.f fVar) {
        t9.p pVar = this.f404706a;
        int i17 = 0;
        ((q8.b) fVar).b(pVar.f416540a, 0, 1, false);
        int i18 = pVar.f416540a[0] & 255;
        if (i18 == 0) {
            return Long.MIN_VALUE;
        }
        int i19 = 128;
        int i27 = 0;
        while ((i18 & i19) == 0) {
            i19 >>= 1;
            i27++;
        }
        int i28 = i18 & (~i19);
        ((q8.b) fVar).b(pVar.f416540a, 1, i27, false);
        while (i17 < i27) {
            i17++;
            i28 = (pVar.f416540a[i17] & 255) + (i28 << 8);
        }
        this.f404707b += i27 + 1;
        return i28;
    }
}
