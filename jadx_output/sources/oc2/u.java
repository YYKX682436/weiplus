package oc2;

/* loaded from: classes8.dex */
public final class u implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f344273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f344274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344275c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f344277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f344278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f344279g;

    public u(kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        this.f344273a = g0Var;
        this.f344274b = g0Var2;
        this.f344275c = str;
        this.f344276d = str2;
        this.f344277e = h0Var;
        this.f344278f = jbVar;
        this.f344279g = f03Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        kotlin.jvm.internal.g0 g0Var = this.f344273a;
        long j17 = g0Var.f310121d;
        long j18 = 0;
        if (j17 > 0) {
            long j19 = this.f344274b.f310121d;
            j18 = j19 > 0 ? j19 - j17 : android.os.SystemClock.elapsedRealtime() - g0Var.f310121d;
        }
        kotlin.jvm.internal.h0 h0Var = this.f344277e;
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "DSL红点图片下载失败上报开关", e42.c0.clicfg_finder_dsl_reddot_render_load_pic_fail_report_switch, java.lang.Boolean.TRUE, false, com.tencent.mm.plugin.finder.storage.wd0.f128247d, 8, null)).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyImageLoadResult url=");
        java.lang.String url = this.f344276d;
        sb6.append(url);
        sb6.append(" (");
        sb6.append((java.lang.String) h0Var.f310123d);
        sb6.append(") fail timeCost=");
        sb6.append(j18);
        sb6.append(",reportFail=");
        sb6.append(booleanValue);
        com.tencent.mars.xlog.Log.e(this.f344275c, sb6.toString());
        if (booleanValue) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            java.lang.String field_tips_uuid = this.f344278f.field_tips_uuid;
            kotlin.jvm.internal.o.f(field_tips_uuid, "field_tips_uuid");
            java.lang.String str = this.f344279g.f373892i;
            if (str == null) {
                str = "";
            }
            int i17 = (int) j18;
            kotlin.jvm.internal.o.g(url, "url");
            com.tencent.mm.autogen.mmdata.rpt.FinderRedDotImageLoadFailStruct finderRedDotImageLoadFailStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRedDotImageLoadFailStruct();
            finderRedDotImageLoadFailStruct.f57696d = finderRedDotImageLoadFailStruct.b("redDotPath", str, true);
            finderRedDotImageLoadFailStruct.f57697e = finderRedDotImageLoadFailStruct.b("redDotTipsUuid", field_tips_uuid, true);
            finderRedDotImageLoadFailStruct.f57698f = finderRedDotImageLoadFailStruct.b("loadFailUrl", url, true);
            finderRedDotImageLoadFailStruct.f57699g = i17;
            finderRedDotImageLoadFailStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderRedDotImageLoadFailStruct);
        }
    }
}
