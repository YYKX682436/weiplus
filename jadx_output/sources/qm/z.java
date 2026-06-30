package qm;

/* loaded from: classes11.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public qm.b f364667a = new qm.b();

    /* renamed from: b, reason: collision with root package name */
    public qm.c f364668b = new qm.c();

    /* renamed from: c, reason: collision with root package name */
    public qm.d f364669c = new qm.d();

    /* renamed from: d, reason: collision with root package name */
    public qm.a0 f364670d = new qm.a0();

    /* renamed from: e, reason: collision with root package name */
    public qm.a f364671e = new qm.a();

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f364672f;

    /* renamed from: g, reason: collision with root package name */
    public int f364673g;

    /* renamed from: h, reason: collision with root package name */
    public int f364674h;

    /* renamed from: i, reason: collision with root package name */
    public int f364675i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364676j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f364677k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364678l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f364679m;

    public z(android.content.Context context) {
        this.f364672f = context;
    }

    public static java.lang.String a(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        java.lang.String str = "";
        for (long j17 : jArr) {
            str = str + java.lang.String.valueOf(j17) + ",";
        }
        return str.isEmpty() ? str : str.substring(0, str.length() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap b(android.content.Context r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.z.b(android.content.Context, java.lang.String, java.lang.String):android.graphics.Bitmap");
    }

    public int c() {
        if (this.f364675i == -1) {
            this.f364675i = ip.l.b();
        }
        return this.f364675i;
    }

    public int d() {
        if (this.f364674h == -1) {
            this.f364674h = ip.l.c();
        }
        return this.f364674h;
    }
}
