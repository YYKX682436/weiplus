package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f154334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f154336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.w1 f154337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f154338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154339i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(int i17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, boolean z17, com.tencent.wechat.iam.biz.w1 w1Var, boolean z18, com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154334d = i17;
        this.f154335e = m0Var;
        this.f154336f = z17;
        this.f154337g = w1Var;
        this.f154338h = z18;
        this.f154339i = contactWidgetTabBizInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.tab.g6(this.f154334d, this.f154335e, this.f154336f, this.f154337g, this.f154338h, this.f154339i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.tab.g6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        java.lang.String d17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f154334d;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154335e;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: current identity=" + i17 + ", not WX");
            m0Var.h();
            return f0Var;
        }
        if (!this.f154336f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: scene disabled");
            m0Var.h();
            return f0Var;
        }
        com.tencent.wechat.iam.biz.w1 w1Var = this.f154337g;
        if (w1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: wording nil/parse-fail");
            m0Var.h();
            return f0Var;
        }
        boolean[] zArr = w1Var.f217804f;
        boolean z17 = this.f154338h;
        if (z17) {
            if (zArr[2]) {
                str = w1Var.f217803e;
            }
            str = "";
        } else {
            if (zArr[1]) {
                str = w1Var.f217802d;
            }
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] hidden: ");
            sb6.append(z17 ? com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH : "register");
            sb6.append(" wording empty");
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
            m0Var.h();
            return f0Var;
        }
        if (!z17 && !((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).wi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: no photo account and cannot register");
            m0Var.h();
            return f0Var;
        }
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f154339i;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var2 = contactWidgetTabBizInfo.f154220y;
        if (m0Var2 != null) {
            com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
            if (z17) {
                java.lang.String str3 = zArr[2] ? w1Var.f217803e : "";
                str2 = str3 != null ? str3 : "";
                string = contactInfoUI.getString(com.tencent.mm.R.string.o7o);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else {
                java.lang.String str4 = zArr[1] ? w1Var.f217802d : "";
                str2 = str4 != null ? str4 : "";
                string = contactInfoUI.getString(com.tencent.mm.R.string.o7n);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
            com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = m0Var2.f154464s;
            if (s4Var != null) {
                s4Var.f154568l0 = true;
                java.lang.Object value = ((jz5.n) s4Var.f154564j0).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((android.widget.TextView) value).setText(str2);
                java.lang.Object value2 = ((jz5.n) s4Var.f154566k0).getValue();
                kotlin.jvm.internal.o.f(value2, "getValue(...)");
                ((android.widget.TextView) value2).setText(string);
                java.lang.Object value3 = ((jz5.n) s4Var.f154562i0).getValue();
                kotlin.jvm.internal.o.f(value3, "getValue(...)");
                android.view.View view = (android.view.View) value3;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "showPhotoAccountGuideCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "showPhotoAccountGuideCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[PhotoAccountGuide] show guide card, biz=");
            com.tencent.mm.storage.z3 z3Var = contactWidgetTabBizInfo.f154206n;
            sb7.append(z3Var != null ? z3Var.d1() : null);
            sb7.append(", hasPhoto=");
            sb7.append(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb7.toString());
            com.tencent.mm.storage.z3 z3Var2 = contactWidgetTabBizInfo.f154206n;
            if (z3Var2 != null && (d17 = z3Var2.d1()) != null) {
                gr3.e.d(d17, z17 ? 2802 : 2800, contactWidgetTabBizInfo.f154201g, contactInfoUI.getIntent(), contactWidgetTabBizInfo.Z, contactWidgetTabBizInfo.f154208p, 0, null, null, null, 0, 0, 4032, null);
            }
        }
        return f0Var;
    }
}
