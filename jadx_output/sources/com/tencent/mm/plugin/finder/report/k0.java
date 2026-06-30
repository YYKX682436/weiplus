package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.k0 f125092a = new com.tencent.mm.plugin.finder.report.k0();

    public final void a(android.content.Context context, java.lang.String toPage) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(toPage, "toPage");
        com.tencent.mm.autogen.mmdata.rpt.FinderPageEnterStatStruct finderPageEnterStatStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPageEnterStatStruct();
        finderPageEnterStatStruct.f57461h = 1L;
        finderPageEnterStatStruct.f57457d = finderPageEnterStatStruct.b("ToPage", toPage, true);
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zy2.ra raVar = (zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).d(zy2.ra.class);
        r45.qt2 V6 = raVar != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) raVar).V6() : null;
        if (V6 == null || (str = V6.getString(1)) == null) {
            str = "";
        }
        finderPageEnterStatStruct.f57460g = finderPageEnterStatStruct.b("ContextId", str, true);
        finderPageEnterStatStruct.f57459f = V6 != null ? V6.getInteger(5) : 0;
        finderPageEnterStatStruct.f57458e = finderPageEnterStatStruct.b("FromUI", context.getClass().getSimpleName(), true);
        finderPageEnterStatStruct.k();
        java.lang.String n17 = finderPageEnterStatStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("FinderEnterImportantPageStat", "report29492 info:".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
    }
}
