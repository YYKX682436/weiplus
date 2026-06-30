package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.d3 f124995a = new com.tencent.mm.plugin.finder.report.d3();

    public final void a(android.content.Context context, org.json.JSONObject udfKv, boolean z17, long j17, long j18, r45.qt2 qt2Var, java.lang.String extrainfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        kotlin.jvm.internal.o.g(extrainfo, "extrainfo");
        if (qt2Var == null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct finderPageExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderPageExposeStruct.w(Ri);
        java.lang.String string = qt2Var.getString(1);
        if (string == null) {
            string = "";
        }
        finderPageExposeStruct.s(string);
        java.lang.String string2 = qt2Var.getString(2);
        finderPageExposeStruct.p(string2 != null ? string2 : "");
        finderPageExposeStruct.v(java.lang.String.valueOf(qt2Var.getInteger(7)));
        finderPageExposeStruct.q("59");
        java.lang.String jSONObject = udfKv.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        finderPageExposeStruct.x(r26.i0.t(jSONObject, ",", ";", false));
        finderPageExposeStruct.f57465g = !z17 ? 1 : 0;
        if (j18 != -1) {
            finderPageExposeStruct.r(java.lang.String.valueOf(j18));
        } else {
            finderPageExposeStruct.r(java.lang.String.valueOf(c01.id.c()));
        }
        finderPageExposeStruct.f57471m = j17;
        if (extrainfo.length() > 0) {
            finderPageExposeStruct.f57473o = finderPageExposeStruct.b("extrainfo", extrainfo, true);
        }
        finderPageExposeStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPageExposeStruct);
    }
}
