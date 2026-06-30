package ox1;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f349595a;

    /* renamed from: b, reason: collision with root package name */
    public int f349596b;

    /* renamed from: c, reason: collision with root package name */
    public int f349597c;

    /* renamed from: d, reason: collision with root package name */
    public int f349598d;

    public e() {
        this.f349595a = -1;
        this.f349596b = -1;
        this.f349597c = -1;
        this.f349598d = -1;
    }

    public int a() {
        int i17;
        int i18;
        int i19;
        int i27 = this.f349595a;
        if (i27 >= 0 && (i17 = this.f349596b) >= 0 && (i18 = this.f349597c) >= 0 && (i19 = this.f349598d) >= 0 && i27 <= i18 && (i27 != i18 || i17 <= i19)) {
            ix1.a l17 = nx1.d.q().l(this.f349595a);
            ix1.a l18 = nx1.d.q().l(this.f349597c);
            if (l17 != null && l18 != null) {
                int i28 = this.f349595a;
                int i29 = this.f349597c;
                if (i28 == i29 && this.f349596b == this.f349598d) {
                    return 1;
                }
                return (i28 == i29 && l17.b() == 1) ? 2 : 3;
            }
        }
        return 0;
    }

    public e(int i17, int i18, int i19, int i27) {
        this.f349595a = i17;
        this.f349596b = i18;
        this.f349597c = i19;
        this.f349598d = i27;
    }
}
