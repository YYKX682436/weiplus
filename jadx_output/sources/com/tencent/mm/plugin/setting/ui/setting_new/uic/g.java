package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes4.dex */
public final class g extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f161994d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f161995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161994d = "";
        jz5.h.b(com.tencent.mm.plugin.setting.ui.setting_new.uic.f.f161993d);
        this.f161995e = new java.util.HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r26.n0.B(r6, r0, false) != false) goto L9;
     */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            gm0.m r6 = gm0.j1.b()
            gm0.j r6 = r6.d()
            gm0.j r0 = gm0.j.WeiXin
            java.lang.String r1 = "getExpt(...)"
            r2 = 1
            java.lang.Class<e42.e0> r3 = e42.e0.class
            if (r6 != r0) goto L27
            i95.m r6 = i95.n0.c(r3)
            e42.e0 r6 = (e42.e0) r6
            e42.d0 r0 = e42.d0.clicfg_cn_admanage_url_android
            h62.d r6 = (h62.d) r6
            java.lang.String r3 = "https://ads.privacy.qq.com/ads/wxoptout.html?media_source=101001"
            java.lang.String r6 = r6.Zi(r0, r3, r2)
            kotlin.jvm.internal.o.f(r6, r1)
            r5.f161994d = r6
            goto L81
        L27:
            i95.m r6 = i95.n0.c(r3)
            e42.e0 r6 = (e42.e0) r6
            e42.d0 r0 = e42.d0.clicfg_oversea_admanage_url_android
            h62.d r6 = (h62.d) r6
            java.lang.String r4 = ""
            java.lang.String r6 = r6.Zi(r0, r4, r2)
            kotlin.jvm.internal.o.f(r6, r1)
            r5.f161994d = r6
            i95.m r6 = i95.n0.c(r3)
            e42.e0 r6 = (e42.e0) r6
            e42.d0 r0 = e42.d0.clicfg_oversea_admanage_close_country_android
            h62.d r6 = (h62.d) r6
            java.lang.String r6 = r6.Zi(r0, r4, r2)
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            r1 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r0 = r0.u(r1, r4)
            java.lang.String r1 = r5.f161994d
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L7f
            kotlin.jvm.internal.o.d(r6)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.o.f(r6, r1)
            kotlin.jvm.internal.o.d(r0)
            java.lang.String r0 = r0.toLowerCase()
            kotlin.jvm.internal.o.f(r0, r1)
            r1 = 0
            boolean r6 = r26.n0.B(r6, r0, r1)
            if (r6 == 0) goto L81
        L7f:
            r5.f161994d = r4
        L81:
            java.lang.String r6 = r5.f161994d
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r6 != 0) goto Lb2
            java.lang.String r6 = r5.f161994d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lang="
            r0.<init>(r1)
            android.app.Activity r1 = r5.getContext()
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.m2.f(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r6 = com.tencent.mm.ui.tools.qd.a(r6, r0)
            java.lang.String r0 = "safelyUrlConcatParam(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            r5.f161994d = r6
        Lb2:
            java.lang.String r6 = r5.f161994d
            java.util.HashMap r0 = r5.f161995e
            java.lang.String r1 = "ADMGRURL_KEY"
            r0.put(r1, r6)
            com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct
            r6.<init>()
            r0 = 2
            r6.f61522d = r0
            r6.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting_new.uic.g.onCreate(android.os.Bundle):void");
    }
}
