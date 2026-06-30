package or2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f347628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347630c;

    /* renamed from: d, reason: collision with root package name */
    public final int f347631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f347632e;

    /* renamed from: f, reason: collision with root package name */
    public final float f347633f;

    /* renamed from: g, reason: collision with root package name */
    public long f347634g;

    /* renamed from: h, reason: collision with root package name */
    public long f347635h;

    /* renamed from: i, reason: collision with root package name */
    public long f347636i;

    /* renamed from: j, reason: collision with root package name */
    public long f347637j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f347638k;

    /* renamed from: l, reason: collision with root package name */
    public int f347639l;

    /* renamed from: m, reason: collision with root package name */
    public long f347640m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f347641n;

    /* renamed from: o, reason: collision with root package name */
    public long f347642o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f347643p;

    public h(java.lang.String scene, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f347628a = scene;
        this.f347629b = i17;
        this.f347630c = 3;
        this.f347631d = 1;
        this.f347632e = 2;
        this.f347633f = 0.041666668f;
        this.f347638k = new java.util.ArrayList();
        this.f347641n = new java.util.concurrent.CopyOnWriteArrayList();
        this.f347643p = "";
    }

    public final int a() {
        long b17 = b();
        int b18 = a06.d.b(b17 > 0 ? (this.f347639l * 1000.0f) / ((float) b17) : 0.0f);
        int i17 = this.f347629b;
        return i17 > b18 ? b18 : i17;
    }

    public final long b() {
        if (this.f347640m == 0) {
            this.f347640m = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f347636i - this.f347637j);
        }
        return this.f347640m;
    }

    public final int c() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f347641n;
        if ((copyOnWriteArrayList instanceof java.util.Collection) && copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if ((((or2.g) it.next()).f347627b == this.f347632e) && (i17 = i17 + 1) < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    public final long d() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        java.util.Iterator it = this.f347641n.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((or2.g) it.next()).f347626a;
        }
        return timeUnit.toMillis(j17);
    }

    public final int e() {
        if (d() == 0) {
            return 0;
        }
        int size = (int) ((this.f347641n.size() / ((float) d())) * 1000);
        int i17 = this.f347629b;
        return i17 > size ? size : i17;
    }

    public final int f() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f347641n;
        if ((copyOnWriteArrayList instanceof java.util.Collection) && copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if ((((or2.g) it.next()).f347627b == this.f347631d) && (i17 = i17 + 1) < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    public final float g() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f347641n;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((or2.g) it.next()).f347626a;
        }
        if (j18 == 0) {
            return 0.0f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = copyOnWriteArrayList.iterator();
        while (true) {
            boolean z17 = true;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            int i17 = ((or2.g) next).f347627b;
            if (i17 != this.f347631d && i17 != this.f347632e) {
                z17 = false;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            j17 += ((or2.g) it7.next()).f347626a;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) j17) / ((float) j18))}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.lang.Float f17 = r26.g0.f(format);
        if (f17 != null) {
            return f17.floatValue();
        }
        return 0.0f;
    }

    public java.lang.String toString() {
        boolean z17;
        int a17 = a();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17) {
            return "";
        }
        return this.f347643p + " jank:" + f() + " bigJank:" + c() + " stutter:" + g() + " FrameTimeDuration:" + d() + " Duration=" + b() + "ms FrameTimeFPS:" + e() + " FPS=" + a17 + " RefreshRate=" + this.f347629b + " FrameCount=" + this.f347639l + " FrameTimeCount=" + this.f347641n.size() + " DropList=" + this.f347638k;
    }
}
