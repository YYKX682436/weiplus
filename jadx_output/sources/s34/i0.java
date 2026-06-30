package s34;

/* loaded from: classes4.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402659a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402660b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402661c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402662d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f402663e;

    /* renamed from: f, reason: collision with root package name */
    public float f402664f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f402665g;

    /* renamed from: h, reason: collision with root package name */
    public int f402666h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jj4 f402667i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f402668j;

    public static s34.i0 b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".media.id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
        try {
            s34.i0 i0Var = new s34.i0();
            java.lang.String str4 = (java.lang.String) map.get(str + ".avatar");
            if (str4 == null) {
                str4 = "";
            }
            i0Var.f402659a = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".nickname");
            if (str5 == null) {
                str5 = "";
            }
            i0Var.f402660b = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".tag");
            if (str6 == null) {
                str6 = "";
            }
            i0Var.f402661c = str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".desc");
            if (str7 == null) {
                str7 = "";
            }
            i0Var.f402662d = str7;
            java.lang.String str8 = (java.lang.String) map.get(str + ".barBgColor");
            if (str8 == null) {
                str8 = "";
            }
            i0Var.f402663e = str8;
            i0Var.f402664f = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".barBgAlpha"));
            java.lang.String str9 = (java.lang.String) map.get(str + ".duration");
            if (str9 == null) {
                str9 = "";
            }
            i0Var.f402665g = str9;
            r45.jj4 c17 = c(map, str + ".media");
            i0Var.f402667i = c17;
            i0Var.f402666h = c17.f377856e == 6 ? 1 : 0;
            java.lang.String str10 = (java.lang.String) map.get(str + ".finderType");
            if (str10 != null) {
                str3 = str10;
            }
            i0Var.f402668j = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return i0Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdFinderTopicResInfo", "parse AdFinderTopicResInfo error " + th6.getMessage());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
    }

    public static r45.jj4 c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        r45.jj4 jj4Var = new r45.jj4();
        java.lang.String str2 = (java.lang.String) map.get(str + ".id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        jj4Var.f377855d = str2;
        jj4Var.N = true;
        jj4Var.f377856e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".type"), 0);
        jj4Var.f377873v = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".subtype"), 0);
        java.lang.String str3 = (java.lang.String) map.get(str + ".url");
        if (str3 == null) {
            str3 = "";
        }
        jj4Var.f377858g = str3;
        jj4Var.f377859h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".url.$type"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".url.$md5");
        if (str4 == null) {
            str4 = "";
        }
        jj4Var.f377878y = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".thumb");
        jj4Var.f377860i = str5 != null ? str5 : "";
        jj4Var.f377862m = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".thumb.$type"), 0);
        r45.lj4 lj4Var = new r45.lj4();
        jj4Var.f377865p = lj4Var;
        lj4Var.f379521e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".size.$height"), 0);
        jj4Var.f377865p.f379520d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".size.$width"), 0);
        jj4Var.f377865p.f379522f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".size.$totalSize"), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        return jj4Var;
    }

    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        boolean z17 = this.f402666h == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        return z17;
    }
}
