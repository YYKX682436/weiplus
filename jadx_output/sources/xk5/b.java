package xk5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f455067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f455069c;

    /* renamed from: d, reason: collision with root package name */
    public final int f455070d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f455071e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f455072f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f455073g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f455074h;

    /* renamed from: i, reason: collision with root package name */
    public final xk5.a f455075i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f455076j;

    public b(int i17, int i18, int i19, int i27, java.lang.Integer num, boolean z17, boolean z18, java.lang.Integer num2, xk5.a aVar, java.lang.String str) {
        this.f455067a = i17;
        this.f455068b = i18;
        this.f455069c = i19;
        this.f455070d = i27;
        this.f455071e = num;
        this.f455072f = z17;
        this.f455073g = z18;
        this.f455074h = num2;
        this.f455075i = aVar;
        this.f455076j = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WSI(systemUIVisibility=");
        sb6.append((java.lang.Object) jz5.u.a(this.f455067a));
        sb6.append(", windowFlags=");
        sb6.append((java.lang.Object) jz5.u.a(this.f455068b));
        sb6.append(", statusBarColor=");
        sb6.append((java.lang.Object) jz5.u.a(this.f455069c));
        sb6.append(", navigationBarColor=");
        sb6.append((java.lang.Object) jz5.u.a(this.f455070d));
        sb6.append(", systemBarsAppearance=");
        java.lang.Integer num = this.f455071e;
        sb6.append(num != null ? new jz5.u(num.intValue()) : null);
        sb6.append(" isAppearanceLightStatusBars:");
        sb6.append(this.f455072f);
        sb6.append(" isAppearanceLightNavigationBars:");
        sb6.append(this.f455073g);
        sb6.append(" colorMode:");
        sb6.append(this.f455074h);
        sb6.append(" viewRootImplWindowInfo:");
        sb6.append(this.f455075i);
        sb6.append(" viewRootImplWAInfoStr:");
        sb6.append(this.f455076j);
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ b(int i17, int i18, int i19, int i27, java.lang.Integer num, boolean z17, boolean z18, java.lang.Integer num2, xk5.a aVar, java.lang.String str, int i28, kotlin.jvm.internal.i iVar) {
        this((i28 & 1) != 0 ? 0 : i17, (i28 & 2) != 0 ? 0 : i18, (i28 & 4) != 0 ? 0 : i19, (i28 & 8) != 0 ? 0 : i27, (i28 & 16) != 0 ? null : num, (i28 & 32) != 0 ? false : z17, (i28 & 64) == 0 ? z18 : false, (i28 & 128) != 0 ? null : num2, (i28 & 256) != 0 ? null : aVar, (i28 & 512) == 0 ? str : null);
    }
}
