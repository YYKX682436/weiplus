package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.g5 f125053a = new com.tencent.mm.plugin.finder.report.g5();

    /* renamed from: b, reason: collision with root package name */
    public static long f125054b;

    public final void a(androidx.appcompat.app.AppCompatActivity context, boolean z17) {
        java.lang.String str;
        java.lang.String string;
        if (z17 || f125054b > 0) {
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.tencent.mm.autogen.mmdata.rpt.FinderVstStruct finderVstStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderVstStruct();
            java.lang.String str2 = "";
            if (V6 == null || (str = V6.getString(0)) == null) {
                str = "";
            }
            finderVstStruct.f58081d = finderVstStruct.b("sessionid", str, true);
            if (V6 != null && (string = V6.getString(1)) != null) {
                str2 = string;
            }
            finderVstStruct.f58082e = finderVstStruct.b("contextid", str2, true);
            finderVstStruct.f58083f = finderVstStruct.b("event_id", z17 ? "1" : "2", true);
            finderVstStruct.f58084g = c01.id.c();
            finderVstStruct.f58085h = finderVstStruct.b("vst_type", "3", true);
            finderVstStruct.f58086i = (z17 || f125054b <= 0) ? 0L : c01.id.c() - f125054b;
            finderVstStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderVstStruct);
            if (z17) {
                return;
            }
            f125054b = 0L;
        }
    }
}
