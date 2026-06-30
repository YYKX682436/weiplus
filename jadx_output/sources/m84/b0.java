package m84;

/* loaded from: classes4.dex */
public final class b0 {
    public b0(kotlin.jvm.internal.i iVar) {
    }

    public final m84.c0 a(java.util.Map values, java.lang.String prefKey) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        java.lang.Integer h27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
            return null;
        }
        if (!values.containsKey(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
            return null;
        }
        m84.c0 c0Var = new m84.c0();
        java.lang.String str = (java.lang.String) values.get(prefKey.concat(".width"));
        int i17 = 0;
        c0Var.f324765a = (str == null || (h27 = r26.h0.h(str)) == null) ? 0 : h27.intValue();
        java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".height"));
        c0Var.f324766b = (str2 == null || (h19 = r26.h0.h(str2)) == null) ? 0 : h19.intValue();
        java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".marginLeft"));
        c0Var.f324767c = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
        java.lang.String str4 = (java.lang.String) values.get(prefKey.concat(".marginTop"));
        if (str4 != null && (h17 = r26.h0.h(str4)) != null) {
            i17 = h17.intValue();
        }
        c0Var.f324768d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
        return c0Var;
    }
}
