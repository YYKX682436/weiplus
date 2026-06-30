package v74;

/* loaded from: classes4.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final r45.jj4 a(java.util.Map values, java.lang.String prefix, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        r45.jj4 jj4Var = new r45.jj4();
        java.lang.String str = (java.lang.String) values.get(prefix.concat(".id"));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        jj4Var.f377855d = "SlideFullCardAd_".concat(str);
        jj4Var.N = true;
        jj4Var.f377856e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(prefix.concat(".type")), 0);
        jj4Var.f377873v = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(prefix.concat(".subtype")), 0);
        java.lang.String str2 = (java.lang.String) values.get(prefix.concat(".url"));
        if (str2 == null) {
            str2 = "";
        }
        jj4Var.f377858g = str2;
        jj4Var.f377859h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(prefix.concat(".url.$type")), 0);
        java.lang.String str3 = (java.lang.String) values.get(prefix.concat(".url.$md5"));
        if (str3 == null) {
            str3 = "";
        }
        jj4Var.f377878y = str3;
        java.lang.String str4 = (java.lang.String) values.get(prefix.concat(".thumb"));
        jj4Var.f377860i = str4 != null ? str4 : "";
        jj4Var.f377862m = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(prefix.concat(".thumb.$type")), 0);
        jj4Var.R = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) values.get(prefix.concat(".videoDuration")));
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f379521e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(prefix.concat(".size.$height")), 0);
        lj4Var.f379520d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(prefix.concat(".size.$width")), 0);
        lj4Var.f379522f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(prefix.concat(".size.$totalSize")), 0);
        jj4Var.f377865p = lj4Var;
        jj4Var.Y = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        return jj4Var;
    }
}
