package u84;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f425584a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f425585b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f425586c;

    /* renamed from: d, reason: collision with root package name */
    public s34.g1 f425587d;

    /* renamed from: e, reason: collision with root package name */
    public u84.b f425588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f425589f;

    /* renamed from: g, reason: collision with root package name */
    public s34.g1 f425590g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f425591h;

    /* renamed from: i, reason: collision with root package name */
    public s34.g1 f425592i;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f425583k = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(u84.m0.class, "normalIconImage", "getNormalIconImage()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(u84.m0.class, "normalIconImageDark", "getNormalIconImageDark()Ljava/lang/String;", 0))};

    /* renamed from: j, reason: collision with root package name */
    public static final u84.l0 f425582j = new u84.l0(null);

    public m0() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f425584a = new com.tencent.mm.plugin.sns.storage.r0();
        this.f425585b = new com.tencent.mm.plugin.sns.storage.r0();
    }

    public static final u84.m0 b(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
        f425582j.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo$Companion");
        u84.b bVar = null;
        r5 = null;
        r5 = null;
        u84.m0 m0Var = null;
        bVar = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo$Companion");
        } else if (map.containsKey(str)) {
            u84.m0 m0Var2 = new u84.m0();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".normalIconImage"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNormalIconImage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            com.tencent.mm.plugin.sns.storage.h1 h1Var = m0Var2.f425584a;
            f06.v[] vVarArr = f425583k;
            ((com.tencent.mm.plugin.sns.storage.r0) h1Var).b(m0Var2, vVarArr[0], str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalIconImage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".normalIconImageDark"));
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNormalIconImageDark", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            ((com.tencent.mm.plugin.sns.storage.r0) m0Var2.f425585b).b(m0Var2, vVarArr[1], str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalIconImageDark", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".normalTitle"));
            if (str4 == null) {
                str4 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNormalTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            m0Var2.f425586c = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            s34.f1 f1Var = s34.g1.f402646c;
            s34.g1 a17 = f1Var.a(map, str.concat(".normalTitleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNormalTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            m0Var2.f425587d = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            u84.a aVar = u84.b.f425499d;
            java.lang.String concat = str.concat(".activeIconPag");
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag$Companion");
            if (concat == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag$Companion");
            } else if (map.containsKey(concat)) {
                bVar = new u84.b();
                java.lang.String str5 = (java.lang.String) map.get(concat.concat(".pagUrl"));
                if (str5 == null) {
                    str5 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                com.tencent.mm.plugin.sns.storage.h1 h1Var2 = bVar.f425501a;
                f06.v[] vVarArr2 = u84.b.f425500e;
                ((com.tencent.mm.plugin.sns.storage.t0) h1Var2).b(bVar, vVarArr2[0], str5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                java.lang.String str6 = (java.lang.String) map.get(concat.concat(".pagMD5"));
                if (str6 == null) {
                    str6 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                bVar.f425502b = str6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                java.lang.String str7 = (java.lang.String) map.get(concat.concat(".width"));
                if (str7 != null && (h18 = r26.h0.h(str7)) != null) {
                    h18.intValue();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                java.lang.String str8 = (java.lang.String) map.get(concat.concat(".height"));
                if (str8 != null && (h17 = r26.h0.h(str8)) != null) {
                    h17.intValue();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeight", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                java.lang.String str9 = (java.lang.String) map.get(concat.concat(".pagThumbUrl"));
                if (str9 == null) {
                    str9 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                ((com.tencent.mm.plugin.sns.storage.r0) bVar.f425503c).b(bVar, vVarArr2[1], str9);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag$Companion");
            } else {
                com.tencent.mars.xlog.Log.i("ActiveIconPag", "this activeIconPag has not pag info");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ActiveIconPag$Companion");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActiveIconPag", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            m0Var2.f425588e = bVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActiveIconPag", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".activeTitle"));
            if (str10 == null) {
                str10 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActiveTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            m0Var2.f425589f = str10;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActiveTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".activeTitleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActiveTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            m0Var2.f425590g = a18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActiveTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            java.lang.String str11 = (java.lang.String) map.get(str.concat(".desc"));
            java.lang.String str12 = str11 != null ? str11 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            m0Var2.f425591h = str12;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            s34.g1 a19 = f1Var.a(map, str.concat(".descColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDescColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            m0Var2.f425592i = a19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDescColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo$Companion");
            m0Var = m0Var2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
        return m0Var;
    }

    public final u84.b a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActiveIconPag", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
        u84.b bVar = this.f425588e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActiveIconPag", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionTagInfo");
        return bVar;
    }
}
