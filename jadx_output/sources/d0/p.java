package d0;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final d0.p f225183a = new d0.p();

    /* renamed from: b, reason: collision with root package name */
    public static final d0.d f225184b = new d0.j();

    /* renamed from: c, reason: collision with root package name */
    public static final d0.d f225185c = new d0.c();

    /* renamed from: d, reason: collision with root package name */
    public static final d0.l f225186d = new d0.k();

    /* renamed from: e, reason: collision with root package name */
    public static final d0.l f225187e = new d0.a();

    /* renamed from: f, reason: collision with root package name */
    public static final d0.e f225188f = new d0.b();

    /* renamed from: g, reason: collision with root package name */
    public static final d0.e f225189g;

    static {
        new d0.h();
        f225189g = new d0.g();
        new d0.f();
    }

    public final void a(int i17, int[] size, int[] outPosition, boolean z17) {
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(outPosition, "outPosition");
        int i18 = 0;
        int i19 = 0;
        for (int i27 : size) {
            i19 += i27;
        }
        float f17 = (i17 - i19) / 2;
        if (!z17) {
            int length = size.length;
            int i28 = 0;
            while (i18 < length) {
                int i29 = size[i18];
                outPosition[i28] = a06.d.b(f17);
                f17 += i29;
                i18++;
                i28++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i37 = size[length2];
            outPosition[length2] = a06.d.b(f17);
            f17 += i37;
        }
    }

    public final void b(int[] size, int[] outPosition, boolean z17) {
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(outPosition, "outPosition");
        int i17 = 0;
        if (!z17) {
            int length = size.length;
            int i18 = 0;
            int i19 = 0;
            while (i17 < length) {
                int i27 = size[i17];
                outPosition[i18] = i19;
                i19 += i27;
                i17++;
                i18++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i28 = size[length2];
            outPosition[length2] = i17;
            i17 += i28;
        }
    }

    public final void c(int i17, int[] size, int[] outPosition, boolean z17) {
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(outPosition, "outPosition");
        int i18 = 0;
        int i19 = 0;
        for (int i27 : size) {
            i19 += i27;
        }
        int i28 = i17 - i19;
        if (!z17) {
            int length = size.length;
            int i29 = 0;
            while (i18 < length) {
                int i37 = size[i18];
                outPosition[i29] = i28;
                i28 += i37;
                i18++;
                i29++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i38 = size[length2];
            outPosition[length2] = i28;
            i28 += i38;
        }
    }

    public final void d(int i17, int[] size, int[] outPosition, boolean z17) {
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(outPosition, "outPosition");
        int i18 = 0;
        int i19 = 0;
        for (int i27 : size) {
            i19 += i27;
        }
        float length = (size.length == 0) ^ true ? (i17 - i19) / size.length : 0.0f;
        float f17 = length / 2;
        if (z17) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i28 = size[length2];
                outPosition[length2] = a06.d.b(f17);
                f17 += i28 + length;
            }
            return;
        }
        int length3 = size.length;
        int i29 = 0;
        while (i18 < length3) {
            int i37 = size[i18];
            outPosition[i29] = a06.d.b(f17);
            f17 += i37 + length;
            i18++;
            i29++;
        }
    }

    public final void e(int i17, int[] size, int[] outPosition, boolean z17) {
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(outPosition, "outPosition");
        int i18 = 0;
        int i19 = 0;
        for (int i27 : size) {
            i19 += i27;
        }
        float f17 = 0.0f;
        float length = size.length > 1 ? (i17 - i19) / (size.length - 1) : 0.0f;
        if (z17) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i28 = size[length2];
                outPosition[length2] = a06.d.b(f17);
                f17 += i28 + length;
            }
            return;
        }
        int length3 = size.length;
        int i29 = 0;
        while (i18 < length3) {
            int i37 = size[i18];
            outPosition[i29] = a06.d.b(f17);
            f17 += i37 + length;
            i18++;
            i29++;
        }
    }

    public final void f(int i17, int[] size, int[] outPosition, boolean z17) {
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(outPosition, "outPosition");
        int i18 = 0;
        int i19 = 0;
        for (int i27 : size) {
            i19 += i27;
        }
        float length = (i17 - i19) / (size.length + 1);
        if (z17) {
            float f17 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i28 = size[length2];
                outPosition[length2] = a06.d.b(f17);
                f17 += i28 + length;
            }
            return;
        }
        int length3 = size.length;
        float f18 = length;
        int i29 = 0;
        while (i18 < length3) {
            int i37 = size[i18];
            outPosition[i29] = a06.d.b(f18);
            f18 += i37 + length;
            i18++;
            i29++;
        }
    }

    public final d0.e g(float f17) {
        return new d0.i(f17, true, d0.m.f225170d, null);
    }
}
