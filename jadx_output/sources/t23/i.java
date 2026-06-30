package t23;

/* loaded from: classes10.dex */
public class i extends t23.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f415173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415174e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f415175f;

    /* renamed from: g, reason: collision with root package name */
    public final long f415176g;

    /* renamed from: h, reason: collision with root package name */
    public final t23.j2 f415177h;

    /* renamed from: i, reason: collision with root package name */
    public final int f415178i;

    /* renamed from: m, reason: collision with root package name */
    public final long f415179m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f415180n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f415181o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f415182p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t23.j f415183q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t23.j jVar, java.lang.String str, int i17, java.lang.String str2, long j17, t23.j2 j2Var, int i18, long j18) {
        super(jVar);
        this.f415183q = jVar;
        this.f415173d = str;
        this.f415174e = i17;
        this.f415175f = str2;
        this.f415176g = j17;
        this.f415177h = j2Var;
        this.f415178i = i18;
        this.f415179m = j18;
        this.f415180n = j33.d0.d(str, j2Var, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b2  */
    @Override // com.tencent.mm.sdk.platformtools.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.i.a():boolean");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t23.i)) {
            return false;
        }
        t23.i iVar = (t23.i) obj;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f415173d;
        if (str == null) {
            str = "";
        }
        return str.equals(iVar.f415173d);
    }

    public int hashCode() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f415173d;
        if (str == null) {
            str = "";
        }
        return str.hashCode();
    }
}
