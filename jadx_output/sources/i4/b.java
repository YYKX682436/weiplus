package i4;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f288322a;

    /* renamed from: b, reason: collision with root package name */
    public int f288323b;

    /* renamed from: c, reason: collision with root package name */
    public int f288324c;

    /* renamed from: d, reason: collision with root package name */
    public int f288325d;

    /* renamed from: e, reason: collision with root package name */
    public int f288326e;

    /* renamed from: f, reason: collision with root package name */
    public int f288327f;

    /* renamed from: g, reason: collision with root package name */
    public int f288328g;

    /* renamed from: h, reason: collision with root package name */
    public int f288329h;

    /* renamed from: i, reason: collision with root package name */
    public int f288330i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i4.c f288331j;

    public b(i4.c cVar, int i17, int i18) {
        this.f288331j = cVar;
        this.f288322a = i17;
        this.f288323b = i18;
        a();
    }

    public final void a() {
        i4.c cVar = this.f288331j;
        int[] iArr = cVar.f288333a;
        int[] iArr2 = cVar.f288334b;
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        int i19 = Integer.MIN_VALUE;
        int i27 = 0;
        int i28 = Integer.MAX_VALUE;
        int i29 = Integer.MAX_VALUE;
        int i37 = Integer.MIN_VALUE;
        for (int i38 = this.f288322a; i38 <= this.f288323b; i38++) {
            int i39 = iArr[i38];
            i27 += iArr2[i39];
            int i47 = (i39 >> 10) & 31;
            int i48 = (i39 >> 5) & 31;
            int i49 = i39 & 31;
            if (i47 > i37) {
                i37 = i47;
            }
            if (i47 < i17) {
                i17 = i47;
            }
            if (i48 > i18) {
                i18 = i48;
            }
            if (i48 < i28) {
                i28 = i48;
            }
            if (i49 > i19) {
                i19 = i49;
            }
            if (i49 < i29) {
                i29 = i49;
            }
        }
        this.f288325d = i17;
        this.f288326e = i37;
        this.f288327f = i28;
        this.f288328g = i18;
        this.f288329h = i29;
        this.f288330i = i19;
        this.f288324c = i27;
    }
}
