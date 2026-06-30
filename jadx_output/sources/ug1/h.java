package ug1;

/* loaded from: classes7.dex */
public final class h extends ug1.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f427498f;

    /* renamed from: g, reason: collision with root package name */
    public final int f427499g;

    /* renamed from: h, reason: collision with root package name */
    public final int f427500h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f427501i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f427502j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer f427503k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f427504l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f427505m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f427506n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.p f427507o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f427508p;

    /* renamed from: q, reason: collision with root package name */
    public final int f427509q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.f f427510r;

    public h(java.lang.String str, int i17, int i18, java.lang.String str2, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.luggage.sdk.launching.p pVar, java.lang.String str6, int i19) {
        this.f427498f = str;
        this.f427499g = i17;
        this.f427500h = i18;
        this.f427501i = str2;
        this.f427502j = appBrandStatObject;
        this.f427503k = appBrandLaunchReferrer;
        this.f427504l = str3;
        this.f427505m = str4;
        this.f427506n = str5;
        this.f427507o = pVar;
        this.f427508p = str6;
        this.f427509q = i19;
    }

    @Override // af.b
    public int b() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    @Override // af.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c() {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.h.c():java.lang.Object");
    }

    @Override // ug1.a
    public void d(com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession) {
        r45.v54 v54Var;
        kotlin.jvm.internal.o.g(qualitySession, "qualitySession");
        if (this.f427510r == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct b17 = com.tencent.mm.plugin.appbrand.report.quality.u.b(qualitySession);
        java.lang.String str = b17.f62765e;
        if (str == null || str.length() == 0) {
            com.tencent.mm.modelbase.f fVar = this.f427510r;
            b17.f62765e = b17.b("AppId", (fVar == null || (v54Var = (r45.v54) fVar.f70618d) == null) ? null : v54Var.f387908m, true);
        }
        b17.f62777q = b17.b(dm.i4.COL_USERNAME, this.f427498f, true);
        b17.f62778r = 1L;
        b17.f62775o = com.tencent.mm.plugin.appbrand.report.quality.u.c();
        b17.f62779s = b17.b("NetworkTypeStr", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        b17.f62774n = cm.o0.sync;
        long j17 = this.f4438b;
        b17.f62771k = j17;
        long j18 = this.f4439c;
        b17.f62772l = j18;
        b17.f62769i = j18 - j17;
        b17.f62776p = 0L;
        com.tencent.mm.modelbase.f fVar2 = this.f427510r;
        kotlin.jvm.internal.o.d(fVar2);
        int i17 = fVar2.f70615a;
        com.tencent.mm.modelbase.f fVar3 = this.f427510r;
        kotlin.jvm.internal.o.d(fVar3);
        int i18 = fVar3.f70616b;
        com.tencent.mm.modelbase.f fVar4 = this.f427510r;
        kotlin.jvm.internal.o.d(fVar4);
        if (th1.a.a(i17, i18, fVar4.f70618d)) {
            com.tencent.mm.modelbase.f fVar5 = this.f427510r;
            kotlin.jvm.internal.o.d(fVar5);
            com.tencent.mm.protobuf.f fVar6 = fVar5.f70618d;
            kotlin.jvm.internal.o.d(fVar6);
            if (((r45.v54) fVar6).f387903e == null) {
                b17.f62773m = cm.p0.bundle_null;
            } else {
                com.tencent.mm.modelbase.f fVar7 = this.f427510r;
                kotlin.jvm.internal.o.d(fVar7);
                com.tencent.mm.protobuf.f fVar8 = fVar7.f70618d;
                kotlin.jvm.internal.o.d(fVar8);
                if (((r45.v54) fVar8).f387903e.f370425d == null) {
                    b17.f62773m = cm.p0.jsapi_control_bytes_null;
                } else {
                    b17.f62773m = cm.p0.ok;
                }
            }
        } else {
            b17.f62773m = cm.p0.common_fail;
        }
        b17.k();
    }

    @Override // af.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.modelbase.f a(int i17) {
        java.util.concurrent.FutureTask futureTask = this.f4437a;
        if (futureTask == null) {
            throw new java.lang.IllegalStateException();
        }
        if (futureTask.isDone()) {
            ug1.b.a(5);
        } else {
            ug1.b.a(6);
        }
        return (com.tencent.mm.modelbase.f) super.a(i17);
    }
}
