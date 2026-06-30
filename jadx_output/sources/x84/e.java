package x84;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f452586a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f452587b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f452588c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f452589d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f452585f = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(x84.e.class, "unreadStateImageUrl", "getUnreadStateImageUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(x84.e.class, "unreadStateDarkImageUrl", "getUnreadStateDarkImageUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(x84.e.class, "readStateImageUrl", "getReadStateImageUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(x84.e.class, "readStateDarkImageUrl", "getReadStateDarkImageUrl()Ljava/lang/String;", 0))};

    /* renamed from: e, reason: collision with root package name */
    public static final x84.d f452584e = new x84.d(null);

    public e() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f452586a = new com.tencent.mm.plugin.sns.storage.r0();
        this.f452587b = new com.tencent.mm.plugin.sns.storage.r0();
        this.f452588c = new com.tencent.mm.plugin.sns.storage.r0();
        this.f452589d = new com.tencent.mm.plugin.sns.storage.r0();
    }

    public static final x84.e a(java.util.Map values, java.lang.String prefKey) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
        f452584e.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        x84.e eVar = null;
        if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            eVar = new x84.e();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".unreadStateImageUrl"));
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            com.tencent.mm.plugin.sns.storage.h1 h1Var = eVar.f452586a;
            f06.v[] vVarArr = f452585f;
            ((com.tencent.mm.plugin.sns.storage.r0) h1Var).b(eVar, vVarArr[0], str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".unreadStateDarkImageUrl"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            ((com.tencent.mm.plugin.sns.storage.r0) eVar.f452587b).b(eVar, vVarArr[1], str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".readStateImageUrl"));
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            ((com.tencent.mm.plugin.sns.storage.r0) eVar.f452588c).b(eVar, vVarArr[2], str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str4 = (java.lang.String) values.get(prefKey.concat(".readStateDarkImageUrl"));
            java.lang.String str5 = str4 != null ? str4 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            ((com.tencent.mm.plugin.sns.storage.r0) eVar.f452589d).b(eVar, vVarArr[3], str5);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
        return eVar;
    }
}
