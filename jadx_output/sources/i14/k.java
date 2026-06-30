package i14;

/* loaded from: classes8.dex */
public final class k extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f287331q;

    /* renamed from: r, reason: collision with root package name */
    public wd0.x1 f287332r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f287333s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f287334t;

    /* renamed from: u, reason: collision with root package name */
    public final i14.i f287335u;

    /* renamed from: v, reason: collision with root package name */
    public final i14.j f287336v;

    public k(int i17, int i18) {
        super(22, i17);
        this.f287335u = new i14.i(this);
        this.f287336v = new i14.j(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... extraData) {
        vd0.c3 c3Var;
        wd0.w1 aj6;
        java.util.Map map;
        kotlin.jvm.internal.o.g(extraData, "extraData");
        java.util.Arrays.copyOf(extraData, extraData.length);
        p13.r rVar = this.f423762e;
        vd0.z2 z2Var = null;
        java.lang.String str = rVar != null ? rVar.f351130b : null;
        if (str == null) {
            return;
        }
        wd0.y1 y1Var = (wd0.y1) i95.n0.c(wd0.y1.class);
        p13.y yVar = this.f287331q;
        java.lang.String valueOf = java.lang.String.valueOf(yVar != null ? yVar.f351187e : null);
        vd0.l3 l3Var = (vd0.l3) y1Var;
        l3Var.getClass();
        synchronized (l3Var.f435460d) {
            l3Var.Zi();
            vd0.y2 Ni = l3Var.Ni("");
            c3Var = Ni != null ? Ni.f435542b : null;
        }
        if (c3Var != null && (map = c3Var.f435383c) != null) {
            z2Var = (vd0.z2) map.get(valueOf);
        }
        if (c3Var == null || z2Var == null) {
            throw new java.lang.IllegalArgumentException("setting result not found: itemKey=".concat(valueOf));
        }
        java.lang.Boolean bool = (java.lang.Boolean) c3Var.f435384d.get(valueOf);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (r26.n0.N(str)) {
            aj6 = wd0.w1.f444771d;
        } else {
            java.lang.String lowerCase = r26.n0.u0(str).toString().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            aj6 = l3Var.aj(z2Var, lowerCase);
            if (aj6 == null) {
                aj6 = wd0.w1.f444771d;
            }
        }
        wd0.x1 bj6 = l3Var.bj(z2Var, aj6, booleanValue);
        this.f287332r = bj6;
        jz5.l Vi = ((vd0.l3) ((wd0.y1) i95.n0.c(wd0.y1.class))).Vi(bj6, str);
        this.f287333s = (java.lang.CharSequence) Vi.f302833d;
        this.f287334t = (java.lang.CharSequence) Vi.f302834e;
        kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.fts.FTSSettingSearchDataItem.FTSSettingSearchViewHolder");
        i14.i iVar = (i14.i) eVar;
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        android.view.View view = iVar.f287327a;
        boolean z17 = this.f423761d;
        ((s50.r0) yVar2).getClass();
        com.tencent.mm.plugin.fts.ui.n3.j(view, z17);
        com.tencent.mm.plugin.fts.ui.n3.a(this.f287333s, iVar.f287328b);
        if (this.f287334t != null) {
            android.widget.TextView textView = iVar.f287329c;
            if (textView != null) {
                textView.setVisibility(0);
            }
            com.tencent.mm.plugin.fts.ui.n3.a(this.f287334t, iVar.f287329c);
            return;
        }
        android.widget.TextView textView2 = iVar.f287329c;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // u13.g
    public java.lang.String f() {
        wd0.x1 x1Var = this.f287332r;
        if (x1Var == null) {
            return null;
        }
        kotlin.jvm.internal.o.d(x1Var);
        return x1Var.f444778a;
    }

    @Override // u13.g
    public int j() {
        p13.y yVar = this.f287331q;
        kotlin.jvm.internal.o.d(yVar);
        return yVar.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f287336v;
    }
}
