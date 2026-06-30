package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p2 extends com.tencent.mm.plugin.finder.profile.uic.f6 {

    /* renamed from: r, reason: collision with root package name */
    public static final kk.l f124101r = new kk.l(100);

    /* renamed from: s, reason: collision with root package name */
    public static boolean f124102s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f124103t;

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f124104u;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f124105e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f124106f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f124107g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f124108h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f124109i;

    /* renamed from: m, reason: collision with root package name */
    public long f124110m;

    /* renamed from: n, reason: collision with root package name */
    public int f124111n;

    /* renamed from: o, reason: collision with root package name */
    public long f124112o;

    /* renamed from: p, reason: collision with root package name */
    public long f124113p;

    /* renamed from: q, reason: collision with root package name */
    public int f124114q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124105e = new java.util.HashMap();
        this.f124106f = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.m2(activity));
        this.f124107g = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.o2(activity));
        this.f124108h = "";
        this.f124109i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.n2(this));
    }

    public final void O6(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "cgi start, id: " + i17 + ", bizType: " + i18 + ", tabType: " + i19);
        this.f124105e.put(java.lang.Integer.valueOf(i17), new com.tencent.mm.plugin.finder.profile.uic.k2(i17, i18, i19, 0L, 0L, 0L, 0L, 0L, 0L, 0, null, null, 0, 0L, 0L, 32760, null));
    }

    public final boolean P6() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f124106f).getValue();
        kotlin.jvm.internal.o.f(str, "<get-exportUsername>(...)");
        return str.length() > 0;
    }

    public final void Q6(int i17, int i18, az2.g gVar) {
        java.lang.Integer num;
        java.util.HashMap hashMap;
        r45.xw xwVar;
        com.tencent.mm.plugin.finder.profile.uic.k2 k2Var = (com.tencent.mm.plugin.finder.profile.uic.k2) this.f124105e.get(java.lang.Integer.valueOf(i17));
        if (k2Var != null) {
            long c17 = c01.id.c();
            k2Var.f123873d = c17 - k2Var.f123883n;
            k2Var.f123882m = i18;
            k2Var.f123879j = 1;
            k2Var.f123884o = c17;
            if (gVar != null && (xwVar = gVar.f16131c) != null) {
                k2Var.f123874e = xwVar.f390538e - xwVar.f390537d;
                k2Var.f123876g = xwVar.f390540g - xwVar.f390539f;
                k2Var.f123875f = xwVar.f390542i - xwVar.f390541h;
                k2Var.f123877h = xwVar.f390544n - xwVar.f390543m;
                k2Var.f123878i = xwVar.f390546p - xwVar.f390545o;
            }
            k2Var.f123880k = gVar != null ? gVar.f16129a : null;
            k2Var.f123881l = gVar != null ? gVar.f16130b : null;
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
            if (finderProfileTabUIC == null || (hashMap = finderProfileTabUIC.C) == null || (num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(k2Var.f123872c))) == null) {
                num = -1;
            }
            if (num != null && num.intValue() == 0) {
                if (this.f124112o == 0) {
                    this.f124112o = c01.id.c() - this.f124110m;
                }
                this.f124113p = 1L;
            }
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "updateCgiInfoAfterCgi, id: " + i17 + ", totCost: " + k2Var.f123873d + ", ret: " + k2Var.f123882m);
        }
    }

    public final java.lang.String getUsername() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f124107g).getValue();
        return str.length() == 0 ? this.f124108h : str;
    }

    public final boolean isSelf() {
        return g92.b.f269769e.v(getUsername());
    }

    public final boolean isSelfFlag() {
        return ((java.lang.Boolean) ((jz5.n) this.f124109i).getValue()).booleanValue();
    }
}
