package m84;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f324804a;

    /* renamed from: b, reason: collision with root package name */
    public int f324805b;

    /* renamed from: c, reason: collision with root package name */
    public int f324806c;

    /* renamed from: d, reason: collision with root package name */
    public mb4.e f324807d;

    /* renamed from: e, reason: collision with root package name */
    public mb4.e f324808e;

    /* renamed from: f, reason: collision with root package name */
    public mb4.e f324809f;

    /* renamed from: g, reason: collision with root package name */
    public mb4.e f324810g;

    /* renamed from: h, reason: collision with root package name */
    public mb4.e f324811h;

    /* renamed from: i, reason: collision with root package name */
    public mb4.e f324812i;

    /* renamed from: j, reason: collision with root package name */
    public m84.c0 f324813j;

    /* renamed from: k, reason: collision with root package name */
    public m84.c0 f324814k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f324815l = kz5.p0.f313996d;

    /* renamed from: m, reason: collision with root package name */
    public m84.c0 f324816m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f324817n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f324818o;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f324803q = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(m84.w.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final m84.v f324802p = new m84.v(null);

    public w() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f324817n = new com.tencent.mm.plugin.sns.storage.k0();
        this.f324818o = "";
    }

    public static final m84.w d(java.util.Map values, java.lang.String prefKey) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        m84.v vVar = f324802p;
        vVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        m84.w wVar = null;
        wVar = null;
        if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            m84.w wVar2 = new m84.w();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".containerWidth"));
            wVar2.f324804a = (str == null || (h19 = r26.h0.h(str)) == null) ? 0 : h19.intValue();
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".containerHeight"));
            wVar2.f324805b = (str2 == null || (h18 = r26.h0.h(str2)) == null) ? 0 : h18.intValue();
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".bottomOffset"));
            wVar2.f324806c = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue();
            mb4.d dVar = mb4.e.f325395f;
            wVar2.f324807d = dVar.a(values, prefKey.concat(".stageOnePagInfo"));
            wVar2.f324808e = dVar.a(values, prefKey.concat(".stageOnePagDarkInfo"));
            wVar2.f324809f = dVar.a(values, prefKey.concat(".stageTwoPagInfo"));
            wVar2.f324810g = dVar.a(values, prefKey.concat(".stageTwoPagDarkInfo"));
            wVar2.f324811h = dVar.a(values, prefKey.concat(".stageFourPagInfo"));
            wVar2.f324812i = dVar.a(values, prefKey.concat(".stageFourPagDarkInfo"));
            m84.b0 b0Var = m84.c0.f324764e;
            wVar2.f324813j = b0Var.a(values, prefKey.concat(".avatarHotZone"));
            wVar2.f324814k = b0Var.a(values, prefKey.concat(".descHotZone"));
            java.lang.String concat = prefKey.concat(".optionHotZones");
            vVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseOptionHotZones", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            do {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(concat);
                sb6.append(".optionHotZone");
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String sb7 = sb6.toString();
                if (!values.containsKey(sb7)) {
                    break;
                }
                m84.c0 a17 = b0Var.a(values, sb7);
                if (a17 != null && a17.a()) {
                    arrayList.add(a17);
                }
                i17++;
            } while (arrayList.size() < 4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseOptionHotZones", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
            wVar2.f324815l = arrayList;
            m84.c0 a18 = b0Var.a(values, prefKey.concat(".stageOneHotZone"));
            if (a18 == null || !java.lang.Boolean.valueOf(a18.a()).booleanValue()) {
                a18 = null;
            }
            wVar2.f324816m = a18;
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = values.containsKey(prefKey.concat(".clickActionInfo")) ? com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(values, prefKey.concat(".clickActionInfo")) : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            ((com.tencent.mm.plugin.sns.storage.k0) wVar2.f324817n).b(wVar2, f324803q[0], f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
            wVar = wVar2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return wVar;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) this.f324817n).a(this, f324803q[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return adClickActionInfo;
    }

    public final boolean b(mb4.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStageInfoValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        if (eVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStageInfoValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(eVar.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStageInfoValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return z17;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        if (this.f324804a <= 0 || this.f324805b <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        if (this.f324806c < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        boolean b17 = b(this.f324809f);
        boolean b18 = b(this.f324811h);
        if (!b17 && !b18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        m84.c0 c0Var = this.f324813j;
        if (!(c0Var != null && c0Var.a())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        if (this.f324815l.size() < 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return true;
    }
}
