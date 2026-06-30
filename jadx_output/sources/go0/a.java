package go0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f273725a;

    /* renamed from: b, reason: collision with root package name */
    public int f273726b;

    /* renamed from: c, reason: collision with root package name */
    public is0.c f273727c;

    /* renamed from: d, reason: collision with root package name */
    public int f273728d;

    /* renamed from: e, reason: collision with root package name */
    public int f273729e;

    /* renamed from: f, reason: collision with root package name */
    public rh0.d0 f273730f;

    /* renamed from: g, reason: collision with root package name */
    public int f273731g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273732h;

    public a(boolean z17) {
        this.f273725a = z17;
    }

    public final void a(int i17) {
        if (i17 == 0) {
            rh0.d0 d0Var = this.f273730f;
            kotlin.jvm.internal.o.e(d0Var, "null cannot be cast to non-null type com.tencent.mm.feature.xlabeffect.api.IXLabEffectReport");
            com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct weVisionBaseDataStruct = ((p05.l4) ((rh0.e0) d0Var)).F;
            if (weVisionBaseDataStruct != null) {
                weVisionBaseDataStruct.f62924d = 3;
                return;
            }
            return;
        }
        if (i17 == 1) {
            rh0.d0 d0Var2 = this.f273730f;
            kotlin.jvm.internal.o.e(d0Var2, "null cannot be cast to non-null type com.tencent.mm.feature.xlabeffect.api.IXLabEffectReport");
            com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct weVisionBaseDataStruct2 = ((p05.l4) ((rh0.e0) d0Var2)).F;
            if (weVisionBaseDataStruct2 != null) {
                weVisionBaseDataStruct2.f62924d = 0;
                return;
            }
            return;
        }
        rh0.d0 d0Var3 = this.f273730f;
        kotlin.jvm.internal.o.e(d0Var3, "null cannot be cast to non-null type com.tencent.mm.feature.xlabeffect.api.IXLabEffectReport");
        com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct weVisionBaseDataStruct3 = ((p05.l4) ((rh0.e0) d0Var3)).F;
        if (weVisionBaseDataStruct3 != null) {
            weVisionBaseDataStruct3.f62924d = -1;
        }
    }

    public final void b() {
        lo0.a0 a0Var;
        java.util.List<lo0.k> list;
        lo0.t b17 = ko0.l.f309870a.b();
        if (b17 == null || (a0Var = b17.f320080e) == null || (list = a0Var.f319954e) == null) {
            return;
        }
        for (lo0.k kVar : list) {
            c(kVar, kVar.f320032o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(lo0.k r13, double r14) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.a.c(lo0.k, double):void");
    }
}
