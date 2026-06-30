package g4;

/* loaded from: classes5.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f268352a;

    /* renamed from: b, reason: collision with root package name */
    public final int f268353b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f268354c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f268356e;

    /* renamed from: f, reason: collision with root package name */
    public final int f268357f;

    public h3(int i17, int i18, boolean z17, int i19, int i27, int i28, int i29, kotlin.jvm.internal.i iVar) {
        i18 = (i29 & 2) != 0 ? i17 : i18;
        boolean z18 = true;
        z17 = (i29 & 4) != 0 ? true : z17;
        i19 = (i29 & 8) != 0 ? i17 * 3 : i19;
        i27 = (i29 & 16) != 0 ? Integer.MAX_VALUE : i27;
        i28 = (i29 & 32) != 0 ? Integer.MIN_VALUE : i28;
        this.f268352a = i17;
        this.f268353b = i18;
        this.f268354c = z17;
        this.f268355d = i19;
        this.f268356e = i27;
        this.f268357f = i28;
        if (!z17 && i18 == 0) {
            throw new java.lang.IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i27 == Integer.MAX_VALUE || i27 >= (i18 * 2) + i17) {
            if (i28 != Integer.MIN_VALUE && i28 <= 0) {
                z18 = false;
            }
            if (!z18) {
                throw new java.lang.IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i17 + ", prefetchDist=" + i18 + ", maxSize=" + i27);
    }
}
