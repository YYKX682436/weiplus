package eb2;

/* loaded from: classes2.dex */
public final class b0 extends td2.b {

    /* renamed from: g, reason: collision with root package name */
    public final int f250715g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f250716h;

    /* renamed from: i, reason: collision with root package name */
    public final eb2.w f250717i;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f250719n;

    /* renamed from: m, reason: collision with root package name */
    public final im5.c f250718m = new im5.c();

    /* renamed from: o, reason: collision with root package name */
    public boolean f250720o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f250721p = true;

    public b0(int i17, r45.qt2 qt2Var) {
        this.f250715g = i17;
        this.f250716h = qt2Var;
        this.f250717i = new eb2.w(i17);
    }

    public static void E0(eb2.b0 b0Var, db2.u3 u3Var, boolean z17, int i17, java.util.List list, boolean z18, boolean z19, db2.v3 v3Var, int i18, java.lang.Object obj) {
        boolean z27 = (i18 & 2) != 0 ? false : z17;
        java.util.List list2 = (i18 & 8) != 0 ? null : list;
        boolean z28 = (i18 & 16) != 0 ? false : z18;
        db2.v3 v3Var2 = (i18 & 64) != 0 ? null : v3Var;
        b0Var.getClass();
        new db2.w0(i17, b0Var.f250715g, new eb2.y(list2, b0Var, i17, z28, z27, u3Var), v3Var2, b0Var.f250717i.f250859c, false, b0Var.f250716h).l().f(b0Var.f250718m);
    }
}
