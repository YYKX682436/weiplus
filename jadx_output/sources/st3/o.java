package st3;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.o f412557a = new st3.o();

    /* renamed from: b, reason: collision with root package name */
    public static int f412558b;

    /* renamed from: c, reason: collision with root package name */
    public static int f412559c;

    /* renamed from: d, reason: collision with root package name */
    public static int f412560d;

    public final int a() {
        if (f412558b <= 0) {
            c();
        }
        return f412558b;
    }

    public final android.graphics.Point b(int i17, int i18) {
        int a17 = a();
        android.graphics.Point point = new android.graphics.Point(i17, i18);
        if (i17 > i18) {
            if (i18 > a17) {
                point.y = a17;
                point.x = (int) (i17 * (a17 / i18));
            }
        } else if (i17 > a17) {
            point.x = a17;
            point.y = (int) ((i18 * a17) / i17);
        }
        return point;
    }

    public final synchronized android.graphics.Point c() {
        if (f412559c <= 0 || f412560d <= 0) {
            int i17 = d11.s.fj().rj().f71191d;
            android.graphics.Point h17 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i18 = (h17.y * i17) / h17.x;
            if (i18 % 16 != 0) {
                i18 = ai3.d.a(i18);
            }
            if (i17 % 16 != 0) {
                i17 = ai3.d.a(i17);
            }
            f412559c = i17;
            f412560d = i18;
            f412558b = i17;
        }
        return new android.graphics.Point(f412559c, f412560d);
    }
}
